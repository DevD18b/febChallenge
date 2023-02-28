import java.util.*;

public class editDistance {
    public static int minSteps(String str1 , String str2){
     
        int [][] dp = new int [str1.length()][str2.length()];
        for(int [] arr : dp){
            Arrays.fill(arr,  -1);
        }
        return helper(str1, str2 , str1.length()-1, str2.length()-1 , dp);
    }
    public static int helper(String str1 , String str2 , int  i , int j , int [][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
         
        if(dp[i][j]!=-1) return dp[i][j];

        if(str1.charAt(i)==str2.charAt(j)){
       return  dp[i][j] =   helper(str1, str2, i-1, j-1, dp);
        }
        else
        return dp[i][j] =1+ Math.min( helper(str1, str2, i-1, j, dp) , Math.min(helper(str1, str2, i, j-1, dp), helper(str1, str2, i-1, j-1, dp)));
    }
}
