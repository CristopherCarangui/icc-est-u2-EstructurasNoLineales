package structures.trees;

import structures.node.Node;

public class Ejercicio2 {
    
    public void insertar2(int[] numeros2){
         BinaryTree<Integer> num2 = new BinaryTree<>();
        for(int numero: numeros2){
            num2.add(numero);
        }
        Node<Integer> root = num2.getRoot();
        impirmirNumerosA(root);
        System.out.println("Arbol Invertido");
        invertirRecursivo(root);
        
    }
    
    public void impirmirNumerosA(Node<Integer> root){
        System.out.println("\n Imprimir el arbol original");
        imprimirOriginal(root, 0);;
    }
    public void imprimirOriginal(Node<Integer> actual,int nivel){
        if(actual == null) return;
        imprimirOriginal(actual.getRight(), nivel+1);
        for(int i=0; i< nivel;i++){
            System.out.print("\t");
        }
        imprimirOriginal(actual.getLeft(), nivel+1);
    }

   
    public Node<Integer> invertirRecursivo(Node<Integer> actual){
        if(actual == null) return null;
        Node<Integer> aux = actual.getLeft();
        System.out.println("Actual" + actual);
        actual.setLeft(actual.getRight());
        actual.setRight(aux);
        invertirRecursivo(actual.getLeft());
        invertirRecursivo(actual.getRight());
        return actual;
    }
}
