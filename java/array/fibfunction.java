import java.util.*;
public class fibfunction {
    static int x;
    static int moj;
    public static int moj(int a){
       if(a==0){
        return 0;
       }
       if(a==1){
        return 1;
       }
       return moj(a-1)+moj(a-2);  
    }
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter x");
     x=sc.nextInt(); 
     System.out.println("fib series is = ");
     for(int i=0;i<x;i++){
     System.out.println(moj(i));
     }

    }
}
