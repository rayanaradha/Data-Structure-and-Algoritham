import java.util.*;


public class MaxHeap {
  //  int a [] = new int [7]
    public static void main (String[] args){
        int ar [] = {4,1,3,2,16,9,10,14,8,7};
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
        System.out.println("Max Value :"+ar[0]);
        int min=ar[(size/2)+1];
        for(int i=(size/2)+1 ; i<size ;i++){
            if(min>ar[i]){
                min=ar[i];
            }
        }
        System.out.println("Min Value :"+min);


        HeapDelete(ar,10);
        size= size-1;
        System.out.print("after  Delete Element : ");
        printHeap(ar,size);

        insertHeap(ar,15,size);
        size= size+1;
        System.out.print("after Insert Element : ");
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

    //delete element from the tree
    public static void HeapDelete(int[] ar,int a){
        int index =-1; 
        for(int i=0; i<ar.length ;i++){
            if (ar[i]==a){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("this element not at the array");
        }
        else{
            ar[index]= ar[ar.length-1];
            MaxHeapify(ar, index+1 ,ar.length-1);
        }
        
    }

    //insert element into arry
    public static void insertHeap (int arr[],int b, int n){
        arr[n-1]=b;
        while((n/2)>0){
            //System.out.println(arr[(n/2)-1]+"  "+arr[n-1]);
            if(arr[(n/2)-1]<arr[n-1]){
                 int temp=arr[(n/2)-1];
                 arr[(n/2)-1]=arr[n-1];
                 arr[n-1]=temp;
            }
            n=n/2;
        }
           
    }

    public static void printHeap(int[] ar,int n){
        for(int i=0 ; i<n ; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
