// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
public class count {
    static int countof0=0;
 static int countofE=0;
  static int countofO=0;
  static int a;
  public static int seperate(int x){
            if(x==0){
                countof0++;
            }
            else if(x%2==0){
                countofE++;
            }
            else{
                countofO++;
            }
            return 0;
           }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         for(int i=1;i<100;i++){
         System.out.println("Enter the number OR enter 999 if numbers end :");
         a=sc.nextInt();
         if(a==999){
            break;
         }
         else{
          seperate(a);
         }
        }
         System.out.println("no. of 0s is ="+countof0);
         System.out.println("no. of evens is ="+countofE);
         System.out.println("no. of odds is ="+countofO);
         }
    }
