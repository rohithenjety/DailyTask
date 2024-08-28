import java.util.*;
class Rohith{
    public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   int max=Integer.MIN_VALUE;
//    int second=0;
   int second = Integer.MIN_VALUE;
   int arr[]=new int[5];
   for(int i=0;i<5;i++){
    arr[i]=s.nextInt();
   }
   s.close();
    //  Arrays.sort(arr);
   for(int i=0;i<5;i++){
    if(arr[i] >max){
        second=max;
        max=arr[i];    
    }
    else if(arr[i] >second && arr[i] != max){
        second=arr[i];
    }
   }
   System.out.println("Second largest number : "+second);
    }
}