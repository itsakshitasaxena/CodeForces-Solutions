import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();   // number of elements
            int k = sc.nextInt();   // number of operations
            long[] ar = new long[n];
            for (int i = 0; i < n; i++)  ar[i] = sc.nextLong();
            Arrays.sort(ar); // Sort array (needed for prefix sums)
            long[] pref = new long[n + 1];
            pref[0] = 0;
            for (int i = 0; i < n; i++)    pref[i + 1] = pref[i] + ar[i];
            long ans = 0;
            /* Try all possible i:
             i = number of times we remove 2 minimums
             k - i = number of times we remove 1 maximum */
            for (int i = 0; i <= k; i++) {
                int left = 2 * i;       // removed from start
                int right = k - i;      // removed from end
                if (left + right > n) continue; // Not enough elements to remove
                  /* Remaining elements:
                 from index [left ... n - right - 1]
                 Sum = pref[n - right] - pref[left] */
                long currSum = pref[n - right] - pref[left];
                ans = Math.max(ans, currSum);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
