public class CountingSort {

    static void countingSort(int[] arr) {
        System.out.print("Intial array : ");
        printArray(arr);    
        int b[]= new int[arr.length];    
        //find the maximun value of array
        int max=0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maxium value of Array (Size of count store array) : "+max );
        
        //add count of elments for new array
        int a[]= new int[max+1];
        for(int i=0; i<arr.length ;i++){
            a[arr[i]]++;
        }
        System.out.print("count store Array : ");  
        printArray(a);
    
        for(int i=1; i<max+1; i++){
            a[i] = a[i]+a[i-1];
        }
        
         System.out.print("cumlative count store array (this give the index of the elements) : ");  
         printArray(a);
         
         for(int j=arr.length-1 ; j>-1 ;j-- ){
            a[arr[j]] = a[arr[j]] -1; 
            b[a[arr[j]]] =arr[j]; 
            
         }
         System.out.print("sorted array : ");  
         printArray(b);
        }  
        
        public static void printArray(int[] ar){
            for(int g : ar){
                System.out.print(g+" ");
            }
            System.out.println();
         }

         public static void main (String args[]) {
             int [] arr = {19 ,10 , 12 ,10 ,24 ,25 ,22};
             countingSort(arr);

         }
}
