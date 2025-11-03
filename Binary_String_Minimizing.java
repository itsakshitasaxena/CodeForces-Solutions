import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long k=sc.nextLong();
		    String st=sc.next();
		    int pos=0;
		    char[] ans=new char[n];
		    Arrays.fill(ans,'1');
		    for(int i=0;i<n;i++){
		        if(st.charAt(i)=='0'){
		            long move=Math.min(k,i-pos); //min pos where we can put 0
		            ans[(int)(i-move)]='0'; //put 0 to that pos
		            k-=move; //reduce those no. of moves
		            pos++; //update pos
		        }
		    }
		    System.out.println(new String(ans));
		}
		    
	}
}
