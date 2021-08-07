
public class Node {
	private Node next;
	private String value;
	private String key;
	
	public Node(Node next, String value, String key)
	{
		this.next = next;
		this.value = value;
		this.key = key;
	}
	
	public Node(String value, String key)
	{
		this.next = null;
		this.value = value;
		this.key = key;
	}
	
	//Setters
	public void setNext(Node next)
	{
		this.next = next;
	}
	
	//Setters
	public void setValue(String value)
	{
		this.value = value;
	}
	
	//Setters
	public void setKey(String key)
	{
		this.key = key;
	}
	
	//Getters
	public Node getNext()
	{
		return next;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public String getKey()
	{
		return key;
	}
	
	//Next
	public boolean hasNext()
	{
		return (next == null) ? true : false;
	}
}
