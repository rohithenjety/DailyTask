//kth largest element in the array

import java.util.*;
class Rohith{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    
        System.out.println("Enter The Size Of The Array:");
        int n=s.nextInt();
         System.out.println("Which Element of the Array do you want:  ");
         int sc=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        }
        s.close();

        Arrays.sort(arr);
        System.out.println("arrays sorted");
        for(int i=0;i<n;i++){
            System.out.println( arr[i]+"\t ");
            }
            System.out.println("at the asked elemented "+sc);
        System.out.println(arr[n-sc] +"\t ");
    }
}