package assignment3;

public class Main {

	public static void main (String[] args){
		
		LinkedList list = new LinkedList();
		Nodes node = new Nodes(5, "Book");
		Nodes node2 = new Nodes(3, "Binder");
		
		list.addNode(node);
		list.addNode(node2);
		System.out.println("Length : "+list.size());

		Nodes node3 = new Nodes(4, "Glass");
        list.addNode(node3);
        Nodes node4 = new Nodes(2, "Pen");
        list.addNode(node4);
		System.out.println("Length : "+list.size());
		
		System.out.println("List with all elements: ");
        list.iterateForwards();
        
        list.remove(node3);
        System.out.println("Length : "+list.size());
        System.out.println("List with root removed: ");
        list.iterateBackwards();
	}
}
