import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class increasing {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //System.out.println("");
        int x = obj.nextInt();
        int y = obj.nextInt();
        int z = obj.nextInt(); 
        
        System.out.print("User Input is :"+x+y+z);
        // concat and try 

        if(x<y && x<z && y<z){
            System.out.println("Increasing order");

        }
        else if (z < x && y < x && z < y){
            System.out.println("Decreasing order");

        }

        else{
            System.out.println("Random Order");
        }
    }
}
