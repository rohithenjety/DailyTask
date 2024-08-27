import java.util.*;
class Rohith{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       String name=sc.nextLine();
      if(palindrome_check(name)){
        System.out.println("It is a Palindrome Number");
      }else{
        System.out.println("it is not a palindrome number");
      }
       sc.close();
    }
    public static boolean palindrome_check(String name){
       String names= name.toUpperCase();
        int l=names.length();
        for(int i=0;i<l/2;i++){
            if(names.charAt(i) != names.charAt(l-i-1)){
                return false;
            }
        }
        return true;
          
    }
}