
package pkg252lab2;

import java.util.Random;

public class Shipment {
    private int trackingNumber;
    private String name;
    private String address;
    private String phoneNumber;
    private Logger log = Logger.getInstance();

    Shipment(String ahmed, String _ne_Pleasant_St_Niceville_FL_32578) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int getRandomNumber() {
        Random ran = new Random();
        return ran.nextInt(Integer.MAX_VALUE);
    }
    public Shipment(String name, String address, String phoneNumber) {
        try{
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        this.trackingNumber = getRandomNumber();
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        log.info("A new shipment was created");
        log.info(this.toString());
    }
    public String toString(){
        return "Shipment info:\nTracking number: " + this.trackingNumber +
                "\nName" + this.name + "\nAddress: " + this.address +
                "\nPhone: " + this.phoneNumber;
    }
    
}
