import java.util.concurrent.atomic.AtomicBoolean;

// class to store a linked list node
class Node {
	int data;
	Node next;
};

class Main
{
	// Helper function to insert a new node in the beginning of the linked list
	public static Node push(Node head, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = head;

		return node;
	}

	// Iterative function to reverse nodes of linked list
	public static Node reverse(Node head)
	{
		Node result = null;
		Node current = head;

		// Iterate through the list and move/insert each node to the
		// front of the result list (like a push of the node)
		while (current != null)
		{
			// tricky: note the next node
			Node next = current.next;

			// move the current node onto the result
			current.next = result;
			result = current;

			// process next node
			current = next;
		}

		// fix head pointer
		head = result;
		return head;
	}

	// Recursive function to check if two linked lists are equal or not
	public static boolean compare(Node a, Node b)
	{
		// see if both list is empty
		if (a == null && b == null) {
			return true;
		}

		return a != null && b != null &&
			(a.data == b.data) &&
			compare(a.next, b.next);
	}

	// Function to split the linked list into two equal parts and return
	// pointer to the second half
	public static Node findMiddle(Node head, AtomicBoolean odd)
	{
		Node prev = null;
		Node slow = head, fast = head;

		// find middle pointer
		while (fast != null && fast.next != null)
		{
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		// for odd nodes, fast still points to last node
		if (fast != null) {
			odd.set(true);
		}

		// make next of prev node null
		prev.next = null;

		// return mid node
		return slow;
	}

	// Function to check if linked list is palindrome or not
	public static boolean checkPalindrome(Node head)
	{
		// base case
		if (head == null) {
			return true;
		}

		// flag to indicate if number of nodes in the linked list is
		// odd or not. It will be passed by reference to findMiddle()
		AtomicBoolean odd = new AtomicBoolean(false);

		// find second half of linked list
		Node mid = findMiddle(head, odd);

		// if number of nodes is odd, advance mid
		if (odd.get()) {
			mid = mid.next;
		}

		// reverse the second half
		mid = reverse(mid);

		// compare first and second half
		return compare(head, mid);
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 2, 1};

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = push(head, keys[i]);
		}

		if (checkPalindrome(head)) {
			System.out.println("Linked list is Palindrome");
		} else {
			System.out.println("Linked list is not a Palindrome");
		}
	}
}