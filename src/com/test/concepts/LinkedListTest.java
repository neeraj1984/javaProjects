package com.test.concepts;

/*
 * It threw "No enclosing instance of type is accessible" comilation error.
 * Need to create inner classes as static
 * 
 */

public class LinkedListTest {

	public static LinkedList testList;

	public static void main(String args[]) {
		// Default constructor - let's put "0" into head element.
		testList = new LinkedList();

		// add more elements to LinkedList
		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");
		testList.add("5");

		System.out.println("Print: crunchifyList: \t\t" + testList);
		System.out.println(".size(): \t\t\t\t" + testList.size());
		System.out.println(".get(3): \t\t\t\t" + testList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + testList.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + testList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + testList.size());
		System.out.println("Print again: crunchifyList: \t" + testList);
	}

	static class LinkedList {

		private static int counter;
		private Node head;

		// Default constructor
		public LinkedList() {

		}

		// appends the specified element to the end of this list.
		public void add(Object data) {

			// Initialize Node only incase of 1st element
			if (head == null) {
				head = new Node(data);
			}

			Node newNode = new Node(data);
			Node currentNode = head;

			// Let's check for Null pointer exception before iterate over currentNode
			if (currentNode != null) {

				// starting at the head node, crawl to the end of the list and
				// then add element after last node
				while (currentNode.getNext() != null) {
					currentNode = currentNode.getNext();
				}

				// the last node's "next" reference set to our new node
				currentNode.setNext(newNode);
			}

			// increment the number of elements variable
			incrementCounter();
		}

		private int getCounter() {
			return counter;
		}

		private void incrementCounter() {
			counter++;
		}

		private void decrementCounter() {
			counter--;
		}

		// inserts the specified element at the specified position in this list
		public void add(Object data, int index) {
			Node tempNode = new Node(data);
			Node currentNode = head;

			// Let's check for NPE before iterate over crunchifyCurrent
			if (currentNode != null) {
				// crawl to the requested index or the last element in the list,
				// whichever comes first
				for (int i = 0; i < index && currentNode.getNext() != null; i++) {
					currentNode = currentNode.getNext();
				}
			}

			// set the new node's next-node reference to this node's next-node
			// reference
			tempNode.setNext(currentNode.getNext());

			// now set this node's next-node reference to the new node
			currentNode.setNext(tempNode);

			// increment the number of elements variable
			incrementCounter();
		}
		
		
		// returns the element at the specified position in this list.
		public Object get(int index)		
		{
			// index must be 1 or higher
			if (index < 0)
				return null;
			Node currentNode = null;
			if (head != null) 
			{
				currentNode = head.getNext();
				for (int i = 0; i < index; i++) 
				{
					if (currentNode.getNext() == null)
					{
						return null;
					}

					currentNode = currentNode.getNext();
				}
				return currentNode.getData();
			}
			return currentNode;

		}

		// removes the element at the specified position in this list.
		public boolean remove(int index) {

			// if the index is out of range, exit
			if (index < 1 || index > size())
				return false;

			Node currentNode = head;
			if (head != null) 
			{
				for (int i = 0; i < index; i++) 
				{
					if (currentNode.getNext() == null)
					{
						return false;
					}

					currentNode = currentNode.getNext();
				}
				currentNode.setNext(currentNode.getNext().getNext());

				// decrement the number of elements variable
				decrementCounter();
				return true;

		   }
			return false;
		}

		// returns the number of elements in this list.
		public int size() {
			return getCounter();
		}

		public String toString() {
			String output = "";

			if (head != null) {
				Node currentNode = head.getNext();
				while (currentNode != null) {
					output += "[" + currentNode.getData().toString() + "]";
					currentNode = currentNode.getNext();
				}

			}
			return output;
		}

	}

	static private class Node {

		// reference to the next node in the chain, or null if there isn't one.
		Node next;

		// data carried by this node. could be of any type you need.
		Object data;

		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object dataValue) {
			data = dataValue;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue;
		}

	}

}
