import java.util.*;
class Rohith{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> are=new ArrayList<Integer>();
        System.out.println("Enter the Number Of Elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        } 
        s.close();

        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]!=arr[j]){
                    if(!are.contains(arr[i])){
                     are.add(arr[i]);
                    }
                }
            }
        }
        System.out.println("Array Without any dulicates:");
        for(int i=0;i<are.size();i++){
            System.out.println(are.get(i)+" ");
        }
    }
}