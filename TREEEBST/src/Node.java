public class Node {
    int value; //valor que tendra el nodo
    Node left; //nodo a la izquierda
    Node right; //nodo a la derecha

    //este seria nuestra fabrica de hojitas para nuestro arbol (BST)
    public Node(int value){
        this.value=value; //coloca el valor al atributo value del nodo
        this.left=null; //como es un nuevo nodo, no tiene nada a la izquierda
        this.right=null; //lo mismo de arriba pero a la derecha
    }
}
