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
class Stack1
{
node top;
Stack1()
{
top=null;
}
void push(int id)
{
node newnode=new node(id);
if(top==null)
{
top=newnode;
}
else
{
newnode.next=top;
top=newnode;
}
}
void pop()
{
if(top==null)
System.out.println("Stack is empty");
else
{
System.out.println("deleted element="+top.data);
top=top.next;
}
}
void display()
{
node temp;
System.out.print("the elements are::");
for(temp=top;temp!=null;temp=temp.next)
{
System.out.println(""+temp.data);
}
}
}
class Stacklinked
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Stack1 y=new Stack1();
int ch,n;
do
{
System.out.println("\n1.push \n2.pop \n3.exit");
System.out.println("enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1:System.out.println("enter an element");
                             n=s.nextInt();
                             y.push(n);
                             y.display();
                             break;
case 2:y.pop();
                            y.display();
                            break;
}
}while(ch<3);
}
}