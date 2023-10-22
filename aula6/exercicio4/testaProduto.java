package exercicio4;

import java.util.LinkedHashMap;
import java.util.Map;

public class testaProduto {
    
    public static void main(String[] args) {
        //Crie um programa Java que utilize uma estrutura de dados do tipo LinkedHashMap
        //associar produtos a seus preços.
        //Insira algumas entradas no mapa e, em seguida,
        //imprima a lista de produtos na ordem em que foram inseridos, exibindo o nome do produto e seu preço.
        

        LinkedHashMap<String, Double> lk = new LinkedHashMap<>(6);

        lk.put("Sabonete Dove", 12.50);
        lk.put("Desodorante Rexona Flash", 27.30);
        lk.put("Pizza Grande Calabresa Santa Massa", 49.60);
        
        
        System.out.println("\n"+"Produtos"+"\n"+
                                "=============================="+"\n");
        for(Map.Entry<String,Double> elementoMap : lk.entrySet()){
            
            String key = elementoMap.getKey();
            Double value = elementoMap.getValue();

            System.out.println("Nome: "+key+" Preço: "+value);
        }

    }

}
