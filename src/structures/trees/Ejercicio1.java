package structures.trees;

import structures.node.Node;

public class Ejercicio1 {
    public void insert(int [] numeros){
        //Crear el arbol de enteros 
        BinaryTree<Integer> num = new BinaryTree<>();
        //Insertar cada numero
        for(int numero : numeros){
            num.add(numero);
        }
        num.alturaTree();
        //Imprimir el arbol
        num.inOrder();
        impirmirNumerosA(num.getRoot());
    } 

    public void impirmirNumerosA(Node<Integer> root){
        System.out.println("Imprimir el arbol");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel){
        if(actual == null) return;
        printTreeRecursivo(actual.getRight(), nivel+1);
        
        for(int i=0; i< nivel;i++){
            System.out.print("\t");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel+1);;
    }
    
}
