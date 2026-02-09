/* Projeto : Sistema de Gestão de Inventário em Terminal

Projeto em Java focado na aplicação prática de Orientação a Objetos. O sistema organiza o cadastro de produtos e itens perecíveis através de herança e polimorfismo. Utiliza listas dinâmicas com ArrayList,
 sobrescrita de métodos e construtores personalizados para garantir que cada objeto seja inicializado com integridade técnica.*/


import br.com.officialdelffin.AbstractClass.Product;
import br.com.officialdelffin.Objects.PerishableProduct;

import java.util.ArrayList;

// Classe principal do sistema :
public class Main {


    // Executa o sistema principal :
    public static void main(String[] args) {


        // ArrayLists :

        // Produtos pereciveis :
        ArrayList<Product> perishableProductList = new ArrayList<>();


        // Instancias de produtos pereciveis :
        var shampooDove = new PerishableProduct("Shamppo Dove", 29.50, 300, 10122026);
        var perishableOne = shampooDove;

        var batataRuffles = new PerishableProduct("Batata Ruffles" , 11.99 , 580 , 13072026);
        var perishableTwo = batataRuffles;

        // Adicionando produto perecivel na ArrayList :
        perishableProductList.add(perishableOne);
        perishableProductList.add(perishableTwo);



        // Exibindo a lista no terminal :
        perishableProductList.forEach( productList -> System.out.printf("""
                
                
                
                """));


    }


}