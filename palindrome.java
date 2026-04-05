import java.util.Scanner;
public class palindrome {
    public static int palindrome(int n){
        int reverse = 0;
        int digit=0;
        while(n>0){
            digit = n%10;
            reverse = reverse *10 + digit;
            n = n /10;
        }
        return reverse;

    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int result = palindrome(n);
        System.out.println(result);
        scan.close();
    }
}
