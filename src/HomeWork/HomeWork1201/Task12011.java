package HomeWork.HomeWork1201;

public class Task12011 {

    public static void main(String[] args) {
        /*
         * 1.人民币大小写切换-计一个万位以内的数值大写转换（例如 9999，最高为千位）， 请你编写程序文件，运行程序，输入小写数值，返回对应的大写数
         * 字。实例如下：
         * 终端输入： 1234， 终端输出：壹仟贰佰叁拾肆圆
         * 
         */
        String[] digit = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        String[] unit = { "", "拾", "佰", "仟", "万" };
        int num = 1234;
        String result = "";
        int length = String.valueOf(num).length();
        for (int i = 0; i < length; i++) {
            int digitNum = num % 10;
            result = digit[digitNum] + unit[i] + result;
            num /= 10;
        }
        System.out.println(result);
    }
}
