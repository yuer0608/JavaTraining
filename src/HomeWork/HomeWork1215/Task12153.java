package HomeWork.HomeWork1215;

/*
## 题目3：

​	定义数组存储4个女朋友的对象

​	女朋友的属性：姓名、年龄、性别、爱好

​	要求1：计算出四女朋友的平均年龄

​	要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
 */
public class Task12153 {
    public static void main(String[] args) {
        // 定义数组存储4个女朋友的对象
        GirlFriend[] girls = new GirlFriend[4];
        // 给数组中的对象赋值
        girls[0] = new GirlFriend("小红", 20, "女", "唱歌");
        girls[1] = new GirlFriend("小兰", 22, "女", "跳舞");
        girls[2] = new GirlFriend("小刚", 18, "男", "打篮球");
        girls[3] = new GirlFriend("小芳", 25, "女", "跳绳");
        // 计算出四女朋友的平均年龄
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += girls[i].getAge();
        }
        double average = sum / 4.0;
        System.out.println("四女朋友的平均年龄为：" + average);
        // 统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (girls[i].getAge() < average) {
                count++;
                System.out.println(girls[i].toString());
            }
        }
        System.out.println("年龄比平均值低的女朋友有" + count + "个。");
    }

}
