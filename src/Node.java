public class Node<T> {
    int key;
    T info;

    Node<T> leftChild;
    Node<T> rightChild;

    public Node(int key, T info){
        this.key = key;
        this.info = info;
    }

    public String toString(){
        return "key: " + key;
    }

}
