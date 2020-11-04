import java.util.*;

public class BubbleSort {

    public static void printArray(int ar[]){
        for(int g : ar){
           System.out.print(g+" ");
       }
    }

    public static void  bubbleSort(int ar[]){
       for(int i=0 ; i<ar.length-1 ; i++){
           for(int j=0 ; j<ar.length-(1+i) ;j++){
                System.out.println("inside for loop");
                if(ar[j+1]<ar[j]){
                     int temp= ar[j+1];
                     ar[j+1]=ar[j];
                     ar[j]=temp;
                }
            }
       printArray(ar) ;  
       System.out.println();        
       }
       printArray(ar);
    }

    public static void main(String[] args)  {
       Scanner x = new Scanner(System.in);
       int t = x.nextInt();
       int ar [] = new int [t];
       for(int i=0; i<t ;i++){
           ar[i] = x.nextInt();
       }
       
       bubbleSort(ar);
       x.close();
    }
}