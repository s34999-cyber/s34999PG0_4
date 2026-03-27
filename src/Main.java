public class Main {
    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("C-01", "Tiramisu", 13.99, "Cake");
        MenuItem m2 = new MenuItem("P-01", "Croissant", 4.25, "Pastry");
        MenuItem m3 = new MenuItem("C-02", "Cheesecake", 12.00, "Cake");
        MenuItem m3copy = new MenuItem("C-02", "Cheesecake Part 2", 12.00, "Cake");
        System.out.println(MenuItem.getProductCount());
        System.out.println(m3);
        System.out.println(m3.equals(m1));
        System.out.println(m3.equals(m3copy));
        CafeCustomer c1 = new CafeCustomer(9,"Rodion","Raskolnikow","buglover@lcb.com");
        CafeCustomer c2 = new CafeCustomer(13,"Gregor", "Samsa", "gregorSamsa@lcb.com");
        System.out.println(c1);
    }
}
