import java.util.*;

class Rohith{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        System.out.println("enter the string to reverse it's order");
        String name=s.nextLine();
        char temp[] = name.toCharArray();
        int n= temp.length;
        s.close();
        for(int i=0;i<n/2;i++){
            char t =temp[i];
           temp[i]=temp[n-i-1];
           temp[n-i-1] =t;
        }
   
         String reverse=new String(temp);
         System.out.println(reverse+"");
    }
}




//program with reverse a string along with the palindrome.

// import java.util.*;
// class HelloWorld {
//     public static void main(String[] args) {
//  String name="Rohith";
//  String ss=new StringBuilder(name).reverse().toString();
//  System.out.println(ss+" ");
 
//  System.out.println(name.equals(ss));
//     }
// }

// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         StringBuilder ss=new StringBuilder();
//         String s="Rohith";
//         int n=s.length();
        
            
//            ss.append(s);
//            ss.reverse().toString();
            
        
//         System.out.println(ss+" ");
//     }
// }