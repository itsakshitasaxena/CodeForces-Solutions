import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] ar=new int[n];
		    for(int i=0;i<n;i++){
		        ar[i]=sc.nextInt();
		    }
		    HashMap<Integer, Integer> map=new HashMap<>();
		    int ans=0;
		    for(int i:ar)
		        map.put(i,map.getOrDefault(i,0)+1);
		    for(int key:map.keySet()){
		        int val=map.get(key);
		        if(key==0)   ans+=val;
		        else if(val<key)  ans+=val;
		        else  ans+=(val-key);
		    }
		    System.out.println(ans);
		}
	}
}
