public class counter {
    public static int count(String str){
        int count=0;
        for (int i =0;i<str.length();i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Vishnu";
        System.out.println("Number of  Words in the string: " + count(str)+"\n");  
    }
    }
