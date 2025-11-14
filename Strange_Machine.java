import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int qu = sc.nextInt();
            String st = sc.next();
            boolean allA = true;
            for (char c : st.toCharArray()) {
                if (c == 'B') {
                    allA = false;
                    break;
                }
            }
            while (qu-- > 0) {
                long x = sc.nextLong();
                long res= 0;
                if (allA) {
                    res = x;
                } else {
                    int ii = 0;
                    while (x > 0) {
                        if (st.charAt(ii) == 'B') x /= 2;
                        else x--;
                        ii++;
                        if (ii == n) ii = 0;
                        res++;
                    }
                }
                System.out.println(res);
            }
        }
    }
}
