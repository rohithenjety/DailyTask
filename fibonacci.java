import java.util.*;
class Rohith{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number for the fibonacci number : ");
        int n=s.nextInt();
       System.out.println( fibo(n));
       s.close();
    }
    static int fibo(int n){
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    
    }
    
}



//basic code

// class HelloWorld {
//     public static void main(String[] args) {
//  int n=10;
//  int a=0;
//  int b=1;
 
//  System.out.println(a+"\n"+b);
//  while(n>2){
//  int c=a+b;
//  a=b;
//  b=c;
//  System.out.println(c+" ");
//  n--;
//  }
//     }
// }