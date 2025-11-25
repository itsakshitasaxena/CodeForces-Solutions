import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int min=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt=cnt-a[i];
            cnt=cnt+b[i];
            if(cnt>min)min=cnt;
        }
        System.out.println(min);
    }
}
