
public class twinprime {
    static void prime(int no,int no1)
    {
    int flag=1,flag1=1;
    for(int i=2;i<no;i++)
    {
    if(no%i==0)
    {
    flag=0;
    // System.out.println("not prime"+no);
    break;
    }
    }
    for(int i=2;i<no1;i++)
    {
    if(no1%i==0)
    {
    flag1=0;
    // System.out.println("notprime"+no1);
    break;
    }
    }
    if(flag==1 && flag1==1)
    {
    System.out.print("twin prime number1    "+no);
    System.out.println("twin prime number2    "+no1);
    }
    }
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    int number=3;
    while(number<=100)
    {
    prime(number,number+2);
    number=number+2;
    }
    }
    }
    