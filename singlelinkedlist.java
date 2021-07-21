import java.util.Scanner;
import java.io.*;
class node
{
public int data;
public node next;
public node(int id)
{
data=id;
}
}
class Linkedlist
{
private node first,last;
public Linkedlist()
{
first=null;
last=null;
}
public void insertFirst(int id)
{
node newnode=new node(id);
if(first==null)
{
first=newnode;
last=newnode;
}
else
{
newnode.next=first;
first=newnode;
}
}
public void posInsert(int id,int p)
{
node newnode=new node(id);
node temp;
temp=first;
for(int i=1;i<p-1;i++)
temp=temp.next;
newnode.next=temp.next;
temp.next=newnode;
}
public void endInsert(int id)
{
node newnode=new node(id);
if(first==null)
{
first=newnode;
last=newnode;
}
else
{
last.next=newnode;
last=newnode;
}
}
public void beginDelete()
{
first=first.next;
}
public void delpos(int p)
{
node temp;
temp=first;
for(int i=1;i<p-1;i++)
temp=temp.next;
temp.next=temp.next.next;
}
public void endDelete()
{
node temp;
for(temp=first;temp.next.next!=null;temp=temp.next);
temp.next=null;
last=temp;
}
public void display()
{
System.out.println("list :: ");
node temp;
for(temp=first;temp!=null;temp=temp.next)
{
System.out.print("  "+temp.data);
}
}
}
public class singlelinkedlist
{
public static void main(String[]args)
{
int ch,n;
Linkedlist l=new Linkedlist();
DataInputStream in=new DataInputStream(System.in);
try
{
do
{
System.out.println("\n1.Begin insert");
System.out.println("2.Pos Insert");
System.out.println("3.End Insert");
System.out.println("4.Begin Delete");
System.out.println("5.Pos Delete");
System.out.println("6.End Delete");
System.out.println("7.Exit");
System.out.println("Enter your choice: ");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1: System.out.println("Enter a element");
                               n=Integer.parseInt(in.readLine());
                               l.insertFirst(n);
                               l.display();
                               break;
case 2: System.out.println("Enter a number");
                               n=Integer.parseInt(in.readLine());
                               System.out.println("enter position");
                               int p=Integer.parseInt(in.readLine());
                               l.posInsert(n,p);
                               l.display();
                               break;
case 3: System.out.println("Enter a number");
                               n=Integer.parseInt(in.readLine());
                               l.endInsert(n);
                               l.display();
                               break;
case 4: l.beginDelete();
                               l.display();
                               break;
case 5: System.out.println("Enter the position to be deleted: ");
                               int q=Integer.parseInt(in.readLine());
                               l.delpos(q);
                               l.display();
                               break;
case 6: l.endDelete();
                              l.display();
                              break;
}
}while(ch<7);
}
catch(Exception e)
{
}
}
}




