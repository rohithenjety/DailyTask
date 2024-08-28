// length of the longest substring without repeating the characters
// input: abcabcbb
//output: 3
import java.util.*;
class Rohith{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    String ss=s.nextLine();
    int start=0,end=0,MaxLength=0;
    s.close();
     ArrayList<Character> list= new ArrayList<Character>(); 
    while(end<ss.length()){
        if(!list.contains(ss.charAt(end))){
      list.add(ss.charAt(end));
       end++;
       MaxLength=Math.max(MaxLength,list.size());
        }
        else{
            list.remove(Character.valueOf(ss.charAt(start)));
            start++;
        }
    }
  System.out.println("Max Length Is"+MaxLength);

    }
}