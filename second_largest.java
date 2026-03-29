import java.util.Scanner;
class secong_largest{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[]arr = new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}