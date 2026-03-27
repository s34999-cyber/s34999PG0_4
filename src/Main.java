public class Main {
    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("C-01", "Tiramisu", 13.99, "Cake");
        MenuItem m2 = new MenuItem("P-01", "Croissant", 4.25, "Pastry");
        MenuItem m3 = new MenuItem("C-02", "Cheesecake", 12.00, "Cake");
        MenuItem m3copy = new MenuItem("C-02", "Cheesecake Part 2", 12.00, "Cake");
        CafeCustomer c1 = new CafeCustomer(9,"Rodion","Raks","bugl4ver@lcb.com");
        Order rodyas = new Order(c1);
        rodyas.addItem(m1);
        rodyas.addItem(m2);
        rodyas.addItem(m3);

        System.out.println(c1);
        System.out.println(rodyas);
        System.out.println("Total value:" + rodyas.calculateTotal());
        System.out.println("Total items:" + rodyas.countItems());
        System.out.println("Number of products in the system: " + MenuItem.getProductCount());

        rodyas.markAsPaid();
        System.out.println(rodyas);
        System.out.println("Are these products equal?: " + m3.equals(m3copy));
    }
}
