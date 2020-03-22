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
import org.DS.keithproject.SmartHomeGRPC.StringRequest;
import org.DS.keithproject.SmartHomeGRPC.StringResponse;
import org.DS.keithproject.SmartHomeGRPC.TvServiceGrpc.TvServiceImplBase;
import org.DS.keithproject.SmartHomeGRPC.valRequest;
import org.DS.keithproject.SmartHomeGRPC.valResponse;

import com.google.protobuf.Int32ValueOrBuilder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import jmDNS.Discovering;
import jmDNS.Discovering.SampleListener;
import Models.TV;

public class TVServer extends TvServiceImplBase {
	
	 private static class SampleListener implements ServiceListener {
	        public void serviceAdded(ServiceEvent event) {
	            System.out.println("Service addedPORT?: " + event.getInfo().getPort());

	        }

	        
	        public void serviceRemoved(ServiceEvent event) {
	            System.out.println("Service removed: " + event.getInfo());
	        }

	        
	        public void serviceResolved(ServiceEvent event) {
	            System.out.println("Service resolved: " + event.getInfo());
	            System.out.println("Get Name: " + event.getName()+" PORT: "+event.getInfo().getPort());
	            if(event.getName().equals("TV")) {
	            	System.out.println("Found TV port: " + event.getInfo().getPort());
	            	//TVPort =event.getInfo().getPort();
	       		 try {
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
		  
		// portNumber= 50055;
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

	 @Override
	 public void mute(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		 System.out.println("receiving mute for TV");
		 Boolean mute = request.getMsg();
		 if(mute.equals(true)) {
			 myTv.setVolume(0);
		 }
		 BooleanRes response = BooleanRes.newBuilder().setMsg(mute).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}
	 @Override
	 public void changeVolume(valRequest request, StreamObserver<valResponse> responseObserver) {

		 int volume = request.getLength();
		 System.out.println("receiving volume for TV"+ volume);
		 if(volume<=100 && volume>=1) {
			 myTv.setVolume(volume);
		 }
		 valResponse response = valResponse.newBuilder().setLength(volume).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}
	 @Override
	 public void changeDeviceName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		 String name = request.getText();
		 System.out.println("Changing tv name to "+name);

			 myTv.setDeviceName(name);
		 
		 StringResponse response = StringResponse.newBuilder().setText(name).build();
		 System.out.println("Response "+response.getText());
		 responseObserver.onNext(response);
		responseObserver.onCompleted();
	 }
	 @Override
	 public void changeChannel(valRequest request, StreamObserver<valResponse> responseObserver) {
		 
		 System.out.println("receiving volume for TV");
		 int channel = request.getLength();
		 if(channel<=10 && channel>=1) {
			 myTv.setCurrentChannel(channel);
		 }
		 
		 valResponse response = valResponse.newBuilder().setLength(channel).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	 }

	 
}
