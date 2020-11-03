public class mergeSort {
    public static void main (String[] args){
        int [] ar = {12, 11 ,13 ,5 , 6 ,7};
        mergeSorting(ar,0,ar.length-1);
    } 

    public static void mergeSorting(int[] A ,int a ,int b ){
        if(a<b){
            int p = (a+b)/2;
            System.out.println("Inside the mergeSort, start value : "+a +"   mid value : "+p +"    end value : "+b);

            System.out.println("Left mergeSort");
            mergeSorting(A,a,p);

            System.out.println("right mergeSort");
            mergeSorting(A,p+1,b);
            merge(A,a,p,b);
        }
        
    }

    public static void merge(int[] A ,int p ,int q ,int r){
        System.out.println("Inside the merge part");
        int n1 = q-p+1;
        int n2 = r-q;
        int[] B = new int [n1+1];
        int[] C = new int [n2+1];

        System.out.println("Initial Arrry ");
        printArray(A);

        B[n1]= Integer.MAX_VALUE;
        C[n2]= Integer.MAX_VALUE;

        for(int i=0 ; i<n1 ;i++){
            B[i] = A[p+i];
        }

        for(int i=0 ; i<n2 ;i++){
            C[i] = A[q+i+1];
        }

        System.out.println("After devide into tempary sub arry ");
        printArray(B);
        printArray(C);

        int i=0;
        int j=0;
        for(int k=p ; k<r+1 ;k++){
            if(B[i]<C[j]){
                A[k]=B[i];
                i++;
            }
            else{
                A[k]=C[j];
                j++;
            }
        }

        System.out.println("Sorted Arrry ");
        printArray(A);
    } 

    public static void printArray(int[] ar){
        for(int g : ar){
            System.out.print(g+" ");
        }
        System.out.println();
     }
}


