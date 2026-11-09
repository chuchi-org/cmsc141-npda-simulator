// [FILENAME]: SLLStack.java
package model;

import java.util.NoSuchElementException;

public class SLLStack {
	public SLLNode topNode;
	public int size;
	
	public SLLStack() {
		// default state of SLLStack
		this.topNode = null;
		this.size = 0;
	}
	
	/** 
	 * checks if SLLStack is empty
	 * @return true or false depending if stack is empty
	 */
	public Boolean isEmpty() { return this.size == 0; }
	
	
	/** 
	 * checks if SLLStack is empty
	 * @return the current size
	 */
	public int checkSize() { return this.size; }
	
		
	/**
	 * checks for the top item of the current stack
	 * @return topNode's item
	 */
	public String top() {
		if (this.isEmpty()) {
			throw new NoSuchElementException("stack is empty");
		}
		return this.topNode.getItem();
	}
	
	
	/**
	 * sets the top node of the stack
	 */
	public void setTop(SLLNode newTop) {
		this.topNode = newTop;
	}
	
	/**
	 * pushes a new item to the stack
	 */
	public void push(String item) {
		SLLNode newNode = new SLLNode(item);
		newNode.setNext(this.topNode);	// set new node to point to old top node
		this.topNode = newNode;
		this.size++;
	}
	
	
	/**
	 * gets the topmost item on the stack and returns its value
	 * @return item
	 */
	public String pop() {
		if (this.isEmpty()) {
			throw new NoSuchElementException("stack is empty");
		}
		
		String  popItem  = this.topNode.getItem();
		SLLNode nextNode = this.topNode.getNext();
		this.topNode.setNext(null);
		setTop(nextNode);
		this.size--;
		return popItem;
	}
}