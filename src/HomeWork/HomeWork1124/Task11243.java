package HomeWork.HomeWork1124;

public class Task11243 {
    public static void main(String[] args) {
        /*
         * ## 题目3
         * 
         * 需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
         * 
         * ​ 假如我有一张足够大的纸，它的厚度是0.1毫米。
         * 
         * ​ 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
         */
        double height = 8844430; // 珠穆朗玛峰的高度
        double paperThickness = 0.1; // 纸的厚度
        int count = 0; // 折叠次数
        while (height > paperThickness) {
            paperThickness *= 2;
            count++;
        }
        System.out.println("折叠" + count + "次，可以折成珠穆朗玛峰的高度");
    }
}
