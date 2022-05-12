/**
 * Innerpoly
 */
abstract class monkey {
    abstract void jump();
    abstract void bite();
    
}

class human extends monkey implements basicanimal{
    void jump() {
        System.out.println("Jumps");
    }

    void bite(){
        System.out.println("Biting");
    } 

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}

/**
 * basicanimal
 */
public interface basicanimal {
void eat();
void sleep();
    
}


public class poly2 {
    public static void main(String[] args) {
        human h = new human();
        h.eat();
    }
}
