class matrix{

    int rows;
    int cols;
    int [] [] mat;

public matrix(int rows,int cols){

rows = rows;
cols =cols;
mat = new int[rows][cols]; 


}

    



   public static void main(String[] args) {

    matrix m1 = new matrix();
    System.out.println("Number of rows and columns "+m1);

   }

}
