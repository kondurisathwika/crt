class Methodoverloading
{
void show(int a,int b)
{
System.out.println("2 arg int method");
}
void show(int a,int b,int c)
{
System.out.println("3 arg int method");
}
void show(double a,double b)
{
System.out.println("2 arg double method");
}
public static void main(String args[])
{
Methodoverloading m1=new Methodoverloading();
m1.show(23,91,42);
m1.show(21.9,34.8);
m1.show(32,11);
}
}