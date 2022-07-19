import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two nos");
        Scanner a1=new Scanner(System.in);
        a=a1.nextInt();
        Scanner b1=new Scanner(System.in);
        b=b1.nextInt();
        if(a>b){
            System.out.println(a+" is Greater");
            return ;
        }
        System.out.println(b+ " is greater");
    }
}
