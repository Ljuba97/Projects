public class Clothes extends Product{
    private String size, color;

    public Clothes(String name, String brand, double price, double quantity, String size, String color) {
        super(name, brand, price, quantity);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
