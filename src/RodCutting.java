import java.util.*;

public class RodCutting {
    public static void main (String[] args){
        int[] price = {0,1,5,8,9,10,17,17,20,24,30}; //index= rode length , ar[index]= prize
        int n = 5; //large length 
        
        int table[] = new int [n+1];//array to store maximum value for each length
        for(int k=0 ; k<table.length;k++){
            table[k]=  Integer.MIN_VALUE; 
        }
        System.out.println(cutRod(price, n )); //Recursive approch without table   
        System.out.println(cutRod(price, n ,table)); //Recursive approch with a table to store value 

    }

    public static int cutRod(int price[] , int n){
         if(n == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;   
        for(int i=1; i<n+1 ;i++){
            int temp= price[i]+ cutRod(price,n-i);
           
            if(temp>max){
                max=temp;
            }
        }
        return max;
    } 
    
     public static int cutRod(int price[] , int n, int table[]){
        if(table[n]!=Integer.MIN_VALUE){
            return table[n];
        }
        int max = Integer.MIN_VALUE;  
        if(n==0) {
            max=0;
        }
        for(int i=1; i<n+1 ;i++){
            int temp= price[i]+ cutRod(price,n-i,table);
           
            if(temp>max){
                max=temp;
            }
        table[n]=max;    
        }
        return max;
    }
}
