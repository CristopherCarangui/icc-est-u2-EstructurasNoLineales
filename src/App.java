import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import collection.maps.Maps;
import collection.set.Sets;
import models.*;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntree();
        runBinaryTree();
        runEjercicios();
        runSets();
        runMap();
        runPersonaController();
    }

    private static void runPersonaController() {
        List<Persona> persona = new ArrayList<>();
        persona.add(new Persona("Juan", 20));
        persona.add(new Persona("Pedro", 70));
        persona.add(new Persona("Esteban", 14));
        persona.add(new Persona("Juan", 50));
        persona.add(new Persona("Adrian", 97));
        persona.add(new Persona("Luis", 74)); 

    }

    private static void runMap() {
       Maps map = new Maps();
       System.out.println("===Mapas===");
       map.construirHashMap();
       System.out.println("===LinkedHashMap===");
       map.construirLinkedHashMap();
       System.out.println("===TreeHashMap===");
       map.construirTreeHashMap();
       System.out.println("===TreeContacto====");
       

    }

    private static void runSets() {
        Sets set = new Sets();
        //implementacion -> HasSet hashcode
        System.out.println("* HashCode: ");
        Set<String> hashSet = set.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size = " + hashSet.size());
        System.out.println(hashSet.contains("F"));
        System.out.println("* LinkedHashSet: ");
        Set<String> lSet = set.construirLinkedHashSet();
        System.out.println(lSet);
        System.out.println("Size = " + lSet.size());
        System.out.println(lSet.contains("F"));
        System.out.println("* TreeSet: ");
        Set<String> tSet = set.construirTreeSet();
        System.out.println(tSet);
        System.out.println("Size = " + tSet.size());
        System.out.println(tSet.contains("F"));
        System.out.println("*Contacto HashSet");
        Set<Contacto> Cset = set.construirHashSetContacto();
        System.out.println(Cset);
        System.out.println("Size = " + Cset.size());
         System.out.println("*Contacto TreeSet");
        Set<Contacto> tCSet = set.construirTreeSetContacto();
        System.out.println(tCSet);
        System.out.println("Size = " + tCSet.size());



    }

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int [] numeros = {5,3,7,2,4,6,8};
        System.out.println("===Ejercicio1===");
        
        ejercicio1.insert(numeros);
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int [] numeros2 = {4,2,1,3,7,6,9};
        System.out.println("===Ejercicio2===");
        ejercicio2.insertar2(numeros2);
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int [] numeros3 = {4,2,1,3,7,6,9};
        BinaryTree<Integer> arbolBej3 = new BinaryTree<>();
        for(int numerosad : numeros3){
            arbolBej3.add(numerosad);
        }
        System.out.println("===Ejercicio3===");
        List<List<Node<Integer>>>  num3= ejercicio3.listLevels(arbolBej3.getRoot());
        Ejercicio4 ejercicio4 = new Ejercicio4();
        int [] numeros4 = {4,2,1,3,7,8};
        System.out.println("===Ejercicio4===");
        BinaryTree<Integer> arbolBej4 = new BinaryTree<>();
        for(int numerosad1 : numeros4){
            arbolBej4.add(numerosad1);
        }

        System.out.println(ejercicio4.maxDepth(arbolBej4.getRoot()));
        

    }

    private static void runBinaryTree() {
        //BinaryTree<String> arbolStrings = new BinaryTree<>();
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
