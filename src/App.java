import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.IntTree;
import models.*;

public class App {
    public static void main(String[] args) throws Exception {
        runIntree();
        runBinaryTree();
        runEjercicios();
    }

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int [] numeros = {5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int [] numeros2 = {4,2,1,3,7,6,9};
        ejercicio2.insertar2(numeros2);
        

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
