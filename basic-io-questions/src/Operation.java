import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        int a1,b1;
        String o1;
        System.out.println("Enter two nos");
        Scanner a=new Scanner(System.in);
        a1 = a.nextInt();
        Scanner b=new Scanner(System.in);
        b1= b.nextInt();
        System.out.println("Enter the operator (+, -, *, /)");
        Scanner o=new Scanner(System.in);
        o1=o.next();
        if(o1.equals("+")){
            System.out.println(a1+b1);
        }
        else if(o1.equals("-")){
            System.out.println(a1-b1);
        }
        else if(o1.equals("*")){
            System.out.println(a1*b1);
        }
        else if(o1.equals("/")){
            System.out.println(a1/b1);
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
