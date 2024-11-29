package HomeWork.HomeWork1124;

public class Task11245 {
    public static void main(String[] args) {
        /*
         * ## 题目5
         * 
         * 需求：
         * 
         * ​ 给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围） 。
         * 
         * ​ 将两数相除，要求不使用乘法、除法和 % 运算符。
         * 
         * ​ 得到商和余数。
         */

        int dividend = 11;
        int divisor = 3;

        int quotient = 0;
        int remainder = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        remainder = dividend;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

}
