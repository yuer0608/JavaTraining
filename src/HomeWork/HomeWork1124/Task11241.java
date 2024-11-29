package HomeWork.HomeWork1124;

import java.util.Scanner;

public class Task11241 {
    public static void main(String[] args) {
        /*
         * ## 题目1
         * 
         * ​ 键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
         * 
         * ### 训练提示
         * 
         * 1. number1和number2不知道谁大谁小，需要先判断大小关系
         * 2. 确定大小之后，可以循环得到范围里面的每一个数
         * 3. 把每一个数字进行累加即可
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int number1 = scanner.nextInt();
        System.out.print("请输入第二个数字：");
        int number2 = scanner.nextInt();
        // 判断大小关系
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 循环得到范围里面的每一个数
        int sum = 0;
        for (int i = number1 + 1; i < number2; i++) {
            sum += i;
        }

        // 输出结果
        System.out.println("这个范围内的数字和为：" + sum);
    }
}
