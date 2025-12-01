import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[][] ar=new int[n][n];
		    int val=1;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            ar[i][j]=val++;
		        }
		    }
		    int max=0;
		    int[] dx={1,-1,0,0};
		    int[] dy={0,0,1,-1};
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            int cost=ar[i][j];
		            for(int rc=0;rc<4;rc++){
		                int ri=i+dx[rc], rj=j+dy[rc];
		                if(ri>=0&&ri<n&&rj>=0&&rj<n)
		                    cost+=ar[ri][rj];
		            }
		            max=Math.max(cost, max);
		        }
		    }
		    System.out.println(max);
		}
	}
}
