package ArrayList;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        
        //String com todas as letras do alfabeto
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Array de string, com todas a letras do alfabeto, separadas em cada posição
        String[] alfabeto = a.split("");
        //Declaração do ArrayLista tipo string, onde armazenará cada item
        ArrayList<String> elementosLetras = new ArrayList<String>();

        //Estrutura de repetição com limite 6, para melhor visualização
        for (int i=0; i < 6; i++){
            //Adicionando Elementos com suas letras
            elementosLetras.add("Elemento: " + alfabeto[i]);
        }

        //Exibir Arraylist
        System.out.println(elementosLetras);

        elementosLetras.add(6,"Amogus");//Adicionar um elemento no index 6
        elementosLetras.add("Elemento cara de pau"); //Adicionar um elemento em um nova posição

        //Exibir Arraylist com Alterações
        System.out.println(elementosLetras + " ,Número de Elementos: " + elementosLetras.size());

        //Remover o ultimo elemento
        elementosLetras.remove(elementosLetras.size() - 1);

        System.out.println(elementosLetras + " ,Número de Elementos: " + elementosLetras.size());

        //Alterar um elemento por index
        elementosLetras.set(4,"Alteração Elemento");

        System.out.println(elementosLetras + " ,Número de Elementos: " + elementosLetras.size());
    }
}
