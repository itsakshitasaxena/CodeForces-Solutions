import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		    ar[i]=sc.nextInt();
		int ans=0,si=0,ei=0,sum=0;
		while(ei<ar.length){
		    sum+=ar[ei];
		    while(sum>t){
		        sum-=ar[si];
		        si++;
		    }
		    ans=Math.max(ei-si+1, ans);
		    ei++;
	    
		}
		System.out.println(ans);
	}
}
