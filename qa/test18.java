package qa;
public class test18 {
    
    public class BookDemo{
        public void main(String[] args) {
            Book b = new Book("Vishnu","ABCD",1200);
            System.out.println(b);
        }
    }

public class Book{
    String title, author;
    double price;

    public Book(String title, String author,double price){
        this.author = author;
        this.title = title;
        this.price = price;
    }




public String getTitle()
{
    return title;
}

 public String getAuthor()
{
    return author;
}

public double getPrice()
{
    return price;
}

public void setTitle(String title)
{
    this.title=title;
}

 public void setAuthor(String author)
{
   this.author=author;
}

public void setPrice(double price)
{
    this.price=price;
}  


}



}