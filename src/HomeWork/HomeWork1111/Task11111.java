import java.util.Arrays;

public class Task11111 {
    public static void main(String[] args) {
        // 定义变量姓名
        String name = "Yujiao.Luo";
        // 定义年龄
        int age = 32;
        // 定义变量记录性别
        String gender = "female";
        // 定义熟悉的技术 如：Java，Html，css，mysql，JavaScript，python，c
        String[] technologyList = { "Pyhton", "JavaScript", "Html", "CSS", "MySQL" };
        // 定义常住地址（写到街道）
        String address = "上海市浦东新区杨南路694号";
        // 定义周几有空
        String[] freeDate = { "Saturday", "Sunday" };
        // 输出打印
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Sex:" + gender);
        System.out.println("technology:" + Arrays.toString(technologyList));
        System.out.println("Address:" + address);
        System.out.println("Free Date:" + Arrays.toString(freeDate));
    }
}
