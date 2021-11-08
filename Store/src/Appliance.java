import java.time.LocalDate;

public class Appliance extends Product{
    private String model;
    private LocalDate productionDate;
    private double weight;

    public Appliance(String name, String brand, double price, double quantity, String model, LocalDate productionDate, double weight) {
        super(name, brand, price, quantity);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public double getWeight() {
        return weight;
    }
}
