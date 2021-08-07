import java.util.ArrayList;

public class HashTableStruct
{
	
	private int tableCapacity;
	private Node[] hashTable;
	
	
	private HashTableStruct(int tableCapacity)
	{
		this.tableCapacity = tableCapacity;
		this.hashTable = new Node[tableCapacity];
	}
	
	
	//Insert into hash table, handle collisions
	private void insertNode(Node node)
	{
		int nodeIndex = hashFunc(node);
		
		if(hashTable[nodeIndex] == null)
		{
			hashTable[nodeIndex] = node;
		}
		else
		{
			Node tempNode = hashTable[nodeIndex];
			
			while(tempNode.hasNext())
			{
				tempNode = tempNode.getNext();
			}
			
			tempNode.setNext(node);
		}
	}
	
	private void reHashNodes()
	{
		for (int i = 0; i < hashTable.length; i++)
		{
			ArrayList<Node> tempNodes = new ArrayList<Node>();
			
			if (hashTable[i] != null) 
			{
				tempNodes.add(null)
			}
		}
	}
	
	
	private int hashFunc(Node node)
	{
		return (node.getKey().hashCode() % tableCapacity);
	}
	
	
	
	
	
	
}
