
package pkg252lab2;

import java.time.LocalDate;
import java.util.Random;

public class Order {
    private int orderNumber;
    private LocalDate orderDate;
    private Logger log = Logger.getInstance();
    private int getRandomNumber() {
        Random ran = new Random();
        return ran.nextInt(Integer.MAX_VALUE);
    }
    public Order() {
        try {
            Thread.sleep(2000);
    } catch (InterruptedException ex) {
        ex.printStackTrace();
    }
        try {
            Thread.sleep(2000);
    } catch (InterruptedException ex) {
        ex.printStackTrace();
    }
        this.orderNumber = getRandomNumber();
        this.orderDate = LocalDate.now();
        log.info("A new order was created");
        log.info(this.toString());
    }
    public String toString(){
        return "Order info:\nOrder number: " + this.orderNumber +
                "\nDate" + this.orderDate;
    }
}
