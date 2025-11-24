import java.util.*;
public class Main
{
// 	static int max=100000;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    int n=sc.nextInt();
	    int[] ar=new int[n];
	    long[] freq=new long[100001];
	    int max=0;
	    for(int i=0;i<n;i++){
	        ar[i]=sc.nextInt();
	        freq[ar[i]]++;
	        max=Math.max(max,ar[i]);
	    }
	    long[] dp=new long[max+1];
	    dp[0]=0; 
	    if(max>=1)    dp[1]=freq[1]*1;
	    for(int i=2;i<=max;i++){
	        dp[i]=Math.max(dp[i-1], dp[i-2]+freq[i]*i);
	    }
	    System.out.println(dp[max]);
	}
}
