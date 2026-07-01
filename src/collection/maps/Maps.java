package collection.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {
    //Map<K,V>
    //Map<tipoClave,tipoValor>
    //Mapa esta compuesto por una clave "String" y valores  "Integer"
    public Map<String,Integer> construirHashMap(){
       Map<String,Integer> mapa = new HashMap<>();
       mapa.put("A", 10);
       mapa.put("B", 20);
       mapa.put("C", 30);
       mapa.put("A", 50);
       System.out.println(mapa.size());
       System.out.println(mapa);

       for(int i = 0; i<mapa.size();i++){
            System.out.println(mapa.values().toArray()[i]);
       }
       for(String Key: mapa.keySet()){
        System.out.println(Key);
       }
       System.out.println(mapa.get("A"));
       System.out.println(mapa.get("B"));
       System.out.println(mapa.get("F"));
       mapa.putIfAbsent("F", 100);
       mapa.putIfAbsent("A", 200);
       System.out.println(mapa);
       return mapa;
    } 

    public Map<String,Integer> construirLinkedHashMap(){
        Map<String,Integer> lHMap = new LinkedHashMap<>();
        lHMap.put("A", 10);
        lHMap.put("B", 20);
        lHMap.put("C", 30);
        lHMap.put("A", 50);
        System.out.println(lHMap);
        return lHMap;
    }
    //Orden natural de las claves
     public Map<String,Integer> construirTreeHashMap(){
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 10);
        treeMap.put("AB", 20);
        treeMap.put("A", 30);
        treeMap.put("aA", 50);
        System.out.println(treeMap);
        return treeMap;
    }

    public Set<Contacto> ordenarUnicos(List<Contacto> contactos){
        //Retornar contactos unicos
        //Unicos -> nombre
        //Ordene segun el apellido descendente
        Set<Contacto> c = new TreeSet<>(
            (c1,c2)->{
                if(c1.getNombre().equals(c2.getNombre())){
                    return 0;
                }
                return c1.getApellido().compareTo(c2.getApellido());
            }
        );

        for(Contacto cont: contactos){
            c.add(cont);
        }

        return c;
  
    }
}
