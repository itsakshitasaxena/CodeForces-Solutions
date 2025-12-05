import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        long[] a=new long[n];
        long[] b=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextLong();
        }
        long low = 0L, high = 0L; 
        for (int i = 0; i < n; i++) {
            long na = a[i], nb = b[i];
            long newLow  = Math.min(low - na, nb - high);
            long newHigh = Math.max(high - na, nb - low);
            low = newLow;
            high = newHigh;
        }
        System.out.println(high);
      }
  }
}
