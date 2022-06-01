import java.util.*;
public class random {
    public static void main(String[] args) {
        int random=6,ui; //need random generator
        for(int i=1;;i++){
        System.out.println("Enter a number");
            Scanner obj = new Scanner(System.in);
            ui = obj.nextInt();



        if(ui > random){
            System.out.println("Too High");
        }
        else if(ui<random){
            System.out.println("Too low");
        }
        else{
            System.out.println("Gussed it right");
            break;
        }
    }


    }
}
