package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import Models.*;
public class Registering {
    public static JmDNS jmdns;

    public static void main(String[] args) throws UnknownHostException, IOException  {
      	

    }
	public void jmndsRegister(int speakerPort, int tvPort, int lampPort,int ccPort) throws InterruptedException {

    	Speaker mySpeaker = new Speaker();
    	TV myTV = new TV();
    	Lamp myLamp = new Lamp();

        try {
        	
            // Create a JmDNS instance
           // JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        	 jmdns= JmDNS.create(InetAddress.getLocalHost());
            // Registering all services
            System.out.println("Registering");
            ServiceInfo serviceSpeaker = ServiceInfo.create("_http._tcp.local.", mySpeaker.getDevice(), speakerPort,"path=index.html");
            ServiceInfo serviceTV = ServiceInfo.create("_http._tcp.local.", myTV.getDevice(), tvPort, "path=index.html");
            ServiceInfo serviceLamp = ServiceInfo.create("_http._tcp.local.", myLamp.getDevice(), lampPort, "path=index.html");
            
         jmdns.registerService(serviceSpeaker);
            jmdns.registerService(serviceTV);
            jmdns.registerService(serviceLamp);

            
            // Wait a bit
          //  Thread.sleep(25000);

            // Unregister all services
           // jmdns.unregisterAllServices();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}
	public void unRegister() {
        System.out.println("Un-registering");

         jmdns.unregisterAllServices();

	}

}
