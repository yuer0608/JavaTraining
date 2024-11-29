package HomeWork.HomeWork1117;

import java.time.LocalDate;
import java.util.Scanner;

public class Task11172 {
    public static void main(String[] args) {
        /*
         * 根据输入的身份证号码,计算生日、性别、年龄和生肖
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入身份证号码：");
        String idCard = scanner.nextLine();

        if (idCard.length() != 18) {
            System.out.println("身份证号码长度不正确！");
        }
        String birth = idCard.substring(6, 14);
        String gender = idCard.charAt(16) % 2 == 0 ? "女" : "男";

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int birthYear = Integer.parseInt(idCard.substring(6, 10));
        int age = currentYear - birthYear;

        String[] zodiac = {
                "鼠", "牛", "虎", "兔", "龙", "蛇",
                "马", "羊", "猴", "鸡", "狗", "猪"
        };
        String zodiacSign = zodiac[(birthYear - 1900) % 12];

        System.out.println("生日：" + birth);
        System.out.println("性别：" + gender);
        System.out.println("年龄：" + age);
        System.out.println("生肖：" + zodiacSign);

    }
}
