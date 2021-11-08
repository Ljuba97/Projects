public class Product {
    private String name, brand;
    private double price, quantity;

    public Product(String name, String brand, double price, double quantity) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", amount=" + quantity +
                '}';
    }
}
