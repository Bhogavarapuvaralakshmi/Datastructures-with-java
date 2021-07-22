import java.io.*;
import java.util.Scanner;
class node
{
int d;
node pre,next;
}
class dequeue4
{
node f,r;
dequeue4()
{
f=r=null;
}
node create(int m)
{
node temp=new node();
temp.d=m;
temp.next=null;
temp.pre=null;
return(temp);
}
void enqueuef(int m)
{
node temp=create(m);
if(f==null)
{
f=temp;
r=f;
}
else
{
temp.next=f;
f.pre=temp;
f=temp;
}
}
void enqueueb(int m)
{
node temp=create(m);
if(r==null)
{
r=temp;
f=r;
}
else
{
r.next=temp;
temp.pre=r;
r=temp;
}
}
void dequeuef()
{
if(r==null)
System.out.println("empty");
else
{
node temp=f;
f=f.next;
f.pre=null;
}
}
void dequeueb()
{
if(r==null)
System.out.println("empty");
else
{
node temp=r;
r.pre.next=null;
r=r.pre;
}
}
void display()
{
node t=f;
while(t!=null)
{
System.out.println(""+t.d);
t=t.next;
}
}
}
class dequeue2
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
dequeue4 x=new dequeue4();
int ele,ch;
do
{
System.out.println("\n1.enqueuef \n2.enqueueb \n3.dequeuef \n4.dequeueb\n5.exit");
System.out.println("enter your choice");
ch=s.nextInt();
switch(ch)
{
case 1:System.out.println("enter an element");
                             ele=s.nextInt();
                             x.enqueuef(ele);
                             x.display();
                             break;
case 2:System.out.println("enter an element");
                              ele=s.nextInt();
                              x.enqueueb(ele);
                              x.display();
                              break;
case 3: x.dequeuef();
                              x.display();
                              break;
case 4:x.dequeueb();
                              x.display();
                              break;
}
}while(ch<5);
}
}