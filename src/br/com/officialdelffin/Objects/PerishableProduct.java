
// Pacotes :
package br.com.officialdelffin.Objects;


// Importações :
import br.com.officialdelffin.AbstractClass.Product;
import java.util.ArrayList;


// Classe responsal por criar objetos de  Produtos de Higienes :
public class PerishableProduct extends Product {


    // Atributos :
    private int expirationDate;


    // Construtores :

    // Faz com que obrige ao criar o objeto passar os parametros name, price , amount :
    public PerishableProduct(String name, double price, int amount, int expirationDate) {


        // Atribuição de parametros com atributos :
        super(name, price, amount);
        this.expirationDate = expirationDate;


    }


    // Metodos getters e setters :

    // Getters :
    public int getExpirationDate() {



        return expirationDate;



    }


}
