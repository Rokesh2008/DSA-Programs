import java.util.*;
public class largest_common_substring {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = str.length();
        int len2 = str2.length();
        int[][] dp = new int[len1+1][len2+1];
        int max = 0;
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(str.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}
