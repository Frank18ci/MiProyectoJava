package enumeraciones;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Enumeraciones hotdog = Enumeraciones.HOTDOG;
        System.out.println(hotdog.getPrice());
        System.out.println(hotdog.getSaleName());

        ArrayList<Enumeraciones> foodList = new ArrayList<>();
        foodList.add(Enumeraciones.HOTDOG);
        foodList.add(Enumeraciones.TACO);
        foodList.add(Enumeraciones.QUESADILLA);
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i).getSaleName() + " - " + foodList.get(i).getPrice());
        }
        Map<String, String> mapExample = new HashMap<>();
        mapExample.put("food", "Peruvian food");
        mapExample.put("sport", "Play sports is good for health");
        mapExample.put("java", "Good programming language");
        for(final String key: mapExample.keySet()){
            System.out.println(key + " - " + mapExample.get(key));
        }
        LinkedList<String> linkedListExample = new LinkedList<>();
        linkedListExample.add("tacos");
        linkedListExample.add("quesadillas");
        linkedListExample.add("tortas");

        System.out.println(linkedListExample.peek());
        System.out.println(linkedListExample.getFirst());
        System.out.println(linkedListExample.getLast());
    }
}
