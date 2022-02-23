package LinkedList;

import LinkedList.MyLinkedList.Node;

public class ListNode {
	int value;
	ListNode next;

	ListNode() {
	}

	ListNode(int value) {
		this.value = value;
	}

	ListNode(int value, ListNode next) {
		this.value = value;
		this.next = next;
	};

	public static ListNode reverseList(ListNode head) {
		ListNode curNode = head;
		while (curNode != null && curNode.next != null) {
			ListNode nextNode = curNode.next;
			curNode.next = nextNode.next;
			nextNode.next = head;
			head = nextNode;
		}
		return head;
	}

	public static void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.printf("%d ", head.value);
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);

		a1.next = a2;
		a2.next = a3;
		
		printLinkedList(a1);
		ListNode newList = reverseList(a1);
		printLinkedList(newList);

	}
}
