package chapter2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    // ####################################################################
    // Remove Dups: Write code to remove duplicates from an unsorted list.
    // Follow Up: How would you solve this problem if a temporary buffer is
    // not allowed?
    // ####################################################################

    public static void removeDuplicates(SingleLinkedNode node) {
        Set<Integer> set = new HashSet<Integer>();
        SingleLinkedNode prev = null;

        while (node != null) {
            if (set.contains(node.getData())) {
                prev.setNext(node.getNext());
            }
            else {
                set.add(node.getData());
                prev = node;
            }

            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        SingleLinkedNode n = new SingleLinkedNode(1, 2, 2, 3, 3, 4, 5);

        n.printList();

        removeDuplicates(n);

        n.printList();
    }
}
