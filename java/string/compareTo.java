public class compareTo {     
 public static void main(String args[]){
        String s1="hello students !";
        String s2="lello";
        // copareTo(); function returs following values
        // 1. s1>s2  it returns +ve value   
        // 2. s1=s2  it returns 0 value 
        // 3. s1<s2  it returns -ve value 
        // note : it doesn't compare according to length of strings 
        // note2 : here we could use 
        // if(s1==s2){} but in some cases it gets failed
        if(s1.compareTo(s2)==0){
        System.out.println("s1 is equal to s2");
        }
        else if(s1.compareTo(s2)>0){
            System.out.println("s1 is bigger");
        }
        else{
            System.out.println("s2 is bigger");
        }
        }
    }

