public class palindrem {

    static  void Innerpalindrem(String str) {
    
       String reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String." + reverseStr);
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }


  }  


    public static void main(String[] args) {
        String str = "Radar";
        Innerpalindrem(str);
    }



/*
    Input a string which contains some palindrome substrings. 
    Find out the position of palindrome substrings if exist and replace it by . 
    (For example if input string is “bob has a radar plane” 
    then it should convert in “* has a ** plane”.
*/


}
