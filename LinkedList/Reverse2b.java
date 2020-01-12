// Data Structure to store a linked list node
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
};

class Main
{
	// Helper function to print given linked list
	public static void printList(Node head)
	{
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}
		System.out.println("null");
	}

	// Helper function to insert new Node in the beginning of the linked list
	public static Node push(Node head, int data)
	{
		Node node = new Node(data);
		node.next = head;
		return node;
	}

	// Recursive function to reverse the given linked list. It reverses the
	// given linked list by fixing the head pointer first and then .next
	// pointers of very node in reverse order
	public static Node reverse(Node curr, Node prev, Node head)
	{
		// base case: end of the list reached
		if (curr == null) {
			// fix head pointer
			head = prev;
			return head;
		}

		// recur for next node and pass current node as previous node
		head = reverse(curr.next, curr, head);

		// fix current node(Nodes following it are already fixed)
		curr.next = prev;

		return head;
	}

	// The function to reverse the given linked list which takes a
	// reference to the head node
	public static Node reverse(Node head) {
		return reverse (head, null, head);
	}

	// Reverse linked list using recursion
	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6 };

		Node head = null;
		for (int i = keys.length - 1; i >=0; i--) {
			head = push(head, keys[i]);
		}

		head = reverse(head);
		printList(head);
	}
}