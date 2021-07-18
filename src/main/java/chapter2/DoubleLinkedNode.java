package chapter2;

/**
 * Double linked node.
 */
public class DoubleLinkedNode {

    private int data;
    private DoubleLinkedNode prev;
    private DoubleLinkedNode next;

    public DoubleLinkedNode(int data) {
        this.data = data;
    }

    public DoubleLinkedNode(int data, DoubleLinkedNode prev, DoubleLinkedNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLinkedNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedNode prev) {
        this.prev = prev;
    }

    public DoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode next) {
        this.next = next;
    }
}
