import java.util.*;
class Arrayupdate
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
int k=s.nextInt();
for(int r=0;r<k;r++)
{
int t=a[0];
int i=0;
for(i=0;i<n-1;i++)
{
a[i]=a[i+1];
}
a[i]=t;
}
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
