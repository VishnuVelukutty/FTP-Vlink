package qa;

public class test17 {
    public static void main(String[] args) {
        student obj = new student();
        obj.ss = "Vishnu";
        //Student ss1 = new Student();
        System.out.println(obj.ss);
        System.out.println(obj.name);

    }
}

class student{
    String ss;
   String name;
 public student(String ss){
     name = ss;
 }
 public student()
 {
     name = "unknown";
 }
}