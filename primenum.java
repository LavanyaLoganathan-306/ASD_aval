import java.util.Scanner;
public class primenum {
      static boolean isprime(int n){
         for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
         }
        return true;
      }
      public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
boolean value = isprime(n);
System.out.println(value);
          }
    
}
