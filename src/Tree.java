public class Tree<T> {
    Node<T> root;

    public void addNode(int key, T info){
        Node<T> newNode = new Node<T>(key, info);

        if(root == null){
            root = newNode;
        } else {
            Node<T> focusNode = root;
            Node<T> parent;

            while(true){
                parent = focusNode;

                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;

                    if(focusNode == null){
                        parent.leftChild = newNode;
                        break; // return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null){
                        parent.rightChild = newNode;
                        break;
                    }
                }

            }
        }
    }

    public void inOrderTraversal(Node<T> focusNode){
        if(focusNode != null){
            inOrderTraversal(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraversal(focusNode.rightChild);
        }
    }

    public static void main(String[] args){
        University UO = new University("University of Ottawa", 100, 10);
        Tree<StudentRegistration> CT = new Tree<StudentRegistration>();

        UO.enrollStudent("Emma", "A");
        UO.enrollStudent("Adele", "B");
        UO.enrollStudent("Joe", "C");
        UO.enrollStudent("Martha", "D");
        UO.enrollStudent("Matthew", "E");

        UO.registerCourse("Soy-milk", "Math", 101, "Calculus");
        UO.registerCourse("Oat-milk", "Math", 102, "Discrete Math");

        CT.addNode(101, UO.registerStudent("Emma", 101, false));
        CT.addNode(102, UO.registerStudent("Adele", 102, false));
        CT.addNode(101, UO.registerStudent("Joe", 101, false));
        CT.addNode(102, UO.registerStudent("Martha", 102, false));
        CT.addNode(101, UO.registerStudent("Martha", 101, false));

        CT.inOrderTraversal(CT.root);
    }
}

