import java.util.*;

public class interest {

    public static void invest(double pamt,double roi,double yrs){
        double amt=0;
        for(int i = 1; i<=yrs;i++){
         amt =(pamt*(1+(roi/100)));
         
        }
        System.out.println("The amount is "+amt);
        

    }

    public static void main(String[] args) {
        int pamt,roi,yrs;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Amount,Rate of interest,years");
        pamt = obj.nextInt();
        roi = obj.nextInt();
        yrs = obj.nextInt();

        invest(pamt,roi,yrs);


    }


}
