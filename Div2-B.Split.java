import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] ar=new int[2*n];
		    int[] fr=new int[2*n+1];
		    for(int i=0;i<ar.length;i++){
		        ar[i]=sc.nextInt();
		        fr[ar[i]]++;
		    }
		    int odd=0, dist=0;
		    for(int f:fr){
		        if(f==0) continue;
		        else if((f&1)==1)  odd++;
		        else dist++;
		        
		    }
		    int need=odd+2*dist;
		    if(odd==0){
		        if((dist%2)!=(n%2))  need-=2;
		    }
		    System.out.println(need);
		}
		sc.close();
	}
}
