/**
 * Innerpoly
 */
abstract class telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect ();
    
}

class smart_telephone extends telephone{
    void ring() {
        System.out.println("Ringing");
    }

    void lift(){
        System.out.println("Phone is lifted");
    }

    void disconnect(){
        System.out.println("the call is cut");
    }

}


public class poly {
    public static void main(String[] args) {
        smart_telephone s = new smart_telephone();
        s.disconnect();
    }
}
