public class CourseTree<T> {
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

    public void registerStudent{

    }

    public static void main(String[] args){
        CourseTree<StudentRegistration> CT = new CourseTree<StudentRegistration>();
        Student student1 = new Student("Emma", "F");
        Student student2 = new Student("Adele", "F");
        Student student3 = new Student("Martha", "T");
        Student student4 = new Student("Matthew", "N");
        Student student5 = new Student("Joe", "A");
        Course calculus = new MathCourse("Soy-milk", 101);
        Course discreteMath = new MathCourse("Oat-milk", 102);
        StudentRegistration studentReg1 = new StudentRegistration(student1.id, calculus,false);
        StudentRegistration studentReg2 = new StudentRegistration(student2.id, calculus,false);
        StudentRegistration studentReg3 = new StudentRegistration(student3.id, discreteMath,false);
        StudentRegistration studentReg4 = new StudentRegistration(student4.id, discreteMath,false);
        StudentRegistration studentReg5 = new StudentRegistration(student5.id, calculus,false);

        CT.addNode(studentReg1.courseID, studentReg1);
        CT.addNode(studentReg2.courseID, studentReg2);
        CT.addNode(studentReg3.courseID, studentReg3);
        CT.addNode(studentReg4.courseID, studentReg4);
        CT.addNode(studentReg5.courseID, studentReg5);

        CT.inOrderTraversal(CT.root);
    }
}

