import java.awt.*;
import java.util.Objects;

public class MenuItem {
    private String code;
    private String name;
    private double price;
    private String category;
    private static int productCount;

    public MenuItem(String code, String name, double price, String category){
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        productCount++;
        //constructor
    }
    //getters
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public static int getProductCount(){
        return productCount;
    }
    @Override
    public String toString() {
        return
                "code:" + code +
                        ", name:" + name +
                        ", price:" + price +
                        ", category:" + category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(getCode(), menuItem.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCode());
    }
}
