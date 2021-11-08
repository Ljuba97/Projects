import java.time.LocalDate;

public class Beverage extends Product{
    private LocalDate expirationDate;

    public Beverage(String name, String brand, double price, double quantity, LocalDate expirationDate) {
        super(name, brand, price, quantity);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
