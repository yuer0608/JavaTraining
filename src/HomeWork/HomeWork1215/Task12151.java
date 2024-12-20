package HomeWork.HomeWork1215;

import java.util.Scanner;

/**
 * ## 题目1
 * 
 * ​ 定义数组存储3部汽车对象。
 * 
 * ​ 汽车的属性：品牌，价格，颜色。
 * 
 * ​ 创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中。
 * 
 */
public class Task12151 {
    public static void main(String[] args) {
        // 创建三个汽车对象
        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++) {
            // 输入汽车品牌
            String brand = input("请输入第" + (i + 1) + "辆汽车的品牌：");
            // 输入汽车价格
            double price = inputDouble("请输入第" + (i + 1) + "辆汽车的价格：");
            // 输入汽车颜色
            String color = input("请输入第" + (i + 1) + "辆汽车的颜色：");
            // 创建汽车对象并存入数组
            cars[i] = new Car(brand, price, color);
        }
        // 输出数组中的汽车信息
        for (int i = 0; i < 3; i++) {
            System.out.println("第" + (i + 1) + "辆汽车的品牌：" + cars[i].getBrand());
            System.out.println("第" + (i + 1) + "辆汽车的价格：" + cars[i].getPrice());
            System.out.println("第" + (i + 1) + "辆汽车的颜色：" + cars[i].getColor());
        }
    }

    // 输入字符串
    public static String input(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextLine();
    }

    // 输入double
    public static double inputDouble(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextDouble();
    }

}
