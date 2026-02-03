import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int[] inf=new int[];
		    for(int i=0;i<m;i++)    inf[i]=sc.nextInt();
		    Arrays.sort(inf);
		    PriorityQueue<Integer> gap=new PriorityQueue<>((a,b)->b-a); //max heap to protect the largets gap first
		  //  Number of uninfected houses between two infected ones
		    for(int i=1;i<m;i;i++) 
		      
		        gap.offer(inf[i]-inf[i-1]-1); // Number of clean houses between two infected ones
		    gap.offer(n-inf[m-1]-inf[0]-1); // Circular gap: last infected → first infected
		    int protected=0;
		    int days=0; //how many days of infection spread already happened
		    while(!gap.isEmpty()){
		        int diff=gap.poll() - 2*days; //infection spreads both sides 
		        if(diff>=3){
		            protected+=gap-1; //Houses that will get infected in this gap
		            days+=2; //Infection advances for two days
		        }
		        else if(diff>=1){ //only 1 or 2 house (save atmost 1 house)
		            protected++;
		            days++;
		        }
		        else break; //all inf can't protect
		    }
		    System.out.println(n-protected); //infected cnt
		}
	}
}
