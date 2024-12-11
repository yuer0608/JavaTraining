package HomeWork.HomeWork1208;

public class Task120811 {

    /**
     * ## 题目11（很难）
     * 
     * 一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）
     * 
     * ```
     * 888元的奖金被抽出
     * 588元的奖金被抽出
     * 10000元的奖金被抽出
     * 1000元的奖金被抽出
     * 2元的奖金被抽出
     * ```
     */

    public static void main(String[] args) {
        int[] prizes = { 2, 588, 888, 1000, 10000 };
        drawPrize(prizes);
    }

    // 定义方法，判断数组中是否存在某数字，存在返回true,不存在返回false。
    public static boolean isContains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    // 定义方法，模拟抽奖
    public static void drawPrize(int[] prizes) {
        int[] brr = new int[prizes.length];
        int index = 0;
        while (index < prizes.length) {
            int i = (int) (Math.random() * prizes.length);
            if (!isContains(brr, prizes[i])) {
                System.out.println(prizes[i] + "元的奖金被抽出");
                brr[index] = prizes[i];
                index++;
            }
        }
    }
}
