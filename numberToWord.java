import java.util.*;
class Rohith{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        

       String word =numberToWord(number);
     System.out.println(word+" ");
    }
    public static  String numberToWord(int num){
      StringBuilder ss=new StringBuilder();
      String[] belowTwenty = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                                "eighteen", "nineteen"};
      String[] Tens={" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
      if(num <20){
        ss.append(belowTwenty[num]);
      }
      else if(num<100){
        ss.append(Tens[num/10]).append(" ").append(belowTwenty[num%10]);
      }
      else if(num <1000){
        ss.append(numberToWord(num/100)).append(" Hundred ").append(numberToWord(num%100));
      }



      return ss.toString().trim();

     

    }
}