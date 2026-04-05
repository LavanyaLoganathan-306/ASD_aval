import java.util.Scanner;
public class countEvenOdd {
    public int[] CountEvenOdd(int[] arr){
       int countodd = 0;
       int counteven = 0;
 for(int i=0;i < arr.length;i++){
      if(arr[i] %2==0){
        counteven++;
          }
      if(arr[i]%2 == 1){
        countodd++;
      }
 }
 return new int[]{countodd,counteven};
    }
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int n = scan .nextInt();
int[]arr = new int[n];
for(int i=0;i<n;i++){
    arr[i] = scan.nextInt();
}
countEvenOdd result = new countEvenOdd();
int[]value = result.CountEvenOdd(arr);
System.out.println(value[0] +","+ value[1]);
}

}
