import java.util.*;


public class grades {

 public static double avg(int marks[],int max ) {
            int sum=0;
            double average=0.0;
            
            for (int i=1;i<max;i++){ 
            sum+=marks[i];
            average=sum/(i); }
            return average; 


    }

    public static void main(String[] args) {
        int [] marks = new int[20];
        int i;
        Scanner obj = new Scanner(System.in);

        for(i =0;i<20;i++){
            System.out.println("Enter Marks: ");
            marks[i] = obj.nextInt();
            if(marks[i]==-1){
                break;
            }
        }
        System.out.println(avg(marks,i-1));
    }
}




