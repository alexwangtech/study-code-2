package chapter2;

/**
 * Single linked node.
 */
public class SingleLinkedNode {

    private int data;
    private SingleLinkedNode next;

    public SingleLinkedNode(int data) {
        this.data = data;
        next = null;
    }

    public SingleLinkedNode(int data, SingleLinkedNode next) {
        this.data = data;
        this.next = next;
    }

    public SingleLinkedNode(int... values) {
        SingleLinkedNode curr = null;

        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                this.data = values[i];
                curr = this;
            } else {
                SingleLinkedNode n = new SingleLinkedNode(values[i]);
                curr.setNext(n);
                curr = n;
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingleLinkedNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedNode next) {
        this.next = next;
    }

    public void printList() {
        SingleLinkedNode curr = this;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}
