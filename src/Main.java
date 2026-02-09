/* Projeto : Sistema de Gestão de Inventário em Terminal

Projeto em Java focado na aplicação prática de Orientação a Objetos. O sistema organiza o cadastro de produtos e itens perecíveis através de herança e polimorfismo. Utiliza listas dinâmicas com ArrayList,
 sobrescrita de métodos e construtores personalizados para garantir que cada objeto seja inicializado com integridade técnica.*/


// Importações :

import br.com.officialdelffin.AbstractClass.Product;
import br.com.officialdelffin.Objects.FunitureProducts;
import br.com.officialdelffin.Objects.PerishableProduct;

import java.util.ArrayList;

// Classe principal do sistema :
public class Main {


    // Executa o sistema principal :
    public static void main(String[] args) {


        // ArrayLists :

        // Produtos pereciveis :
        ArrayList<Product> productList = new ArrayList<>();


        // Instancias de produtos pereciveis :
        var shampooDove = new PerishableProduct("Shamppo Dove", 29.50, 300, 10122026);
        var perishableOne = shampooDove;

        var batataRuffles = new PerishableProduct("Batata Ruffles" , 11.99 , 580 , 13072026);
        var perishableTwo = batataRuffles;

        // Adicionando produto perecivel na ArrayList :
        productList.add(perishableOne);
        productList.add(perishableTwo);


        // Exibindo a lista no terminal
        productList.forEach( products -> );


        for (Product products : productList) {



            if (products instanceof FunitureProducts funitureProducts) {


                System.out.printf("""
                
                Nome do produto : %s
                Preço : %f
                Quantidade : %d
                Prazo de garantia : %d
                
                """, funitureProducts.getName() , funitureProducts.getPrice() , funitureProducts.getAmount() , funitureProducts.getW);


            }


        }


    }


}