public class repeat {
    
public static String repeatAllTwice(String stng) 
{
  int l = stng.length();
  String newstring = "";
  for (int i = 0; i < l; i++) 
  {
    newstring += stng.substring(i,i+1) + stng.substring(i, i+1);
  }
  return newstring;
}

public static void main (String[] args)
    {
      String str1 =  "welcome";
      System.out.println("The new string is: "+repeatAllTwice(str1));
	  }
}

