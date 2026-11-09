// [FILENAME]: SLLNode.java
package model;

public class SLLNode {
	public String item;
	public SLLNode nextNode;
	
	public SLLNode(String item) {
		this.item 	  = item;
		this.nextNode = null;
	}
	
	// +--- getters ---+
	public String  getItem() { return this.item; }
	public SLLNode getNext() { return this.nextNode; }
	
	// +--- setters ---+
	public void setItem(String  newItem) { this.item = newItem; }
	public void setNext(SLLNode newNext) { this.nextNode = newNext; }
}