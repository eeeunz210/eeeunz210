import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(v == arr[j]){
                count++;
            }
        }
        System.out.println(count);
    }
}