import java.util.Scanner;
public class sum_digits {
    static int Sumofdigits(int n){
        if (n==0){
            return 0;
        }
        int sum = 0;
        int temp =0;
        while(n>0){
            temp= n%10;
            sum = sum+temp;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
            int n = scan .nextInt();
            int answer = Sumofdigits(n);
        System.out.println(answer);

    }
}
