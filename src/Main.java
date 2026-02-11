/* Projeto : Sistema de Gestão de Inventário em Terminal

Projeto em Java focado na aplicação prática de Orientação a Objetos. O sistema organiza o cadastro de produtos e itens perecíveis através de herança e polimorfismo. Utiliza listas dinâmicas com ArrayList,
 sobrescrita de métodos e construtores personalizados para garantir que cada objeto seja inicializado com integridade técnica.*/


// Importações :


// Importações :
import br.com.officialdelffin.AbstractClass.Product;
import br.com.officialdelffin.Objects.FunitureProducts;
import br.com.officialdelffin.Objects.PerishableProduct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


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

        var chipsRuffles = new PerishableProduct("Batata Ruffles", 11.99, 580, 13072026);
        var perishableTwo = chipsRuffles;


        // Instancias de produtos de mobilías :
        var woonderChair = new FunitureProducts("Cadeira de madeira", 79.00, 70, 6);
        var funitureOne = woonderChair;

        var woonderTable = new FunitureProducts("Mesa de madeira", 150.00, 70, 6);
        var funitureTwo = woonderTable;


        // Adicionando produto perecivel na ArrayList :
        productList.add(perishableOne);
        productList.add(perishableTwo);
        productList.add(funitureOne);
        productList.add(funitureTwo);

        Collections.sort(productList);


        // Sistema de ForEach para exibição das listas :
        for (Product products : productList) {


            // Se o objeto na lista for uma instacia de produtos perecíveis :
            if (products instanceof PerishableProduct perishableProduct) {


                System.out.printf("""
                        
                        Nome do produto : %s
                        Preço : %f
                        Quantidade : %d
                        Prazo de validade : %d
                        
                        """, perishableProduct.getName(), perishableProduct.getPrice(), perishableProduct.getAmount(), perishableProduct.getExpirationDate());


            }


            // Se o objeto na lista for uma instancia de produto mobilía :
            else if (products instanceof FunitureProducts funitureProducts) {


                System.out.printf("""
                        
                        Nome do produto : %s
                        Preço : %f
                        Quantidade : %d
                        Prazo de garantia : %d
                        
                        """, funitureProducts.getName(), funitureProducts.getPrice(), funitureProducts.getAmount(), funitureProducts.getWarrantyPeriod());


            }


        }


    }


}