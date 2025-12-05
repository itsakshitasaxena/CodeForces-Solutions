import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        long k=sc.nextLong();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int m=0; //count unique
        for(int i=0;i<n;i++){
            if(i==0||a[i]!=a[i-1]){
                a[m++]=a[i];
            }
        }
        boolean[] cov=new boolean[m];
        StringBuilder res=new StringBuilder();
        int blen=0;
        boolean pos=true;
        for (int i = 0; i < m; i++) {
            if(cov[i])  continue;
            int curr=a[i];
            res.append(curr).append(" ");
            blen++;
        
            for(long val=curr;val<=k;val+=curr){
                if(val>a[m-1]){
                    pos=false;
                    break;
                }
                int idx=Arrays.binarySearch(a,0,m,(int)val);
                if(idx<0){
                    pos=false; break;
                }
                cov[idx]=true;
            }
            if(!pos) break;
        }
        if(pos){
            System.out.println(blen);
            System.out.println(res.toString().trim());
        }
        else{
            System.out.println("-1");
        }
       
      }
  }
}
