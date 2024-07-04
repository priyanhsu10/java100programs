package basics;

import java.util.Iterator;

//Program to Implement Linked List

public class P045 {
public static void main(String[] args) {
	
	LinkList<Integer> ls= new LinkList<Integer>(110);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	ls.add(50);
	for(int i:ls) {
		
		System.out.println(i);
	}
	
	if(ls.search(30)) {
		
		System.out.println("30 is present");
	}
if(!ls.search(1)) {
		
		System.out.println("1  is not present");
	}
	
}
}

class LinkList<T> implements Iterable<T> {

	Node<T> root = null;
	Node<T> end = null;

	public LinkList(T data )  {

		
		root = new Node<T>(data);
		end = root;

	}

	public void add(T data) {
		Node<T> item = new Node<T>(data);

		end.setNext(item);
		end = item;

	}

	public boolean remove(T data) {

		Node<T> temp = root;
		if (temp.getData().equals(data)) {

			root = temp.getNext();
			return true;
		}

		Node<T> prev = temp;
		while (temp.getNext() != null) {

			temp = temp.getNext();
			if (temp.getData().equals(data)) {
				prev.setNext(temp.getNext());
				return true;
			}
			prev = temp;

		}
		return false;

	}

	public boolean search(T data) {

		Node<T> temp = root;
		while (temp != null) {
			if (temp.getData().equals(data)) {
				return true;
			}
			temp=temp.getNext();
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		
		return new Iterator<T>() {
			Node<T> temp =root;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return temp!=null;
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				T data=null;
				if(temp!=null) {
				 data= temp.getData();
				 temp=temp.getNext();
						
				}
				return data;
			}
		};
	}

}

class Node<T> {

	private T data;
	private Node<T> next;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node(T data) {

		this.data = data;
		next = null;

	}

}
