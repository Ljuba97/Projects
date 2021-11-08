import java.time.LocalDate;

public class Food extends Product{
    private LocalDate expirationDate;

    public Food(String name, String brand, double price, double quantity, LocalDate expirationDate) {
        super(name, brand, price, quantity);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
