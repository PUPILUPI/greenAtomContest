public class Task3 {
    static class ListNode {
        private Object value;
        private ListNode next = null;
        public ListNode(Object val) {
            this.value = val;
        }
    }

    public static void main(String[] args) {
        // Создаем пример односвязного списка: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Исходный список:");
        printLinkedList(head);

        ListNode reversedHead = reverseLinkedList(head);

        System.out.println("Инвертированный список:");
        printLinkedList(reversedHead);
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }

        System.out.println();
    }
}
