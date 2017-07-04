package String;

class ListNode {
	private int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public ListNode getNext() {
		return this.next;
	}
}

public class LinkList {

	public ListNode head;
	private int length = 0;

	public LinkList() {
		length = 0;
	}

	public synchronized void insertAtBegin(ListNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	public synchronized void insertAtEnd(ListNode node) {
		if (head == null)
			head = node;
		else {
			ListNode p, q;

			for (p = head; (q = p.getNext()) != null; p = q)
				;
			p.setNext(node);
		}
		length++;
	}

	public void insert(int data, int position) {
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (head == null)
			head = new ListNode(data);
		else if (position == 0) {
			ListNode temp = new ListNode(data);
			temp.next = head;
			head = temp;
		} else {
			ListNode temp = head;
			for (int i = 0; i < position; i++)
				temp = temp.getNext();
			ListNode newNode = new ListNode(data);
			newNode.next = temp.next;
			temp.setNext(newNode);
		}
		length++;
	}

	public synchronized ListNode removeFromBegining() {
		ListNode node = head;
		if (node != null) {
			head = node.getNext();
			node.setNext(null);
		}
		return node;
	}

	public synchronized ListNode removeFromEnd() {
		if (head == null)
			return null;
		ListNode p = head, q = null, next = head.getNext();
		if (next == null) {
			head = null;
			return p;
		}
		while ((next = p.getNext()) != null) {
			q = p;
			p = next;
		}
		q.setNext(null);
		return q;
	}

	public synchronized void remove(int position) {
		if (position < 0)
			position = 0;

		if (position >= length)
			position = length - 1;

		if (head == null)
			return;
		if (head == null) {
			head = head.getNext();
		} else {
			ListNode temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		length--;
	}

	public int getPosition(int data) {
		ListNode temp = head;
		int pos = 0;
		while (temp != null) {
			if (temp.getData() == data)
				return pos;
			pos++;
			temp = temp.getNext();
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {

	}

}
