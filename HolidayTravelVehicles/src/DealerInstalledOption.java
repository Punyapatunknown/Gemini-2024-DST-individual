

public class DealerInstalledOption {
    private String optionCode;
    private String description;
    private double price;

    public DealerInstalledOption(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public String getOptionCode() {
        return optionCode;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayOptionInfo() {
        System.out.println("Option Code: " + optionCode);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
    }
}
