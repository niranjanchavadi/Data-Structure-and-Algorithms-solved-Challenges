// Data Structure to store a linked list node
class Node {
	int data;
	Node next = null;

	Node(int data) {
		this.data = data;
	}
};

class Main
{
	// Wrapper over Node class
	static class NodeWrapper {
		public Node node;

		NodeWrapper(Node node) {
			this.node = node;
		}
	}

	// Helper function to insert new node in the beginning of the linked list
	public static Node push(Node head, int data)
	{
		Node node = new Node(data);
		node.next = head;
		return node;	// return node which would be new head
	}

	// Recursive function to check if linked list is palindrome or not
	public static boolean checkPalindrome(NodeWrapper left, Node right)
	{
		// base case
		if (right == null) {
			return true;
		}

		boolean result = checkPalindrome(left, right.next) && (left.node.data == right.data);
		left.node = left.node.next;

		return result;
	}

	// Function to check if linked list is palindrome or not
	public static boolean checkPalin(Node head)
	{
		// Wrap head node so it's reference can be changed inside checkPalindrome() method
		return checkPalindrome(new NodeWrapper(head), head);
	}

	// main method
	public static void main(String[] args) {
		// input keys
		int[] keys = {1, 3, 5, 3, 1};

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = push(head, keys[i]);
		}

		if (checkPalin(head)) {
			System.out.print("Linked list is Palindrome");
		} else {
			System.out.print("Linked list is not Palindrome");
		}
	}
}