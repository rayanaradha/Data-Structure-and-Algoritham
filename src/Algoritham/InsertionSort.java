package Algoritham;
import java.util.*;
public class InsertionSort {
    public static void main (String[] args){
       Scanner x = new Scanner(System.in);
       System.out.println("Please enter the length of Numbers:");
       int t = x.nextInt();
       int [] arr= new int [t];
       System.out.println("Please enter the Numbers:");
       for(int i=0; i<t ;i++){
           arr[i] = x.nextInt();
       }
       Sort(arr );
       x.close();
    }

    public static void printArray(int[] ar){
        for(int g : ar){
           System.out.print(g+" ");
       }
    }
 
    public static void Sort(int[] ar){
        for(int i=1 ; i<ar.length ; i++){
           int key= ar[i];
            int j= i-1;  
                 while(j>-1 && ar[j]>key){
                     ar[j+1] =ar[j];
                     j--;
                 }
            ar[j+1]=key;
        System.out.println("\n After the iteration "+ i );     
        printArray(ar);         
        }
        System.out.println("\nAfter  all the iteration -Sorted Array-"); 
        printArray(ar);
     }

}