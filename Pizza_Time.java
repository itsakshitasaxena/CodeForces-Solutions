import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int res=0;
            while(n>2){
                res += n/3;
                n = (n/3 + n%3);
            }
            System.out.println(res);
        }
    }
}
