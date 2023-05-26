import java.util.*;

public class marks {
    public static void main(String args[]){
        int marks[] = new int[4];
        marks[0]=95;
        marks[1]=96;
        marks[2]=91;
        marks[3]=95;
        // OR //
        int marks[] = {95,96,91,95}; 



        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        //      OR     //
        // one more way of printing //
        for(int i=0;i<4;i++){
            System.out.println(marks[i]);
        }



    }
}



 
