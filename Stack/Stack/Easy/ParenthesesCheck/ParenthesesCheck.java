//stack implementation in Java

class Stack
{
    protected char arr[];
    protected int top, size;

    /*  Constructor for Stack */
    public Stack(int n)
    {
        size = n;
        arr = new char[size];
        top = -1;
    }

    /* Function to check if the stack is empty */
    public boolean isEmpty()
    { 
        if(top<=-1)
            return true;
        return false;
    }

    /* Function to check if the stack is full */
    public boolean isFull()
    {
        if(top>=(size-1))
            return true;
        return false;
    }

    /* Function to push the left parentheses or left bracket or left brace in the stack*/
    public void push(char a)
    {
        if(isFull())
        {
            System.out.println("Overflow");
	    System.exit(0);        
	}
        else
        {
            arr[++top]=a;
        }
    }

    /* Function to pop the elements from a stack */
    public char pop()
    {
        if(isEmpty())
	{
            System.out.println("Underflow");
	    System.exit(0);
	}
        else
        {
            char element = arr[top--];
            return element;
        }
        return '\0';
    }
}

/*  Class Stack implementation */
public class ParenthesesCheck
{
    public static void main(String []args)
    {
	String check = "{[()(())]}";
        /* Creating objects of class Stack */
        Stack s = new Stack(check.length());
        boolean flag = true;
        for(int i=0;i<check.length();i++)
        {
	    char letter = check.charAt(i);
            if(letter=='(' || letter=='[' || letter=='{')
	        s.push(letter);
	    else
            {
                char ch = s.pop();
       	        if (letter == ')')
                    if (ch != '(')
		        flag = false;
	        if (letter == '}')
                    if (ch != '{')
		        flag = false;
	        if (letter == ']')
                    if (ch != '[')
		        flag = false;     
	    }
        }
	if(flag && s.isEmpty())
	    System.out.println("valid");
	else
	    System.out.println("invalid");
    }
}
