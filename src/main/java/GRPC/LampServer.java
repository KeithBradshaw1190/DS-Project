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
import org.DS.keithproject.SmartHomeGRPC.LampServiceGrpc.LampServiceImplBase;
import org.DS.keithproject.SmartHomeGRPC.valRequest;
import org.DS.keithproject.SmartHomeGRPC.valResponse;

import com.google.protobuf.Int32ValueOrBuilder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import Models.Lamp;



public class LampServer extends LampServiceImplBase {
	private static final Logger logger = Logger.getLogger(LampServer.class.getName());
	public Lamp myLamp = new Lamp();
	public static int lampPort;
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
	            if(event.getName().equals("Lamp")) {
	            	System.out.println("Found Lamp port: " + event.getInfo().getPort());
	       		 try {
	       			 lampPort = event.getInfo().getPort();
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
	
	
	

	 public static void main(String[] args) throws IOException, InterruptedException  {
		 
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
	 public int getLampPort() {
			return lampPort;
		}

		public void setLampPort(int lampPort) {
			LampServer.lampPort = lampPort;
		}

	 
	 public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		 
		 LampServer lampServer = new LampServer();
		 
		    
		    Server server = ServerBuilder.forPort(portNumber)
		        .addService(lampServer)
		        .build()
		        .start();
		    
		    logger.info("LampServer started, listening on " + portNumber);
		    		    
			 
		    server.awaitTermination();
	 }
	 

	
	//IF boolean is true -> On if false->Off
	 @Override
	 public void onOff(BooleanReq request, StreamObserver<BooleanRes> responseObserver) {
		 System.out.println("receiving onOFF for Lamp ");
		 Boolean onOff = request.getMsg();
		 myLamp.setOn(onOff);
		 
			
		 BooleanRes response = BooleanRes.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}

	 @Override
	 public void changeDeviceName(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		 String name = request.getText();
		 System.out.println("Changing lamp name to "+name);

		 myLamp.setDeviceName(name);
		 
		 StringResponse response = StringResponse.newBuilder().setText(name).build();
		 System.out.println("Response "+response.getText());
		 responseObserver.onNext(response);
		responseObserver.onCompleted();
	 }
	 @Override
	 public void changeBrightness(valRequest request, StreamObserver<valResponse> responseObserver) {
		int currentBrightness= myLamp.getBrightness();
		int changeBrightness = request.getLength();
		 System.out.println("receiving brightness for lamp");
		 int newBrightness = currentBrightness+changeBrightness;
		 if(newBrightness>100 || newBrightness<0) {
			 System.out.println("Brigtness request is over 100 or less than 0:" +newBrightness);
			 System.out.println("Returning current brightness:" +myLamp.getBrightness());
			 valResponse response = valResponse.newBuilder().setLength(myLamp.getBrightness()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }else {
			 System.out.println("New brightness is set :" +newBrightness);
			 myLamp.setBrightness(newBrightness);
			 valResponse response = valResponse.newBuilder().setLength(newBrightness).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }
		 

	 }

	 
}
