import java.util.*;
public class transpose{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter elements of 2D array");
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
           }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             System.out.print(arr[j][i]);
            }
            System.out.println();
         }
    }
}
