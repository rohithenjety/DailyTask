import java.util.*;
class Rohith{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number for the fibonacci number : ");
        int n=s.nextInt();
       System.out.println( fibo(n));
    }
    static int fibo(int n){
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
}