import java.util.*;
public class floatingp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input First floating number");
        double n1 = obj.nextDouble();
        System.out.print("Input Second floating number");
        double n2 = obj.nextDouble();



        
        String number1 = Double.toString(n1);
        String number2 = Double.toString(n2);

        int len1 = number1.length();
        int len2 = number2.length();//

        if(len1 == len2){
            int len= len1;
            for(int i=0;i<len;i++){
                if(number1.charAt(i) == number2.charAt(i) ){
                    System.out.println("same numbers"); 
                }
                else if(number1.charAt(i) != number2.charAt(i)){
                    System.out.println("Same till" +number1.charAt(i-1)); 
                    break;
                   
                }
                
                         
    

        }
    }
}
}


        
       

