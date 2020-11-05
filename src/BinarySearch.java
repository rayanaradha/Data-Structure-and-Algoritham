import java.util.*;

public class BinarySearch {
    public static void main (String[] args){
        int ar [] = {12,23,56,22,11,33,67};
        Arrays.sort(ar);
        System.out.println("sorted array");
        for(int a : ar){
            System.out.print(a+" ");
        }
        System.out.println();
        int num =56;
        int index=algoritham(ar,0,ar.length-1,num);
        if (index>-1 ){
            System.out.println(num+" at the "+ index+" index") ;
        }
        else{
         System.out.println(num+" not in the array");
        }
     
    }

    public static int algoritham(int ar[], int start , int end , int num){
        if(end>start-1){
            int mid = start+(end-start)/2;
            if(ar[mid]==num){
                return mid;
            }
            else if(ar[mid]>num){
                return algoritham(ar, start, mid-1, num);
            }
            else{
                return algoritham(ar, mid+1, end, num);
            }
        }
        return -1;
    }
}
    
    
