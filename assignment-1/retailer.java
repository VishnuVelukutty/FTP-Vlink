// 7. An online retailer sells two products: widgets and gizmos. Each widget    
// weighs 75 grams. Each gizmo weighs 112 grams. Write a program that reads 
// the number of widgets and the number of gizmos 
// in an order from the user. Then your program should compute and display the total weight of the order

import java.util.Scanner;
public class retailer {
    public static void main(String args[]){
        int widgets =75 , gizmos = 112 , weight,cw,cg;

        System.out.println("Enter widgets and gizmos");
        Scanner obj= new Scanner(System.in);
        cw = obj.nextInt();
        cg = obj.nextInt();

        weight = ((cw * widgets) + (cg * gizmos));

        System.out.println("Total weight of widgets and gizmos"+weight);






    }

    
}
