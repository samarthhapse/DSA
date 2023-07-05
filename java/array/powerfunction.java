// NOTE = MATH.pow(int,int) returns a value of 'double' datatype
import java.util.*;
public class powerfunction {
    static int x;
    static int y;
    public static double moj(int a,int b){
   double calci = Math.pow(a,b);
    return calci;
  
    }
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter x");
     x=sc.nextInt(); 
            System.out.println("Enter y");
     y=sc.nextInt();
System.out.println("x^n is = "+moj(x,y));
    }
}
