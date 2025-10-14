
/**
 * Write a description of class Transaction here.
 *
 * @author (Bara S. Rohmani)
 * @version (v1.0 - 2025-10-14)
 */

import java.time.LocalDateTime;

public class Transaction {
    private int productId;
    private String productName;
    private double price;
    private double paid;
    private double change;
    private LocalDateTime timestamp;
    
    public Transaction(int productId, String productName, 
    double price, double paid, double change) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.paid = paid;
        this.change = change;
        this.timestamp = LocalDateTime.now();
    }
    
    public double getPrice() { return price; }
    
    @Override
    public String toString() {
        return "[" + timestamp + "]" + 
        " | ID:" + productId +
        " | nama:" + productName +
        " | harga:Rp" + String.format("%.2f", price) +
        " | bayar:Rp" + String.format("%.2f", paid) + 
        " | kembalian:Rp" + String.format("%.2f", change);
    }
}