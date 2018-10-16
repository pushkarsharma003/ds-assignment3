import java.util.*;
class SwapElementsInLL
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node (int d)
		{
			data=d;
			next=null;
		}
	}
	void push(int x)
	{
		Node newnode=new Node(x);
		if (head==null)
		{
			head=newnode;
		}
		else
		{
			Node ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=newnode;
		}
	}
	void display()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
	void swapTheElements(int e1,int e2)
	{
		Node p1=head;
		while(p1.data!=e1)
		{
			p1=p1.next;
		}
		Node p2=head;
		while(p2.data!=e2)
		{
			p2=p2.next;
		}
		int temp=p1.data;
		p1.data=p2.data;
		p2.data=temp;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		SwapElementsInLL obj=new SwapElementsInLL();
		int n=s.nextInt();
		int d;
		for (int i=0;i<n;i++)
		{
			d=s.nextInt();
			obj.push(d);
		}
		obj.display();
		System.out.println();
		System.out.println("enter first element");
		int e1=s.nextInt();
		System.out.println("enter second element");
		int e2=s.nextInt();
		obj.swapTheElements(e1,e2);
		System.out.println("after swap :");
		obj.display();
	}
}