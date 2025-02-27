

public class Vehicle {
    private String name;
    private String model;
    private int year;
    private String manufacturer;

    public Vehicle(String name, String model, int year, String manufacturer) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
