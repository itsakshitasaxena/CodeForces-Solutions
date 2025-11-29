import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                long[] a = new long[n];
                long[] b = new long[n];
                for (int i = 0; i < n; i++) 
                    a[i] = sc.nextLong();
                for (int i = 0; i < n; i++) 
                    b[i] = sc.nextLong();
                long[] pref = new long[n];
                pref[0] = a[0];
                long ans = a[0];
                for (int i = 1; i < n; i++) {
                    pref[i] = Math.max(a[i], a[i] + pref[i-1]);
                    ans = Math.max(ans, pref[i]);
                }
                if (k % 2 == 0)    System.out.println(ans);
                else {
                    long[] suff = new long[n];
                    suff[n-1] = a[n-1];
                    for (int i = n-2; i >= 0; i--) 
                        suff[i] = Math.max(a[i], a[i] + suff[i + 1]);
                    
                    for (int i = 0; i < n; i++) {
                        long curr_sum = pref[i]+suff[i]-a[i]+b[i];
                        ans = Math.max(ans, curr_sum);
                    }
                    System.out.println(ans);
                }
            }
        sc.close();
    }
}
