 // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
// import java.lang.*;

class HelloWorld {
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ro=s.nextLine();
        char[] rohith=ro.toCharArray();
        int n=rohith.length;
        for(int i=0;i<n;i+=2){
            int p=rohith[i+1] -'0';
            for(int j=0;j<p;j++){
                System.out.println(rohith[i]);
            }
        }
         s.close();
    }
}



