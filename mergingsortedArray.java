import java.util.*;
class Rohith{
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("enter the size if the arr1 ");
       int n=s.nextInt(); 
       System.out.println("enter the size if the arr2 ");
       int m=s.nextInt();
       int arr1[]=new int[n];
       int arr2[]=new int[m];
       int arr3[]=new int[m+n];
       System.out.println("Enter the Array1");
       for(int i=0;i<n;i++){
        arr1[i]=s.nextInt();       
       }

       System.out.println("Enter the Array2");
       for(int i=0;i<m;i++){
        arr2[i]=s.nextInt();       
       }
       s.close();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
          
       mergeArray(arr1,arr2,arr3);




       System.out.println("After Merging the sorted arrays");
       for(int i=0;i<m+n;i++){
        System.out.println(arr3[i]);
       }
    }
   public static void  mergeArray(int[] arr1, int[] arr2,int[] arr3){
    int j=0,k=0,i=0;
       while(i <arr1.length && j < arr2.length){
        if(arr1[i]<arr2[j]){
            arr3[k++] = arr1[i++];
        }
        else{
            arr3[k++]=arr2[j++];
        }
    }
        while(i< arr1.length){
            arr3[k++]=arr1[i++];
        }
        while(j< arr2.length){
            arr3[k++]=arr2[j++];
        }
       


    }
}