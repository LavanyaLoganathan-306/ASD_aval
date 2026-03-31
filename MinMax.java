import java.util.ArrayList;
import java.util.Scanner;
public class MinMax{
    public static ArrayList<Integer> MinMax(int[]arr){
        int max = arr[0];
        int min = arr[0];
       for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max = arr[i];
        }
        if(min>arr[i]){
            min = arr[i];
        }
       }

       ArrayList<Integer> result = new ArrayList<>();
       result.add(max);
       result.add(min);
       return result;

        }

        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[]arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= scan.nextInt();
            }
          ArrayList<Integer> answer = MinMax(arr);

          System.out.println(answer);
        }
        
}
    
    


