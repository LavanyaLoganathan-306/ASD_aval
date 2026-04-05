import java.util.Scanner;
public class reverse {
    public static int Reverse(int n){
       int reverse = 0;
       int digit =0;
       while(n>0){
          digit = n%10;
          reverse = reverse*10 + digit;
          n = n/10;
       }
       return reverse;
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan .nextInt();
        int result = Reverse(n);
        System.out.println(result);
        scan.close();
    }
}
