// A linked list node
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
};

class Main
{
	// Iterative function to return K'th node from the end in a linked list
	public static Node getKthFromtheEnd(Node head, int k)
	{
		int n = 0;
		Node curr = head;

		// Count number of nodes in the linked list
		while (curr != null)
		{
			curr = curr.next;
			n++;
		}

		// if number of nodes is more than or equal to K
		if (n >= k)
		{
			// return (n-k+1)th node from the beginning
			curr = head;
			for (int i = 0; i < n - k; i++) {
				curr = curr.next;
			}
		}

		return curr;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		int k = 3;
		Node node = getKthFromtheEnd(head, k);

		if (node != null) {
			System.out.println("K'th node from the end is " + node.data);
		}
	}
}