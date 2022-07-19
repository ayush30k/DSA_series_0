import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String s,reverse="";
        Scanner name=new Scanner(System.in);
        s=name.next();
        int l,r;
        l=0;
        r=s.length()-1;
        for (int i=r;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        if(reverse.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
