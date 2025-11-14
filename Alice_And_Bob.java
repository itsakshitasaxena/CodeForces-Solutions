import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a=sc.nextInt();
		    int[] ar=new int[n];
		    int x1=0, x2=0,b=0;
		    for(int i=0;i<n;i++){
		        ar[i]=sc.nextInt();
		        if(ar[i]>a)  x1++;
		        else if(ar[i]<a)   x2++;
		        
		    }
		    if(x1>=x2)  b=a+1;
		    else b=a-1;
		    System.out.println(b);
		    
		}
	}
}
