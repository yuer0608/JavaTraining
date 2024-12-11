package HomeWork.HomeWork1201;

public class Task12012 {
    public static void main(String[] args) {

        /**
         * 排序：10个元素的数组，完成冒泡排序和选择排序两种编程。
         */
        int[] arr = { 5, 3, 8, 6, 2, 7, 1, 9, 4, 0 };

        int[] bubbleArr = bubbleSort(arr);
        for (int i = 0; i < bubbleArr.length; i++) {
            System.out.println(bubbleArr[i]);
        }
        // int[] selectionArr = selectionSort(arr);

    }

    public static int[] bubbleSort(int[] arr) {
        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        // 选择排序
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;

    }

}
