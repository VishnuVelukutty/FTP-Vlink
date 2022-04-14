import java.util.Scanner;
public class wave {

    public static void main(String[] args) { 
        int w;

        System.out.println("Enter a wavelength");
        Scanner obj = new Scanner (System.in);
        w = obj.nextInt();

        if(w >=380 && w<=750){
        if (w >= 380 && w < 450){
            System.out.println("Voilet color");
        }
        else if (w >= 450 && w < 495){
            System.out.println("Blue color");
        }
        else if(w >= 495 && w < 570){
            System.out.println("Green Color");
        }
        else if(w >= 570 && w < 590 ){
            System.out.println("Yellow color");
        }
        else if(w >= 590 && w < 620){
            System.out.println("Orange color");
        }
        else if(w >= 620 && w<= 750){
            System.out.println("Red color");
        }
    }
    else {
        System.out.println("Enter a number between 380 to 750");
    }


    }
    
}
