package GRPC;
import java.io.IOException;
import java.util.logging.Logger;

import org.DS.keithproject.SmartHomeGRPC.BooleanReq;
import org.DS.keithproject.SmartHomeGRPC.BooleanRes;
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
		 System.out.println("receiving mute for TV");
		 int volume = request.getLength();
		 if(volume<=100 && volume>=0) {
			 myTv.setVolume(volume);
		 }
		 valResponse response = valResponse.newBuilder().setLength(volume).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}
	 
}
