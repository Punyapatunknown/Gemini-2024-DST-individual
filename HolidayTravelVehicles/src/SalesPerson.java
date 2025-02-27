

public class SalesPerson {
    private String name;
    private String salesPersonId;
    private String phoneNumber;

    public SalesPerson(String name, String salesPersonId, String phoneNumber) {
        this.name = name;
        this.salesPersonId = salesPersonId;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSalesPersonId() {
        return salesPersonId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalesPersonId(String salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
