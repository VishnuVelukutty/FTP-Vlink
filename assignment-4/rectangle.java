import java.util.*;

public class rectangle {
    static int getArea(int l,int b){
        return l*b;
    }

    
    public static void main(String[] args) {
        int l,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length and breadth");
         l = obj.nextInt();
         b = obj.nextInt();

         System.out.println(getArea(l,b));

    }
}
