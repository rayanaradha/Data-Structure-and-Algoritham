import java.util.*;

public class Fibonaci {
    public static void main(String[] args)  {
        Scanner x = new Scanner (System.in);
        System.out.println("What Fibonaci number you want to find?");
        int a = x.nextInt();
        int ar[] = new int [a+1];
        System.out.println(fib(ar,a));
    }

    public static int fib(int[] ar,int n){
        int ans= 0;
        if(ar[n]!=0){
            return ar[n];
        }
        if(n==1 || n==2){
            ans= 1;
        }
        else{
            ans= fib(ar,n-1) + fib(ar,n-2);
            ar[n]=ans;
        }
        return ans;
    }
}
