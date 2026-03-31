import java.util.Scanner;
public class largest_sec {
    public  int seclargest(int[]arr){
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        secmax = max;
        max = arr[i];
    }
    if(secmax<arr[i] && arr[i]!= max){
        secmax = arr[i];
    }

}

if(secmax == Integer.MIN_VALUE){
    return -1;
}

        return secmax; 
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =scan.nextInt();
        }

        largest_sec result = new largest_sec();
        int value =  result.seclargest(arr);

        System.out.println(value);
    }

    
}
