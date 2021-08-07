import java.io.*;
import java.util.Scanner;
class Stk
{
int st[],top,max;
Stk(int size)
{
max=size;
st=new int[size];
top=-1;
}
void push(int n)
{
if(top==max-1)
System.out.println("stack is overflow");
else
{
st[++top]=n;
}
}
void pop()
{
if(top==-1)
System.out.println("stack is underflow");
else
{
System.out.println("Deleted:"+st[top]);
top--;
}
}
void display()
{
System.out.print("the values are : :");
for(int i=top;i>=0;i--)
System.out.println(""+st[i]);
}
}
class Stack
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Stk s1=new Stk(5);
int ch,n;
do
{
System.out.println("1.push");
System.out.println("2.pop");
System.out.println("3.exit");
System.out.println("enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1:System.out.println("enter your element");
                             n=s.nextInt();
                             s1.push(n);
                             s1.display();
                             break;
case 2:s1.pop();
                             s1.display();
                             break;
}
}
while(ch<3);
}
}