package structures.trees;

import structures.node.Node;

public class BinaryTree <T extends Comparable<T>> {
    private Node<T> root;
    private int weight;

    public BinaryTree(){
        this.root = null;
        this.weight = 0;

    }
    
    
  

    public Node<T> getRoot() {
        return root;
    }
    public void setRoot(Node<T> root) {
        this.root = root;
    }
/* 
    public void setRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    } */
    public void add (T value){
         Node<T> node = new Node<T>(value);
         root = addRecursivo(root,node);
         weight ++;
    }
    private Node<T> addRecursivo(
        Node<T> actual,
        Node<T> nodeInsertar){
            //CASO BASE DEL METODO RECURSIVO
            if(actual ==  null)
                return nodeInsertar;
            //if(actual.getValue() > nodeInsertar.getValue()){
            if(actual.getValue().compareTo(nodeInsertar.getValue())>0){
                actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
            }else{
                actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
            }

            return actual;
        }
    
    public void preOrden(){
        preordernRecursivo(root);
    
    }   
    private void preordernRecursivo(Node<T> actual) {
        if(actual == null)
            return;
        
        System.out.println(actual);
        preordernRecursivo(actual.getLeft());
        preordernRecursivo(actual.getRight());
    
    }

    public void posOrden(){
        posOrdenRecursivo(root);
    }
    private void posOrdenRecursivo(Node<T> actual) {
        if(actual== null)
            return;
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRight());
        System.out.println(actual);
    }

    public void inOrder(){
        inOrderRecursivo(root);
    }
    private void inOrderRecursivo(Node<T> actual) {
        if(actual== null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrderRecursivo(actual.getRight());
    }

    public int alturaTree(){
        return getalturaTreeRecuraivo(root);
    }
    private int getalturaTreeRecuraivo(Node<T> actual) {
        if(actual == null)
            return 0;

        int alturaLeft = getalturaTreeRecuraivo(actual.getLeft());
        int alturaRight = getalturaTreeRecuraivo(actual.getRight());
        int masAlto = Math.max(alturaLeft, alturaRight);
        return masAlto + 1;
        
    }

    public int pesoTree(){
        return getPesoTreeRecursivo(root);
    }
    private int getPesoTreeRecursivo(Node<T> actual) {
        if(actual == null)
            return 0;

        int pesoLeft = getPesoTreeRecursivo(actual.getLeft());
        int pesoRight = getPesoTreeRecursivo(actual.getRight());
        return pesoLeft+pesoRight+1;
    }




    public int getWeight() {
        return weight;
    }




    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
