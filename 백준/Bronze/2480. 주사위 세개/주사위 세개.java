import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
  
        
        if(a==b && b==c){
            result = 10000+a*1000;
        }else if(a==b && a!=c || a==c && a!=b){
            result = 1000+a*100;
        }else if(b==c && b!=a){
            result = 1000+b*100;
        }else{
            int m = a;
            if(m<b)m=b;
            if(m<c)m=c;
            result = m*100;
        }
        
        System.out.println(result);
        sc.close();
    }
}