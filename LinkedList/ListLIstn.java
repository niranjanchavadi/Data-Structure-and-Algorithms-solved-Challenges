// Data Structure to store a linked list node
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

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5 };

		Node[] node = new Node[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			node[i] = new Node(arr[i], null);

			if (i > 0) {
				node[i - 1].next = node[i];
			}
		}

		Node head = node[0];
		printList(head);
	}
}