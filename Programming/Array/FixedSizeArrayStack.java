package String;

public class FixedSizeArrayStack {

	protected int capacity;

	public static final int CAPACITY = 10;

	protected int[] stackRep;

	protected int top = -1;

	public FixedSizeArrayStack() {
		this(CAPACITY);
	}

	public FixedSizeArrayStack(int capacity) {
		this.capacity = capacity;
		stackRep = new int[capacity];
	}

	public int size() {
		return (top + 1);
	}

	public boolean isEmpty() {
		
		return (top < 0);
	}
	
	public void push(int data) throws Exception {
		if(size()== capacity)
			throw new Exception("Stack is Empty");
		stackRep[++top] = data;
	}
	
	public int top() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack Empty");
		
			return stackRep[top];
	}
	
	public int pop() throws Exception
	{
		int data;
		if(isEmpty())
			throw new Exception("Stack Empty");
		
		data = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE;
		return data;
	}
	
	public String toString()
	{
		String s;
		s = "[";
		if(size() > 0)
			s += stackRep[0];
		if(size() > 1)
			for(int i = 1; i < size(); i++ )
			{
				s += ", "+stackRep[i];
			}
		return s +"]";
	}

	public static void main(String[] args) 
	{
		FixedSizeArrayStack fs = new FixedSizeArrayStack();
		try {
			fs.push(1);
			fs.push(2);
			fs.push(3);
			fs.push(4);
			fs.push(5);
			fs.push(6);
			fs.push(7);
			fs.push(8);
			fs.push(9);
			fs.push(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(fs.toString());
	}
}
