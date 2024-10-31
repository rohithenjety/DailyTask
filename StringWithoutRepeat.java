import java.util.HashSet;

import java.util.Scanner;
class Rohith{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ss=s.next();
    HashSet<String> hs=new HashSet<>();
    // char[] ro=ss.toCharArray();
    for(int i=0;i<ss.length();i++){
        hs.add(ss.charAt(i));
    }

    StringBuilder strs = new StringBuilder();
       for (char nu : hs){
      strs.append(nu);
       }
        
    System.out.println("Unique characters: " + strs.toString());
    s.close();
    }
}