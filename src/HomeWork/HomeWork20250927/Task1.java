package HomeWork.HomeWork20250927;

// 1、爬楼梯。可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，
// 有的时候一次爬两个台阶。如果这个楼梯有20个台阶，小明一共有多少种爬法呢？

public class Task1 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("小明爬 " + n + " 个台阶共有 " + climbStairs(n) + " 种爬法。");
    }

    // 使用记忆法
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        return climbStairsHelper(n, memo);
    }

    private static int climbStairsHelper(int n, int[] memo) {
        if (memo[n] > 0) {
            return memo[n];
        }
        memo[n] = climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo);
        return memo[n];
    }
}
