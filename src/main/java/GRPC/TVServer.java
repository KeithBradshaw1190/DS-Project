package GRPC;
import java.io.IOException;
import java.util.logging.Logger;

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
import Models.TV;

public class TVServer extends TvServiceImplBase {
	private static final Logger logger = Logger.getLogger(TVServer.class.getName());
	public TV myTv = new TV();
	 public static void main(String[] args) throws IOException, InterruptedException {
		 TVServer tvServer = new TVServer();
		   
		    int port = 50055;
		    Server server = ServerBuilder.forPort(port)
		        .addService(tvServer)
		        .build()
		        .start();
		    
		    logger.info("TVServer started, listening on " + port);
		    		    
		    server.awaitTermination();
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
		 System.out.println("Changing device name to "+name);

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
