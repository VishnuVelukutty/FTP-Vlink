import java.lang.reflect.Method;

public class repeater {
    /**
     * Innerrepeater
  
     */
    public static void Innerrepeater(String str) {
        String str1 = str.substring(0,3);
        System.out.println(str1);
        String str2 = str.substring(8,12);
        System.out.println(str2);

        int count=3;
        System.out.println(str1.repeat(count)+str2.repeat(count));
    }

    public static void main(String[] args) {
        String str = "Try and best";
        Innerrepeater(str);
    }
    // using string split then repeat methods
    // split 'try' and 'best'
}
