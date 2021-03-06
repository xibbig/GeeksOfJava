//stack implementation in Java

class Stack
{
    protected int arr[];
    protected int top1, top2, size;

    /*  Constructor for Stack */
    public Stack(int n)
    {
        size = n;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }
   
    /* function to check if the stacks are empty */
    public boolean isEmpty()
    {
        if(top1==-1 && top2==size)
            return true;
        return false;
    }

    /* Function to check if the stacks are full */
    public boolean isFull()
    {
        if(top1==(size-1) || top2==0 || top1==top2)
            return true;
        return false;
    }

    /* Function to push in stack1 */
    public void push1(int a)
    {
        if(isFull())
	{
            System.out.println("Overflow");
	    System.exit(0);
	}
        /* Check for an empty space just before stack2 */
        if(top1<(top2-1))
        {
            arr[++top1]=a;
 	    System.out.println(a+" is pushed in stack1");
       }
    }

    /* Function to push in stack2 */
    public void push2(int a)
    {
        if(isFull())
	{
            System.out.println("Overflow");
	    System.exit(0);
        }
	/* Check for an empty space just after stack1 */
        if(top2>(top1+1))
        {
            arr[--top2]=a;
 	    System.out.println(a+" is pushed in stack2");
       }
    }

    /* Function to pop from stack1 */
    public int pop1()
    {
        if(isEmpty())
	{
            System.out.println("Underflow");
	    System.exit(0);
	}
        else
        {
            int element = arr[top1--];
            return element; 
        }
        return -1;
    }

    /* Function to pop from stack2 */
    public int pop2()
    {
        if(isEmpty())
	{
            System.out.println("Underflow");
	    System.exit(0);
        }
	else
        {
            int element = arr[top2++];
            return element; 
        }
        return -1;
    }
}

/*  Class Stack implementation */
public class TwoStacks
{
    public static void main(String args[])
    {
        /* Creating object of class Stack */
        Stack s = new Stack(10);
        s.push1(3);
        s.push1(4);
        s.push2(1);
        s.push1(56);
        s.push2(8);
        System.out.println("Element popped from stack1 is: "+s.pop1());
        System.out.println("Element popped from stack2 is: "+s.pop2());
        System.out.println("Element popped from stack1 is: "+s.pop1());
    }
}
