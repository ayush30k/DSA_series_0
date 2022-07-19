import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        float c;
        System.out.println("enter Indian Currency :");
        Scanner currency=new Scanner(System.in);
        c=currency.nextInt();
        System.out.println("Amount in $ : "+(c/78));
    }
}
