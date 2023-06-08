import java.util.*;
public class twodimensionalNULL {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of matrix");
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
        a[i][j]=0;
        System.out.print(a[i][j]);
        }
        System.out.println();
    }
    }
}