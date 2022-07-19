import java.util.Scanner;

public class fibonacciSeriesSum {
    public static void main(String[] args) {
        int a,b,c,n;
        a=0;
        b=1;
        Scanner number=new Scanner(System.in);
        n=number.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i=0;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
