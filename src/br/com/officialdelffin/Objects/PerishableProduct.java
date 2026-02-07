
// Pacotes :
package br.com.officialdelffin.Objects;


// Importações :
import br.com.officialdelffin.AbstractClass.Product;


// Classe responsal por criar objetos de  Produtos de Higienes :
public class PerishableProduct extends Product {


    // Atributos :
    private int expirationDate;


    // Construtores :

    // Faz com que obrige ao criar o objeto passar os parametros name, price , amount :
    public PerishableProduct(String name, double price, int amount , int expirationDate ) {


        super(name, price, amount);
        this.expirationDate = expirationDate;


    }


}
