

public class TradeInVehicle {
    private String serialNumber;
    private String make;

    public TradeInVehicle(String serialNumber, String make) {
        this.serialNumber = serialNumber;
        this.make = make;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getMake() {
        return make;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void displayTradeInInfo() {
        throw new UnsupportedOperationException("Unimplemented method 'displayTradeInInfo'");
    }
}