import animal.Animal;

public class AnimalLinkedList {
    private class Node {
        Animal element;
        Node next;
        Node prev;


        Node(Animal element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }


        public Node(Animal element) {

        }
    }

    private int size;
    private Node header;

    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.next = header;
        header.prev = header;
        size = 0;
    }

    private void add(Animal animal, Node node) {
        Node newNode = new Node(animal, node, node.prev);
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        size++;
    }

    public void add(Animal animal) {
        add(animal, header);
    }


    public void addAll(AnimalArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            add(arrayList.get(i));
        }
    }

    private Node findNodeByIndex(int index) {
        Node n = header;
        if (index <= size) {
            for (int i = index; i < size; i++) {
                n = n.next;
            }
        }
        if (index >= size) {
            for (int i = size; i > index; i--) {
                n = n.prev;
            }
        }
        return n;
    }

    public int size() {
        return size;
    }

    public void clear() {
        this.size = 0;
        this.header.next = header;
        this.header.prev = header;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public Animal get(int index) {
        Node n = findNodeByIndex(index);
        return n.element;
    }

    public void set(int index, Animal element) {
        Node node = findNodeByIndex(index - 1);
        Node node2 = new Node(element, header, header);
        node.next.prev = node2;
        node.next = node2;
        node2.prev = node;
    }

    public int indexOf(Animal animal) {
        Node node = header.next;
        for (int i = 0; i < size; i++) {
            if (animal.equals(node.next.element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Animal animal) {
        Node node = header.next;
        for (int i = 0; i < size; i++) {
            if (animal.equals(node.next.element)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Node n) {
        n.next.prev = n.prev;
        n.prev.next = n.next;
    }

    public void remove(Integer index) {
        Node x = findNodeByIndex(index);
        remove(x);
    }

    public Animal[] toArray() {
        Animal[] result = new Animal[size];
        Node n = header;
        for (int i = 0; i < size; i++) {
            n = n.next;
            result[i] = n.element;
        }
        return result;
    }

}



