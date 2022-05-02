import java.util.*;
public class split{

    public static void main(String[] args) {
        
    
    int ip;

    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a number ");
    ip = obj.nextInt();
    // addition of four

    
if(ip%2==0){
    if(ip%4==0){
        System.out.println("Emerald Team");
    }
    else if(ip%2==0){
        System.out.println("Perl Team");
    }
    
}
else if(ip%2!=0){
    for (int i =1 ; i<=ip;i++){
    if(ip==ip+4){
        System.out.println("Sapphire Team");
    }

    for(int j=3;j<=ip;j++){

    if(ip == ip+4){
        System.out.println("Ruby Team");
    }
}

}
}
}
}