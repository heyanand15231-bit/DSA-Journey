/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        for (Node temp = head; temp != null; temp = temp.next.next) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
        }
        for (Node temp = head; temp != null; temp = temp.next.next) {
            if (temp.random != null) temp.next.random = temp.random.next;
        }
        Node newHead = head.next;
        for (Node temp = head; temp != null; temp = temp.next) {
            Node copy = temp.next;
            temp.next = copy.next;
            if (copy.next != null) copy.next = copy.next.next;
        }

        return newHead;
    }
}
