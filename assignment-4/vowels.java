
public class vowels{
   public static int vowelfind(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
        
    }
public static void main(String[] args) {
    String str = "Vishnu";  
    System.out.print("Number of  Vowels in the string: " + vowelfind(str)+"\n");  
}
}