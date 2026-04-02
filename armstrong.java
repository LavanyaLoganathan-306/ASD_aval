import java.util.Scanner;
import java.util.*;
public class armstrong {
    public static boolean armnum(int n){
        int original = n;
        int temp = n;
        int digit = 0;
        if(n<0){
            return false;
        }
       while(n>0){
        n = n/10;
        digit++;
       } 
       int sum = 0;
       while(temp>0){
      int  digits = temp%10;
        sum =  sum +(int)Math.pow(digits, digit);
        temp = temp/10;
       }
       return original == sum;
    }
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      boolean result = armnum(n);
      System.out.println(result);
    }
}
