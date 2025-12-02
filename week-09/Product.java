
/**
 * Data carrier for a single sellable item. Encapsulates id, 
 * name, category, price, current stock level, and minimum 
 * stock threshold, and exposes simple operations for querying 
 * and updating stock and formatted display.
 *
 * @author (Bara S. Rohmani)
 * @version (v1.0 — 2025-10-14)
 */
public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stock;
    private int minStock;

    public Product(int id, String name, String category,
    double price, int stock, int minStock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.minStock = minStock;
    }

    public int getId() { return id;}

    public String getName() { return name;}

    public String getCategory() { return category;}

    public double getPrice() { return price;}

    public int getStock() { return stock;}

    public int getMinStock() { return minStock;}

    public void setStock(int s) { stock = s; }

    public void decrementStock() { if(stock > 0) stock--; }

    public boolean needsRefill() { return stock <= minStock; }

    @Override
    public String toString() {
        return id + " - " + name + "\tRp" +
        String.format("%.2f", price) + "\tstok:" + stock;
    }
}