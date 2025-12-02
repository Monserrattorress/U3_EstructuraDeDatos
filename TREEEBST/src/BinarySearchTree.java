public class BinarySearchTree {
    
    private Node root; //siempre comenzando desde la raiz del arbol BST

    //*METODO PUBLICO PARA INSERTAR */

    public void insert(int value){
        //innovacion recursiva, para saber donde se coloca el nuevo nodo
        root =insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int valor){

        //caso base, cuando currente sea null, entonces aqui se crea un nuevo nodo
        if(current==null){
            return new Node(valor);
        }

        //si el valor a insertar es menor, entonces vamos al subarbol del lado izquierdo
        if(valor< current.value){
            current.left =insertRecursive(current.left, valor);
        }

        //si el valor a insertar es mayor que al actual, entonces vammos al subvalor del lado derecho
        else if (valor>current.value){
            current.right = insertRecursive(current.right, valor);
        }

        //cuando los valores son iguales no se hace nada

        //retornar el nodo actual
        return current;
    }

    public void printInOrder(){
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node current){
        if(current!=null){
            //recorrer la parte izquierda
            printInOrderRecursive(current.left);
            System.out.print(current.value + " ");
            //recorremos la parte derecha
            printInOrderRecursive(current.right);
        }
    }
}
