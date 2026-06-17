package structures.trees;

import structures.node.Node;

//CLASE DE ARBOL SOLO DE ENTEROS
public class IntTree {
    
    private Node<Integer> root;
    //Constructor
    public IntTree(){
        this.root = null;

    }
    public Node<Integer> getRoot() {
        return root;
    }
    public void setRoot(Node<Integer> root) {
        this.root = root;
    }
/* 
    public void setRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    } */
    public void add (int value){
         Node<Integer> node = new Node<Integer>(value);
         root = addRecursivo(root,node);
    }
    private Node<Integer> addRecursivo(
        Node<Integer> actual,
        Node<Integer> nodeInsertar){
            //CASO BASE DEL METODO RECURSIVO
            if(actual ==  null)
                return nodeInsertar;
            if(actual.getValue() > nodeInsertar.getValue()){
                actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
            }else{
                actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
            }

            return actual;
        }
    
}
