package assignment3;

public class LinkedList {
	
	private Nodes root = null;
	
	public boolean findNode(Nodes node){
        if(node==null) return false;
        Nodes currentNode = root;
        while(currentNode.getName()!= node.getName())
        {
            currentNode = currentNode.getNext();
            if(currentNode == null)
                return false;
        }
        return true;
    }
    public void iterate(){
    	System.out.println("Iterate forward...");
       Nodes temp = root;
       while(temp!=null){
    	   System.out.println(temp.toString());
    	   temp = temp.getNext();
       }
       
    }
}
