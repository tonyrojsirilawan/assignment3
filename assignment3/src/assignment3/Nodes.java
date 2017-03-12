package assignment3;

public class Nodes {
	
	private int id = 0;
	private String name = "";
	private Nodes next;
	
	public Nodes(int id, String name) {
		this.id = id;
		this.name = name;
		this.next = null;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "ID : "+this.id+" Name : "+this.name;
	}
	public Nodes getNext() {
		return next;
	}

	public void setNext(Nodes node) {
		this.next = node;
	}

}
