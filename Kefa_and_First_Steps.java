import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		    ar[i]=sc.nextInt();
		int cnt=1,max=1;
		for(int i=0;i<n-1;i++){ 
		    if(ar[i]<=ar[i+1]){
		        cnt++;
		        max=Math.max(cnt,max);
		    }
		    else{
		        cnt=1;
		    }
		}
		System.out.println(max);
	}
}
