public class middle {
    public static void middleW(String name){
        int i;
           
            i = name.length() / 2 ;
           
            System.out.println(name.charAt(i));
        }

    public static void main(String[] args) {
        String name = "Vishnu";
        
        middleW(name);
    }
}
