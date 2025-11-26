import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map= new HashMap<>();
                                //HashMap, LinkedHashMap, TreeMap
        map.put(1,"Mouse");
        map.put(2,"Teclado");
        map.put(3,"Botoncito");
        map.put(1,"Mouse Gamer");
        map.put(10,"test");

        System.out.println(map);
        String value= map.get(0);
        System.out.println(value);

        boolean exist= map.containsKey(10);
        System.out.println("existe la key 10?"+exist);

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("la key es: "+entry.getKey()+" el valor es: "+entry.getValue());
        }
        int size= map.size();
        System.out.println("el tamaño es de"+size);
   }
}
