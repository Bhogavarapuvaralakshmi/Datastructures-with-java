import java.io.*;
import java.util.Scanner;
class queue
{
int q[],f,r,max;
queue(int size)
{
max=size;
f=0;
r=1;
q=new int[size];
}
void enqueue(int n)
{
if(r==max-1)
System.out.println("queue is overflow");
else
{
q[++r]=n;
}
}
void dequeue()
{
if(r==-1)
System.out.println("queue is underflow");
else 
System.out.println("deleted element="+q[f]);
f++;
}
void display()
{
System.out.print("elemetns are :: ");
for(int i=f;i<=r;i++)
System.out.print(q[i]+" ");
System.out.println("\n");
}
}
public class queue1
{
public static void main(String[]args)
{
int ch;
Scanner s=new Scanner(System.in);
queue x=new queue(5);
do
{
System.out.println("1.enqueue");
System.out.println("2.dequeue");
System.out.println("3.exit");
System.out.println("enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1: System.out.println("enter your element");
                              int n=s.nextInt();
                              x.enqueue(n);
                              x.display();
                              break;
case 2: x.dequeue();
                              x.display();
                              break;
}
}
while(ch<3);
}
} 
                          