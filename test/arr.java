public class arr {


    
    public static void main(String[] args) {
        
    
    int [] array1 = {12,45,67,23,54};
    int sbig =0;
    int fbig = 0;
    int temp=0;

    for (int i=0;i<array1.length;i++){
        for (int j = i+1; j<array1.length;j++){
        if(array1[i]>array1[j]){
       
        temp = array1[i];
        array1[i] = array1[j];
        array1[j]=temp; 
        sbig = array1[j-1];
    
        }
    }


       

    }

    // descending
    



    System.out.println("Second biggest array"); 
    System.out.println(sbig);
    
}
}
