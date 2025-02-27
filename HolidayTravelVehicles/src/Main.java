public class Main {
    public static void main(String[] args) {
        
        Customer customer = new Customer("C001", "John Doe", "123 Main St", "555-1234");
        SalesPerson salesPerson = new SalesPerson("Alice Smith", "SP1001", "555-5678");
        SalesInvoice invoice = new SalesInvoice("2025-02-25", customer, salesPerson);
        Vehicle myVehicle = new Vehicle("Toyota Camry", "XLE", 2023, "Toyota");
        TradeInVehicle tradeInVehicle = new TradeInVehicle("SN123456", "Honda");
        DealerInstalledOption sunroof = new DealerInstalledOption("OPT001", "Sunroof", 1200.00);
        DealerInstalledOption leatherSeats = new DealerInstalledOption("OPT002", "Leather Seats", 1500.00);

        System.out.println("Sales Invoice Date: " + invoice.getDate());
        System.out.println("Customer: " + customer.getName() + ", " + customer.getAddress() + ", " + customer.getPhoneNumber());
        System.out.println("Salesperson: " + salesPerson.getName() + ", " + salesPerson.getSalesPersonId() + ", " + salesPerson.getPhoneNumber());
        
        System.out.println("Vehicle Name: " + myVehicle.getName());
        System.out.println("Model: " + myVehicle.getModel());
        System.out.println("Year: " + myVehicle.getYear());
        System.out.println("Manufacturer: " + myVehicle.getManufacturer());

        System.out.println("Trade-in Vehicle Make: " + tradeInVehicle.getMake());
        System.out.println("Trade-in Vehicle Serial Number: " + tradeInVehicle.getSerialNumber());

        System.out.println("\nDealer Installed Options:");
        sunroof.displayOptionInfo();
        leatherSeats.displayOptionInfo();
    }
}