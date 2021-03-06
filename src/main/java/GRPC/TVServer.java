package GRPC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import org.DS.keithproject.SmartHomeGRPC.BooleanReq;
import org.DS.keithproject.SmartHomeGRPC.BooleanRes;
import org.DS.keithproject.SmartHomeGRPC.Empty;
import org.DS.keithproject.SmartHomeGRPC.StringRequest;
import org.DS.keithproject.SmartHomeGRPC.StringResponse;
import org.DS.keithproject.SmartHomeGRPC.speakerResp;
import org.DS.keithproject.SmartHomeGRPC.tvResp;
import org.DS.keithproject.SmartHomeGRPC.TvServiceGrpc.TvServiceImplBase;
import org.DS.keithproject.SmartHomeGRPC.valRequest;
import org.DS.keithproject.SmartHomeGRPC.valResponse;



import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import Models.TV;

public class TVServer extends TvServiceImplBase {
	
	 private static class SampleListener implements ServiceListener {
		 
	        public void serviceAdded(ServiceEvent event) {
	            System.out.println("Service added: " + event.getInfo());

	        }

	        
	        public void serviceRemoved(ServiceEvent event) {
	            System.out.println("Service removed: " + event.getInfo());
	        }

	        
	        public void serviceResolved(ServiceEvent event) {
	            System.out.println("Service resolved: " + event.getInfo());
	            System.out.println("Get Name: " + event.getName()+" PORT: "+event.getInfo().getPort());
	            
	            //Start GRPC server with discovered device
	            if(event.getName().equals("TV")) {
	            	System.out.println("Found TV port: " + event.getInfo().getPort());
	       		 try {
	       			System.out.println("STARTING TV GRPC SERVER");
					startGRPC(event.getInfo().getPort());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

	            }
	          

	        }
	    }
	
	private static final Logger logger = Logger.getLogger(TVServer.class.getName());
	public TV myTv = new TV();
	 public static void main(String[] args) throws IOException, InterruptedException {
		startDiscovery();
	    }
	 public static void startDiscovery() throws IOException, InterruptedException {
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	           

	            // Add a service listener
	            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
	            System.out.println("Listening");
	            // Wait a bit
	            Thread.sleep(30000);
	        } catch (UnknownHostException e) {
	            System.out.println(e.getMessage());
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	 } 
	 
	 public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		 TVServer tvServer = new TVServer();
		    Server server = ServerBuilder.forPort(portNumber)
		        .addService(tvServer)
		        .build()
		        .start();
		    
		    logger.info("TVServer started, listening on " + portNumber);
		    		    
		    server.awaitTermination();
	 }
	 
	 //IF boolean is true -> On if false->Off
	 @Override
	 public void onOff(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		 System.out.println("receiving onOFF for TV ");
		 Boolean onOff = request.getMsg();
		 myTv.setOn(onOff);
		 
			
		 BooleanRes response = BooleanRes.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}

	 public void mute(BooleanReq request, StreamObserver<valResponse> responseObserver) {
		 System.out.println("receiving mute for TV");
		 Boolean mute = request.getMsg();
		 if(mute.equals(true)) {
			 myTv.setVolume(0);
			 valResponse response = valResponse.newBuilder().setLength(myTv.getVolume()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();

		 }else {
			 valResponse response = valResponse.newBuilder().setLength(myTv.getVolume()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }

	}
	 @Override
	 public void changeVolume(valRequest request, StreamObserver<valResponse> responseObserver) {
			int currentVolume= myTv.getVolume();
		 int volume = request.getLength();
		 int newVolume = currentVolume +volume;
		 System.out.println("receiving volume for TV"+ volume);
		 if(newVolume<=100 && newVolume>=0){
			 myTv.setVolume(newVolume);
			 valResponse response = valResponse.newBuilder().setLength(myTv.getVolume()).build();
			 
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }else {
			 valResponse response = valResponse.newBuilder().setLength(myTv.getVolume()).build();
			 
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }


	}
	 @Override
	 public void initialDevice(Empty request, StreamObserver<tvResp> responseObserver) {
		 System.out.println("receiving initialDevice request for TV ");
		 String status;

		 if(myTv.isOn()) {
			  status ="On";
		 }else {
			  status ="Off";

		 }
		 String dName=myTv.getDeviceName();
		 String dStatus = status;
		 Integer dChannel = myTv.getCurrentChannel();
		 Integer dVolume=myTv.getVolume();

			
		 tvResp response = tvResp.newBuilder()
				 .setDname(dName).setStatus(dStatus).setVolume(dVolume).setChannel(dChannel)
				 .build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}
	 public void changeDeviceName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		 String name = request.getText();
		 System.out.println("Changing tv name to "+name);

			 myTv.setDeviceName(name);
		 
		 StringResponse response = StringResponse.newBuilder().setText(name).build();
		 System.out.println("Response "+response.getText());
		 responseObserver.onNext(response);
		responseObserver.onCompleted();
	 }
	 public StreamObserver<StringRequest> changeDeviceNameStream(final StreamObserver<StringResponse> responseObserver){
		return new StreamObserver<StringRequest>() {

			@Override
			public void onNext(StringRequest value) {
				// TODO Auto-generated method stub
				System.out.println("On next text value "+value.getText());
				StringResponse resp = StringResponse.newBuilder().setText(value.getText()).build();
				responseObserver.onNext(resp);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				responseObserver.onCompleted();
			}
			
		};
		 
	 }
	 @Override
	 public void changeChannel(valRequest request, StreamObserver<valResponse> responseObserver) {
		 int current_channel = myTv.getCurrentChannel();
		 System.out.println("receiving volume for TV");
		 int channel = request.getLength();
		 int new_channel = channel+current_channel;
		 if(new_channel<=10 && new_channel>=1) {
			 myTv.setCurrentChannel(new_channel);
		 }
		 
		 valResponse response = valResponse.newBuilder().setLength(myTv.getCurrentChannel()).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	 }

	 
}
