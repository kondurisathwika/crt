import java.util.*;
class Countrotation
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int min=a[0],r=0;
for(int i=0;i<n-1;i++)
{
if(min>a[i])
{
min=a[i];
r=i;}
}
System.out.println(r);
}
}

