class Methodoverloadingautomatic
{
void show(int a,int b,int c)
{
System.out.println("3 arg int method");
}
void show(float a,float b)
{
System.out.println("2 arg float method");
}
public static void main(String args[])
{
Methodoverloadingautomatic m1=new Methodoverloadingautomatic();
m1.show(23,91,42);
m1.show(21.9f,34.8f);
}
}