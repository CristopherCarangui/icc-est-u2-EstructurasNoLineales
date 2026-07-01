package eva;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadUmbral){
        edadUmbral = 18;
        
        Set<Persona> pSet = new TreeSet<>(
            (c1,c2)->{
                int compE = Integer.compare(c1.getEdad(), c2.getEdad());
                if(compE !=0 && edadUmbral){
                    return compE;

                }
                int comN = c1.getNombre().compareToIgnoreCase(c2.getNombre());
                return comN;
            }
        );
        return pSet;

        


    }

    public Map<String,Set<Persona>> agruparEdad(List<Persona> personas){
        String nombre = "Juan Perez";
        String[] palabras = nombre.split("");
        String primerNombre = palabras[0];
        String pNombre = nombre.split("")[0];
        return null;

    }
}
