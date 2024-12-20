package HomeWork.HomeWork1215;
/*
 * 
 * ## 题目2
 * 
 * ​ 定义数组存储3部手机对象。
 * 
 * ​ 手机的属性：品牌，价格，颜色。
 * 
 * ​ 要求，计算出三部手机的平均价格
 */

public class Task12152 {
    public static void main(String[] args) {
        // 定义数组存储3部手机对象
        Cellphone[] phones = new Cellphone[3];
        // 实例化3部手机对象
        phones[0] = new Cellphone("iphone", 1000, "red");
        phones[1] = new Cellphone("huawei", 1500, "blue");
        phones[2] = new Cellphone("vivo", 800, "black");
        // 计算平均价格
        double sum = 0;
        for (int i = 0; i < phones.length; i++) {
            sum += phones[i].getPrice();
        }
        double avgPrice = sum / phones.length;
        System.out.println("平均价格：" + avgPrice);
    }
}