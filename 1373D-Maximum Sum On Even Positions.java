import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] ar=new int[n];
		    long sum=0;
		    for(int i=0;i<n;i++){
		        ar[i]=sc.nextInt();
		        if(i%2==0)   sum+=ar[i]; //even indices ele sum
		    }
		    long even=0,odd=0,maxeven=0,maxodd=0;
		    for(int i=0;i+1<n;i+=2){
		        even+=(ar[i+1]-ar[i]);
		        maxeven=Math.max(maxeven,even);
		        if(even<0)   even=0;
		    }
		    for(int i=1;i+1<n;i+=2){
		        odd+=(ar[i]-ar[i+1]);
		        maxodd=Math.max(maxodd,odd);
		        if(odd<0)   odd=0;
		    }
		    System.out.println(sum+Math.max(maxodd,maxeven));
		    
		}
	}
}
