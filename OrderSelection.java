// Build: javac OrderSelection.java
// Execute: java OrderSelection

import java.util.ArrayList;

public class OrderSelection {
    public static int buscaMenor(ArrayList<Integer> arr) {
        int menor = arr.get(0);
        int menor_indice = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < menor) {
                menor = arr.get(i);
                menor_indice = i;
            }
        }
        return menor_indice;
    }

    public static ArrayList<Integer> ordenacaoPorSelecao(ArrayList<Integer> arr) {
        ArrayList<Integer> novoArr = new ArrayList<>();
        while (!arr.isEmpty()) {
            int menor = buscaMenor(arr);
            novoArr.add(arr.remove(menor));
        }
        return novoArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.add(10);
        
        ArrayList<Integer> resultado = ordenacaoPorSelecao(arr);
        System.out.println(resultado);
    }
}
