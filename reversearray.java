import java.util.Scanner;

public class reversearray {
    public static int[] reverse(int[]arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        return new int[]{arr[0],arr[end]};
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int[] result= reverse(arr);
        System.out.println(result[0]);
    }
    
}
