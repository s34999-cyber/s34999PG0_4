import java.util.ArrayList;

public class Order {
    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items = new ArrayList<MenuItem>();
    private ArrayList<String> itemNames = new ArrayList<String>();
    private boolean paid = false;
    private static int nextOrderNumber = 1;
    public Order(CafeCustomer customer) {
        this.customer = customer;
        this.orderNumber = nextOrderNumber;
        nextOrderNumber++;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        itemNames.add(item.getName());
    }
    public String calculateTotal(){
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return String.format("%.2f", total);
    }
    public int countItems() {
        return items.size();
    }
    public boolean markAsPaid() {
        this.paid = true;
        return true;
    }
    @Override
    public String toString() {
        return
                "Order #" + orderNumber + ":\n" + itemNames + "\n" + "Paid?: " + paid;
    }
}
