import java.util.*;

public class GridTravel{
    public static void main(String[] args)  {
        int n=18;
        int m=18;
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(grid(m,n,map));
    }

    public static int grid(int m,int n , Map<String, Integer> map){
        int ans=0;
        String temp= m+","+n;
        if(map.containsKey(temp)){
            return map.get(temp);
        } 
        if(m==0 || n==0){
            return 0;
        }
        if(m==1 && n==1){
            return 1;
        }
        ans=grid(m-1,n,map)+grid(m,n-1,map);
       
        map.put(temp, ans);
        return ans;
    }
}