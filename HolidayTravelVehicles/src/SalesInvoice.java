

public class SalesInvoice {
    private String date;
    private Customer customer;
    private SalesPerson salesPerson;

    public SalesInvoice(String date, Customer customer, SalesPerson salesPerson) {
        this.date = date;
        this.customer = customer;
        this.salesPerson = salesPerson;
    }

    public String getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }
}
