package String;

public class DynamicArrayStack {
	
	protected int capacity;

	public static final int CAPACITY = 10;

	protected int[] stackRep;

	protected int top = -1;

	public DynamicArrayStack() {
		this(CAPACITY);
	}

	public DynamicArrayStack(int capacity) {
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
			throw new Exception("Stack is full");
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
	
	private void expand(){
		int length = size();
		int newStack[] = new int[length << 1];
		System.arraycopy(stackRep, 0,newStack, 0, length);
		stackRep = newStack;
		this.capacity = length << 1;
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

	public static void main(String[] args)  {
		
		DynamicArrayStack da = new DynamicArrayStack();
		try {
		for (int i = 0; i < 10; i++) {
				da.push(i);
			} 
		da.expand();
		for (int i = 10; i < 18; i++) {
			da.push(i);
		}
		}catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println(da.size());
		}
		
		
	}