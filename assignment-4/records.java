public class records {
   public static class Student{
       int roll;
       long phone;
       String name,address; 
    }
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "Sam";
        obj1.address = "ABABA";
        obj1.phone=123456;
        obj1.roll = 44;

        Student obj2 = new Student();
        obj2.name = "John";
        obj2.address = "BABAB";
        obj2.phone=654321;
        obj2.roll = 43;

        System.out.println("name of 1st student is "+obj1.name +" and roll no is "+obj1.roll );
        System.out.println("name of 2nd student is "+obj2.name +" and roll no is "+obj2.roll );



    }
}
