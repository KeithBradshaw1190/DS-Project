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
import org.DS.keithproject.SmartHomeGRPC.SpeakerServiceGrpc.SpeakerServiceImplBase;
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
import Models.Speaker;
import Models.TV;

public class SpeakerServer extends SpeakerServiceImplBase {
	
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
	            if(event.getName().equals("Speaker")) {
	            	System.out.println("Found Speaker port: " + event.getInfo().getPort());
	       		 try {
	       			System.out.println("STARTING SPEAKER GRPC SERVER");
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
	
	private static final Logger logger = Logger.getLogger(SpeakerServer.class.getName());
	public Speaker mySpeaker = new Speaker();
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
		 SpeakerServer speakerServer = new SpeakerServer();
		    Server server = ServerBuilder.forPort(portNumber)
		        .addService(speakerServer)
		        .build()
		        .start();
		    
		    logger.info("TVServer started, listening on " + portNumber);
		    		    
		    server.awaitTermination();
	 }
	 
	 //IF boolean is true -> On if false->Off
	 @Override
	 public void onOff(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		 System.out.println("receiving onOFF for Speaker ");
		 Boolean onOff = request.getMsg();
		 mySpeaker.setOn(onOff);
		 
			
		 BooleanRes response = BooleanRes.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}

	 public void mute(BooleanReq request, StreamObserver<valResponse> responseObserver) {
		 System.out.println("receiving mute for TV");
		 Boolean mute = request.getMsg();
		 if(mute.equals(true)) {
			 mySpeaker.setVolume(0);
			 valResponse response = valResponse.newBuilder().setLength(myTv.getVolume()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();

		 }else {
			 valResponse response = valResponse.newBuilder().setLength(mySpeaker.getVolume()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }

	}
	 @Override
	 public void changeVolume(valRequest request, StreamObserver<valResponse> responseObserver) {
			int currentVolume= mySpeaker.getVolume();
		 int volume = request.getLength();
		 int newVolume = currentVolume +volume;
		 System.out.println("receiving volume for TV"+ volume);
		 if(newVolume<=100 && newVolume>=0){
			 mySpeaker.setVolume(newVolume);
			 valResponse response = valResponse.newBuilder().setLength(mySpeaker.getVolume()).build();
			 
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }else {
			 valResponse response = valResponse.newBuilder().setLength(mySpeaker.getVolume()).build();
			 
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }


	}
	 @Override
	 public void changeDeviceName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		 String name = request.getText();
		 System.out.println("Changing tv name to "+name);

			 mySpeaker.setDeviceName(name);
		 
		 StringResponse response = StringResponse.newBuilder().setText(name).build();
		 System.out.println("Response "+response.getText());
		 responseObserver.onNext(response);
		responseObserver.onCompleted();
	 }
	 

	 
}
