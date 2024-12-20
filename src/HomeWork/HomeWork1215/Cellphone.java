package HomeWork.HomeWork1215;

// 手机的属性：品牌，价格，颜色。
public class Cellphone {
    private String brand;
    private double price;
    private String color;

    public Cellphone() {
    }

    public Cellphone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
