public class rectangles {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(4, 5);
        Rectangle obj2 = new Rectangle(4, 5);

        System.out.println(obj1.area());

    }
}


class Rectangle{
    int l;
    int b;

    Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }

public int area(){
    int area = l*b;
    return (area);

}
}


