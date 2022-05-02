public class arr {


    
    public static void main(String[] args) {
        
    
    int [] array1 = {12,45,67,23,54};
    int [] sbig ={};
    int fbig = 0;
    int temp=0;

    for (int i=0;i<array1.length;i++){
        for (int j = i+1; j<array1.length;j++){
        if(array1[i]>array[j]){
       
        temp = array1[i];
        array1[i] = array1[j];
        array1[j]=temp; 
    
        }
    }


       

    }

    // descending
    



    System.out.println("First biggest array"); 
    System.out.println(fbig);
    
}
}
