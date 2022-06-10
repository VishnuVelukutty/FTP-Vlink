package qa;
import java.util.*;

/**
 * test1
 */
public class test1 {

    public static void main(String[] args) {
        int age;
        String sex,ms;//reg="(M|F)/gi";


        

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Sex : M/F ");
        sex = s.nextLine();
        if(sex.matches("[M|F|m|f]"))        //take only  M/F

        {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = a.nextInt();

        if (sex.matches("[M|m]") && age >= 20 && age <= 40) {
            System.out.println("Work anywhere");
            
        } else if (sex.matches("[M|m]") && age > 40 && age <= 60 ){
            System.out.println("Urban Areas only");
            
        }
        else{
            System.out.println("Error");
        }

        }
        else{
            System.out.println("InCorrect");

        }

        
    }
}