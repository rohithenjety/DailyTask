import java.util.*;
class Rohith{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n=s.nextInt();
        ArrayList<Integer> are=new ArrayList<Integer>(); //by these ArrayList we can perform the actions which we cannot by normal
        int arr[]=new int[n];
        int arm[]=new int[n];
       System.out.println("First Array");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        } 
        System.out.println("Second Array");
        for(int i=0;i<n;i++){
            arm[i]=s.nextInt();
        }
      s.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arm[j]){
                    if(!are.contains(arr[i])){
                        are.add(arr[i]);
                     }
                }
            }
        }
        System.out.println("Intersecting Numbers are :");
        for(int i=0;i<are.size();i++){
            System.out.println(are.get(i)+"");
        }
    }
}