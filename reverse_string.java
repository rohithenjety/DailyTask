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