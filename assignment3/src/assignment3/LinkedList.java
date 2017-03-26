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
    public void iterateForwards(){
    	System.out.println("Iterate forward...");
       Nodes temp = root;
       while(temp!=null){
    	   System.out.println(temp.toString());
    	   temp = temp.getNext();
       }
    }
    public void iterateBackwards(){
    	System.out.println("Iterate backward...");
       Nodes temp = root;
       while(temp!=null){
    	   System.out.println(temp.toString());
    	   temp = temp.getPrev();
       }
    }
    public void remove(Nodes node){
    	if (root == null){
    		new RuntimeException("The list is empty");
    	}else{
    		Nodes temp = root;
    		while(temp!= null){
    			temp = temp.getNext();
    		}
    	}
    }
    public void destroy(Nodes node){
    	if (root == null){
    		new RuntimeException("There's nothing to destroy");
    	}else{ 
    		Nodes root = null;
    		while (root == null){
    			System.out.println("List destroyed");
    		}
    	}
    }
}
