import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,temp,sum=0,rem;
        System.out.println("enter the number to check palindrome ");
        Scanner number=new Scanner(System.in);
        n=number.nextInt();
        temp=n;
       while(n>0){
           rem=n%10;
           sum=sum+(int)Math.pow(rem,3);
           n=n/10;
       }
       if(sum==temp){
           System.out.println("Armstrong");
       }
       else{
           System.out.println("Not Armstrong");
       }
    }
}
