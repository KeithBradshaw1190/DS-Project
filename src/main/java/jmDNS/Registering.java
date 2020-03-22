package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import Models.*;
public class Registering {

    public static void main(String[] args) throws InterruptedException {
    	
    	Speaker mySpeaker = new Speaker();
    	TV myTV = new TV();
    	Lamp myLamp = new Lamp();
    	Chromecast myCC = new Chromecast();
//    	String description = "50055";
//    	 String server_port = "server_port"; // Max 9 chars
//    	    HashMap<String, byte[]> properties = new HashMap<String, byte[]>();
//    	    properties.put(server_port,description.getBytes());
    	
    	
    	
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Registering all services
            System.out.println("Registering");
            ServiceInfo serviceSpeaker = ServiceInfo.create("_http._tcp.local.", mySpeaker.getDevice(), 1234,"path=index.html");
            ServiceInfo serviceTV = ServiceInfo.create("_http._tcp.local.", myTV.getDevice(), 1235, "path=index.html");
            ServiceInfo serviceLamp = ServiceInfo.create("_http._tcp.local.", myLamp.getDevice(), 1236, "path=index.html");
            ServiceInfo serviceCC = ServiceInfo.create("_http._tcp.local.", myCC.getDevice(), 1237, "path=index.html");
            
            jmdns.registerService(serviceSpeaker);
            jmdns.registerService(serviceTV);
            jmdns.registerService(serviceLamp);
            jmdns.registerService(serviceCC);


            // Wait a bit
            Thread.sleep(25000);

            // Unregister all services
            jmdns.unregisterAllServices();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}