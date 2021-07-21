import java.io.*;
import java.util.Scanner;
class node
{
int data;
node next;
node(int id) 
{
data=id;
}
}
class queue1
{
node f,r;
queue1()
{
f=r=null;
}
void enqueue(int id)
{
node newnode=new node(id);
if(r==null)
{
f=r=newnode;
}
else
{
r.next=newnode;
r=newnode;
}
}
void dequeue()
{
if(r==null)
System.out.println("queue is empty");
else
{
System.out.println("deleted element="+f.data);
f=f.next;
}
}
void display()
{
node temp;
System.out.println("elements are ::");
for(temp=f;temp!=null;temp=temp.next)
{
System.out.println(temp.data+" ");
}
}
}
class queueulinked1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
queue1 x=new queue1();
int ch;
do
{
System.out.println("1.enqueue \n2.dequeue \n3.exit");
System.out.println("enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1: System.out.println("enter an element");
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

