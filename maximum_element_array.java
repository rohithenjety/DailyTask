import java.util.*;
class Rohit{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of digits");
    int n=sc.nextInt();
    int arr[] =new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    Arrays.sort(arr);
    System.out.println(arr[n-1]+"  Biggest Number " );

   

 }

}