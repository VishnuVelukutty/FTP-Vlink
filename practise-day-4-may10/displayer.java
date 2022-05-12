/**
 * Innerdisplayer
 */
public interface in1 {
int display(int p);
    
}

/**
 * testclass implements 
 */
public class testclass implements in1 {

    public int display(int p){
        int i =2 ;
        for(;i<100;i++){
            if(p%i == 0){
                continue;
            }
            i++;
        }
       return p;
    }
    
}

public class displayer {
    public static void main(String[] args) {
        testclass c = new testclass();
        System.out.println(c.display(3));
    }

}
