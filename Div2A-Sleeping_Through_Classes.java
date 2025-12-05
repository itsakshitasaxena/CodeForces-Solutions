import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int k=sc.nextInt();
        String st=sc.next();
        int skip=-1,sp=0;
        for(int i=0;i<n;i++){
          if(st.charAt(i)=='1') skip=i+k;
          if(i>skip)   sp++;
        }
        System.out.println(sp);
      }
  }
}
