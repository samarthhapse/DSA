import java.util.*;
public class sortingarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[6];
        int flag1=1;
        for(int i=0;i<6;i++){
          arr[i]=sc.nextInt();
        }
        for(int i=1;i<6;i++){
        if(arr[i-1]>arr[i]){
           flag1=0;
        }
       }
        if(flag1==0){
        System.out.println("not sorted");
       }
       else{
        System.out.println("sorted");
       }
    }
}

