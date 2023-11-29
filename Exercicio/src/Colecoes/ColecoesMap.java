package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class ColecoesMap {

    public static void main(String[] args) {
        
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(33, "Jesus");
        mapa.put(44, "Fatec");
        
        System.out.println(mapa.get(33));
    }
    
}
