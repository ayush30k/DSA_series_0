import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner principal=new Scanner(System.in);
        Scanner rate=new Scanner(System.in);
        Scanner time=new Scanner(System.in);
        System.out.println("interest = "+(principal.nextInt()*rate.nextInt()*time.nextInt())/100);
    }
}
