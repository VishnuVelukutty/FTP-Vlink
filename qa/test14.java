package qa;

public class test14 {
    public static void main(String[] args) {

        

        subclass obj = new subclass();

        obj.a_method();

        obj.non_abstract_method();

    } 
}

abstract class Absclass{

    

    Absclass(){

        System.out.println("This is constructor of abstract class: ");

    }

    

    abstract void a_method();

    public void non_abstract_method(){

        System.out.println("This is a normal method of abstract class: ");

    }

} 


class subclass extends Absclass{


    @Override

    public void a_method(){

        System.out.println("This is abstract method: ");

    }

}