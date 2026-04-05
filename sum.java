import java.util.Scanner;
public class sum {
    public static int findsum(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        return sum;

    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = findsum(n);
        System.out.println(result);
        scan.close();
    }
}
