import java.util.*;
public class HeapSort {

  //  int a [] = new int [7]
    public static void main (String[] args){
       // int ar [] = {4,1,3,2,16,9,10,14,8,7};
        int ar [] = {2,4,1,5,3,7};
        int size = ar.length;
        System.out.print("Initial Array : ");
        printHeap(ar,size);
        for(int i=size/2; i>0 ; i--){
               MaxHeapify(ar,i ,size);
               if(i==1){
                   System.out.print("Max Heap : ");
               }else{
                System.out.print("MaxHeapify steps : ");
               }
               printHeap(ar,size);
        }
      
        System.out.println("After Max-Heapify function :");
        
        for(int i=size-1; i>0 ; i--){
            int temp=ar[0];
            ar[0]=ar[i];
            ar[i]=temp;
            MaxHeapify(ar,1 ,i);
            System.out.println("after a call MaxHeapify function :");
            printHeap(ar,size);
        }

        System.out.println("After Heap-Sort function :");
        printHeap(ar,size);
        
    }
    
    public static void MaxHeapify(int[] ar, int i, int n){
        int l = 2*i-1;
        System.out.println("L :"+l);
        int r = 2*i;
        System.out.println("R :"+r);
        int largest =i-1;
        System.out.println("I :"+(i-1));
        if(l<n && ar[largest]<ar[l]){
            largest=l;
        }
        if(r<n && ar[largest]<ar[r]){
            largest=r;
        }
        if(i-1!=largest){
            int temp= ar[i-1];
            ar[i-1]=ar[largest];
            ar[largest] = temp;
            MaxHeapify(ar, largest+1 ,n);
        }
       
    }


    public static void printHeap(int[] ar,int n){
        for(int i=0 ; i<n ; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
