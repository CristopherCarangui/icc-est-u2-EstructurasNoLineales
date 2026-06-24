package structures.trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import structures.node.Node;

public class Ejercicio3 {
     public List<List<Node<Integer>>> listLevels(Node<Integer> root){
      List<List<Node<Integer>>> listaArreglar = new ArrayList<>();
      if(root == null) return null;
      Queue<Node<Integer>> colaLista = new LinkedList<>();
      colaLista.add(root);
      while(!colaLista.isEmpty()){
        int tamano = colaLista.size();
        List<Node<Integer>> actual = new ArrayList<>();
        for(int i =0; i< tamano;i++){
            Node<Integer> nodoActual = colaLista.remove();
            actual.add(nodoActual);
            if(nodoActual.getLeft() != null){
                colaLista.add(nodoActual.getLeft());
            }
            if(nodoActual.getRight() != null){
                colaLista.add(nodoActual.getRight());
            }
        }
        listaArreglar.add(actual);
      } 
      imprimirLista(listaArreglar);
      return listaArreglar;
      

    }
    private void imprimirLista(List<List<Node<Integer>>> listaArreglar){
        for (int i = 0; i < listaArreglar.size(); i++) {
            int nodoActual = listaArreglar.get(i).size();
            for (int j = 0; j < listaArreglar.get(i).size(); j++) {
                int valor = listaArreglar.get(i).get(j).getValue();
                if(nodoActual == j+1){
                    System.out.print(valor);
                }else{
                    System.out.print(valor+ "-->");
                }
                
            }
            System.out.println();
        }
    }
}
