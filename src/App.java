import structures.trees.BinaryTree;
import structures.trees.IntTree;
import models.*;

public class App {
    public static void main(String[] args) throws Exception {
        runIntree();
        runBinaryTree();
    }

    private static void runBinaryTree() {
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
        arbolPersonas.add(new Persona("Carlos", 25));
        System.out.println("Arbol Personas");
        arbolPersonas.preOrden();

    }

    private static void runIntree() {
        IntTree arbolNumero= new IntTree();
        arbolNumero.add(50);
        arbolNumero.add(10);
        arbolNumero.add(30);
        arbolNumero.add(60);
        arbolNumero.add(70);
        arbolNumero.add(55);
        System.out.println("PreOrder");
        arbolNumero.preOrden();
        System.out.println("PosOrden");
        arbolNumero.posOrden();
        System.out.println("InOrder");
        arbolNumero.inOrder();
        System.out.println("Altura del Arbol");
        System.out.println(arbolNumero.alturaTree());
        System.out.println("Peso de arbol");
        System.out.println(arbolNumero.pesoTree());
    }

}
