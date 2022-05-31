
/**
 * Innertestclass
 */
interface n1 {

   public int display();    


}



class testclass implements n1{
   public int display(int num){

   
        boolean flag = false;

        for (int i=2;i<=num;i++){
            
            if (num%i ==0 ) {
                flag = true;
                break;

                
            }
        

        if(!flag){
           System.out.println("Prime numbers "+num);
           
    }
}
       return num;
       // doesn't return any prime values 

  
}



   
}


public class test{
    public static void main(String[] args) {
        int num = 1000;
        testclass obj = new testclass();
       System.out.println(obj.display());
    }
    }