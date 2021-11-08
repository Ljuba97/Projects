import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cashier receipt = new Cashier();
        List<Product> cart = new ArrayList<>();
        cart.add(new Food("apple", "BrandA", 1.5, 2.45, LocalDate.of(2021, 6, 14)));
        cart.add(new Beverage("milk", "BrandM", 0.99, 3, LocalDate.of(2022, 2, 2)));
        cart.add(new Clothes("T-shirt", "BrandT", 15.99, 2, "M", "violet"));
        cart.add(new Appliance("laptop", "BrandL", 2345, 1, "ModelL", LocalDate.of(2021, 3, 3), 1.125));
        receipt.printReceipt(cart, LocalDateTime.of(2021, 6, 14, 12, 34, 56));
    }
}
