import java.util.*;
public class sortbyboolean{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[6];
        boolean isAscending=true;
        for(int i=0;i<6;i++){
          arr[i]=sc.nextInt();
        }
        for(int i=1;i<6;i++){
        if(arr[i-1]>arr[i]){
           isAscending=false;
        }
       }
        if(isAscending){
        System.out.println("sorted");
       }
       else{
        System.out.println("not sorted");
       }
    }
}


