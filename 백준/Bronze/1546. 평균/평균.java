import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double avg,max =0, sum=0;
        double arr[] = new double[n];
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            
            if(max<arr[i])max = arr[i];
        }
        
        for(int j=0;j<arr.length;j++){
            
            arr[j] = (arr[j]/max)*100;
            sum += arr[j];
        }
        
        avg = sum/n;
        System.out.print(avg);
        sc.close();
        
    }
}