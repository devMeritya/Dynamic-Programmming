
import java.util.Scanner;

public class CoinChangeAgain {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int money= scanner.nextInt();
         int coins[]={1,3,4};
         System.out.println(minCoins(coins, money, new int[money]));
    }

    public static int minCoins(int[] coins,int money,int dp[]){
        if(money==0)
        return  0;
        if(money<0)
            return -1;
        int min=Integer.MAX_VALUE;
        if(dp[money-1]!=0)return  dp[money-1];
        for(int coin:coins)
        {
            int res=minCoins(coins, money-coin, dp);
            if(res>=0 && res<=min)
                min=res+1;
        }
        dp[money-1]=(min==Integer.MAX_VALUE)?-1:min;
        return dp[money-1];

    }


}
