import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import static java.time.temporal.ChronoUnit.DAYS;

public class Cashier {
    public void printReceipt(List<Product> products, LocalDateTime purchaseDate) {
        System.out.println("Date: " + purchaseDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n---Products---\n");
        double totalSum = 0;
        double totalDiscount = 0;

        for (var x : products) {
            int discount = 0;
            int days = 0;
            if (x instanceof Food) {
                days = (int) DAYS.between(purchaseDate.toLocalDate(), ((Food) x).getExpirationDate());
                discount = (days < 5 && days > 0) ? 10 : (days == 0) ? 50 : 0;
            }
            else if (x instanceof Beverage) {
                days = (int) DAYS.between(purchaseDate.toLocalDate(), ((Beverage) x).getExpirationDate());
                discount = (days < 5 && days > 0) ? 10 : (days == 0) ? 50 : 0;
            }
            else if (x instanceof Clothes) {
                switch (purchaseDate.getDayOfWeek()) {
                    case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY: discount = 10; break;
                    default: break;
                }
            }
            else if (x instanceof Appliance && x.getPrice() > 999) {
                switch (purchaseDate.getDayOfWeek()) {
                    case SATURDAY, SUNDAY: discount = 5; break;
                    default: break;
                }
            }

            totalSum += Double.parseDouble(String.format("%.2f", x.getQuantity() * x.getPrice()));
            totalDiscount += Double.parseDouble(String.format("%.2f", (x.getQuantity() * x.getPrice()) * discount / 100));
            System.out.print(x.getName() + " " + x.getBrand());
            if (x instanceof Clothes)
                System.out.print(" " + ((Clothes) x).getSize() + " " + ((Clothes) x).getColor());
            System.out.println("\n" + x.getQuantity() + " x $" + x.getPrice() + " = $" + String.format("%.2f", x.getQuantity() * x.getPrice()));
            if (discount > 0)
                System.out.println("#discount " + discount + "% -$" + String.format("%.2f", (x.getQuantity() * x.getPrice()) * discount / 100));
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("SUBTOTAL: $" + totalSum + "\nDISCOUNT: -$" + String.format("%.2f", totalDiscount) + "\n\nTOTAL: $" + (totalSum - totalDiscount));
    }
}
