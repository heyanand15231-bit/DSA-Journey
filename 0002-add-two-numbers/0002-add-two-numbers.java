class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int curr = 0; // carry को curr नाम दिया

        while (l1 != null || l2 != null || curr != 0) {
            int sum = curr;
            if (l1 != null) { sum += l1.val; l1 = l1.next; }
            if (l2 != null) { sum += l2.val; l2 = l2.next; }

            temp.next = new ListNode(sum % 10); // नया node बनाओ
            temp = temp.next;
            curr = sum / 10; // अगले step के लिए curr update
        }
        return dummy.next;
    }
}
