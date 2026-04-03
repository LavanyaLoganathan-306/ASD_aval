import java.util.ArrayList;
import java.util.Scanner;
public class Swap {
    static ArrayList<Integer> swapnum(int a, int b){
         a = a+b;
         b = a-b;
         a = a-b;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;

    }
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        ArrayList<Integer> answer = swapnum(a,b);

        System.out.println(answer);
    }
}
