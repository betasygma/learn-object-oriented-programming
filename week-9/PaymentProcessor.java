
/**
 * Write a description of class PaymentProcessor here.
 *
 * @author (Bara S. Rohmani)
 * @version (v1.0 — 2025-10-14)
 */

import java.util.Scanner;

public class PaymentProcessor {
    private Scanner scanner;
    
    public PaymentProcessor(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public double acceptPayment(double requiredAmount) {
        double totalPaid = 0.0;
        while(totalPaid < requiredAmount) {
            System.out.println("Masukkan uang: ");
            String line = scanner.nextLine();
            try {
                double value = Double.parseDouble(line);
                if(value <= 0) {
                    System.out.println("Masukkan bilangan positif.");
                    continue;
                }
                totalPaid += value;
                System.out.println("\nTotal pembayaran: Rp" +
                String.format("%.2f", totalPaid));
                if(totalPaid < requiredAmount) {
                    System.out.println("Sisa: Rp" + 
                    String.format("%.2f", requiredAmount - 
                    totalPaid));
                }
            } catch(NumberFormatException e) {
                System.out.println("Jumlah tidak valid! Silakan coba lagi.");
            }
        }
        return totalPaid;
    }
    
    public double computeChange(double paid, double price) {
        double change = paid - price;
        return change < 0 ? 0.0 : change;
    }
}