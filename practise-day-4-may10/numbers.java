import java.lang.reflect.Method;

public class numbers {

    
    public static boolean cons(int arr [],int n) {

        if(n<1){
            return false;
        }

        int max=arr[0],min=arr[0];
        for (int i : arr) {
          if(arr[i]>max && arr[i]<min){
            max =arr[i];
            min = arr[i];
          }

          boolean visited[] = new boolean[n]; 
          for (int j = 0; j < n; j++) {
            if (visited[arr[j] - min] != false)
            return false;

       
        visited[arr[j] - min] = true;
          }
          return true;
        }
        return false;
    }

          

          
          
          
        
        
    

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int n = arr.length;
        System.out.println(cons(arr, n));
    }
}
