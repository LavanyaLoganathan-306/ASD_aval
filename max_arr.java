import  java.util.Scanner;
public class max_arr {
    public static int largest(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            int n= scan.nextInt();
            int[]arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            int answer = largest(arr);

            System.out.println(answer);
        }
    
}
