import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n+1];
		for(int i=1;i<=n;i++){
		    ar[i]=sc.nextInt();
		}
		int min=1;
		for(int i=1;i<=n;i++){
		    int dep=1;
		    int emp=ar[i];
		    while(emp!=-1){
		        dep++;
		        emp=ar[emp];
		        
		    }
		    min=Math.max(min, dep);
		}
		System.out.println(min);
	}
}
