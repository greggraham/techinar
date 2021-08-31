package org.cistercian.demo;

public class BitwiseDemo {
    public static void main(String[] args) {
        int octet1 = 10;
        int octet2 = 0;
        int octet3 = 1;
        int octet4 = 42;

        int ipaddress = (octet1 << 24) + (octet2 << 16) + (octet3 << 8) + octet4;
        System.out.println("IP address decimal = " + ipaddress);
        System.out.println("IP address hex     = " + Integer.toHexString(ipaddress));
        System.out.println("IP address binary  = " + Integer.toBinaryString(ipaddress));

        int extractedOctet = (ipaddress & 0b11111111000000000000000000000000) >>> 24;
        System.out.println("Octet 1 = " + extractedOctet);

        extractedOctet = (ipaddress & 0x00FF0000) >>> 16;
        System.out.println("Octet 2 = " + extractedOctet);
        
        extractedOctet = (ipaddress & 0x0000FF00) >>> 8;
        System.out.println("Octet 3 = " + extractedOctet);
        
        extractedOctet = (ipaddress & 0x000000FF);
        System.out.println("Octet 4 = " + extractedOctet);
    }
}