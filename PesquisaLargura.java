// BUILD: javac PesquisaLargura.java
// EXECUTE: java PesquisaLargura

import java.util.*;

public class PesquisaLargura {
    static Map<String, List<String>> graph = new HashMap<>();
    
    static {
        graph.put("voce", Arrays.asList("Alice", "Bob", "Claire"));
        graph.put("Bob", Arrays.asList("Anuj", "Peggy"));
        graph.put("Alice", Arrays.asList("Peggy"));
        graph.put("Claire", Arrays.asList("Thom", "Jonny"));
        graph.put("Anuj", new ArrayList<>());
        graph.put("Peggy", new ArrayList<>());
        graph.put("Thom", new ArrayList<>());
        graph.put("Jonny", new ArrayList<>());
    }
    
    static boolean isSalesPerson(String name) {
        return name.endsWith("m");
    }
    
    static boolean search(String name) {
        Queue<String> searchQueue = new LinkedList<>(graph.get(name));
        List<String> searched = new ArrayList<>();
        
        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            if (!searched.contains(person)) {
                if (isSalesPerson(person)) {
                    System.out.println(person + " é um vendedor de Manga!");
                    return true;
                } else {
                    searchQueue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        search("voce");
    }
}

