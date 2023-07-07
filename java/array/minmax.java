import java.util.*;
public class minmax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
          arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=1;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            System.out.println("Min is = "+min);   
            System.out.println("Min is = "+max);



    }
}
