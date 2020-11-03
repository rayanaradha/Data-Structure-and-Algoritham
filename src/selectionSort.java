import java.util.*;


public class selectionSort {
    public static void main(String[] args)  {
       Scanner x = new Scanner(System.in);
       System.out.println("Please enter the length of Numbers:");
       int t = x.nextInt();
       int [] arr= new int [t];
       System.out.println("Please enter the Numbers:");
       for(int i=0; i<t ;i++){
           arr[i] = x.nextInt();
       }
       ans(arr );
       x.close();
    }

    public static void printArray(int ar[]){
       for(int g : ar){
           System.out.print(g+" ");
       }
    }

    public static void ans(int ar[]){
        for(int i=0 ; i<ar.length-1 ; i++){
            int min= i;  
            for(int j=i+1 ; j<ar.length ;j++){
                 if(ar[j]<ar[min]){
                     min=j;
                 }
             }
             if(min!=i){
                 int temp= ar[min];
                 ar[min]=ar[i];
                 ar[i]=temp;
             }
             System.out.println("\n After the iteration "+ i );     
             printArray(ar);         
        }
        System.out.println("\nAfter  all the iteration -Sorted Array-"); 
        printArray(ar);
     }
 

}
