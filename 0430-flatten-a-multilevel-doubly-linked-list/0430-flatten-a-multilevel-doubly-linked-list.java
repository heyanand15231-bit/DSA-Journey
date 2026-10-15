/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
                Node hold=temp.next;
                temp.next=temp.child;
                temp.child.prev=temp;
                Node x=temp.child;
                while(x.next!=null){
                    x=x.next;
                }
                x.next=hold;
                if(hold!=null)hold.prev=x;
            }
            temp.child=null;
            temp=temp.next;
        }
        return head;
    }
}