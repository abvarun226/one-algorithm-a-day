class Node<T> {
    private T data;
    private Node nextNode;

    public Node(T d1) {
        data = d1;
        nextNode = null;
    }

    public T getData() {
        return data;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }
}

class LinkedList<T> {
    private Node<T> first;
    private int length;

    public LinkedList() {
        first = new Node(null);
        length = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(T d1) {
        length++;
        Node<T> current = first;
        Node<T> node = new Node(d1);
        while(current.getNextNode() != null) {
            current = current.getNextNode();
        }
        current.setNextNode(node);
    }

    public void insert(T d1, int index) {
        length++;
        Node<T> current = first;
        Node<T> node = new Node(d1);
        for(int i = 1; i < index && current.getNextNode() != null; i++) {
            current = current.getNextNode();
        }
        node.setNextNode(current.getNextNode());
        current.setNextNode(node);
    }

    public T delete(int index) {
        if(index < 0 || index > length()) {
            return null;
        }

        if(isEmpty()) {
            System.out.println("ERROR| List is empty.");
            return null;
        }

        length--;
        Node<T> current = first;
        for(int i = 1; i < index; i++) {
            if(current.getNextNode() == null) {
                return null;
            }
            current = current.getNextNode();
        }
        T data = current.getNextNode().getData();
        current.setNextNode(current.getNextNode().getNextNode());
        return data;
    }

    public int length() {
        return length;
    }

    public T get(int index) {
        if(index < 0) {
            return null;
        }
        index++;
        Node<T> current = first;
        for(int i = 1; i < index; i++) {
            if(current.getNextNode() == null) {
                return null;
            }
            current = current.getNextNode();
        }
        return current.getNextNode().getData();
    }

    public String toString() {
        Node<T> current = first.getNextNode();
        String output = "[";
        while(current != null) {
            output += current.getData();
            current = current.getNextNode();
            if(current != null) {
                output += " , ";
            }
        }
        output += "]";
        return output;
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        System.out.println("Is list empty: " + list.isEmpty() + "\n");
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("List = " + list);

        System.out.println("\nDeleted = " + list.delete(list.length()));
        System.out.println("\nList = " + list);

        System.out.println("\nInsert 10 at position 2");
        list.insert(10, 2);
        System.out.println("List = " + list);

        System.out.println("\nLength of list = " + list.length());

        System.out.println("\nDeleted = " + list.delete(1));
        System.out.println("List = " + list);

        System.out.println("\nDeleted = " + list.delete(3));
        System.out.println("List = " + list);

        System.out.println("\nDeleted = " + list.delete(1));
        System.out.println("List = " + list);

        System.out.println("\nDeleted = " + list.delete(list.length()));
        System.out.println("List = " + list);

        System.out.println("\nDeleted = " + list.delete(list.length()));
        System.out.println("List = " + list);

    }
}
