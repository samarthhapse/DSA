import java.util.*;
public class searchin2Darray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter elements of 2D array");
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
           }
        }
        System.out.println("Enter the element to search :");
        int x=sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x==arr[i][j]){
                    System.out.println("Eleent found at "+i+"th row and "+j+"th coloumn");
                }
            //  System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
    }
}