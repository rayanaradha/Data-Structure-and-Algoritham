import java.util.*;

public class QuickSort {
    public static void main (String[] args){
        int ar[] = {9,6,5,0,8,2,4,};
        printArray(ar);
        quickSort(ar,0,ar.length-1);
        printArray(ar);
    }

    public static void quickSort(int ar[],int p ,int r){
        if(p<r){
            int q= partition(ar ,p ,r);
            quickSort(ar,p,q-1);
            quickSort(ar,q+1,r);
        }
    }

    public static int partition(int ar[],int p ,int r){
        int x=ar[r];
        int i=p-1;
        for(int j=p  ; j<r ;j++){
            if(ar[j]<x){
                i=i+1;
                int temp= ar[i];
                ar[i]= ar[j];
                ar[j]=temp;
            }
        }
        int temp= ar[r];
        ar[r]= ar[i+1];
        ar[i+1]=temp;

        return (i+1);
    }
    
    public static void printArray(int[] ar){
        for(int g : ar){
            System.out.print(g+" ");
        }
        System.out.println();
     }
}
