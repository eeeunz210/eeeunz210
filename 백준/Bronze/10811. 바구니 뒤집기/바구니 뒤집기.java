import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        int temp = 0;
        
        int arr[] =new int[n+1];
        for(int i = 1;i<=n;i++){
            arr[i]=i;
        }
        
        for(int j =0;j<count;j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int k =a;k<=b;k++){
                int m = b--;
                
                temp = arr[k];
                arr[k] = arr[m];
                arr[m] =temp;
            }
        }
        
        for(int i =1 ;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}