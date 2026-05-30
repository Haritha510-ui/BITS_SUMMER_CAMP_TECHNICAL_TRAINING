package Day12;

import java.util.Arrays;

public class DynamicProgram {
    public static void main(String[] args) {
         int n = 5;
         int sum = 0;
         int dp[] = new int[n + 1];
         dp[0] = 0;
         for(int i = 1; i <= n; i++) {
             dp[i] = dp[i - 1] + i;
         }
         System.out.println(Arrays.toString(dp));
         for(int i = 1; i <=n; i++) {
            if(dp[i] == sum) {
                System.out.println(i+1);
                break;
            }
         }
    }
}
