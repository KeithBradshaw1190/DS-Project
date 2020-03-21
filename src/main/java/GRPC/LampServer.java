package GRPC;
import java.io.IOException;
import java.util.logging.Logger;

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
	 public static void main(String[] args) throws IOException, InterruptedException {
		 LampServer lampServer = new LampServer();
		   
		    int port = 50056;
		    Server server = ServerBuilder.forPort(port)
		        .addService(lampServer)
		        .build()
		        .start();
		    
		    logger.info("LampServer started, listening on " + port);
		    		    
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
