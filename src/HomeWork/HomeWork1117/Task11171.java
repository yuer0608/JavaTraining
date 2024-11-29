package HomeWork.HomeWork1117;

/*
韩信点兵，士兵排成一排：

三人一组多一个。
五人一组多两个。
七人一组多三。
问士兵的最小人数是多少？
*/

public class Task11171 {
    public static void main(String[] args) {

        // for
        for (int i = 0;; i++) {
            if (i % 3 == 1 && i % 5 == 2 && i % 7 == 3) {
                System.out.println("max count(for): " + i);
                break;
            }
        }

        // while
        int count = 0;
        while (true) {
            if (count % 3 == 1 && count % 5 == 2 && count % 7 == 3) {
                System.out.println("max count(while): " + count);
                break;
            }
            count++;
        }
    }
}
