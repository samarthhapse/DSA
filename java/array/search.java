import java.util.*;
public class search{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int arr[] = new int[size];
for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
}
System.out.println("Enter the element you want to find :");
int a = sc.nextInt();
for(int i=0;i<size;i++){  
    if(a==arr[i]){
        System.out.println("entered element is present at position " +i );
    }
}
}
}
