

// Pacotes :
package br.com.officialdelffin.Objects;


// Importações
import br.com.officialdelffin.AbstractClass.Product;


import br.com.officialdelffin.AbstractClass.Product;

// Classe responsável por criar objetos de mobilia :
public class FunitureProducts extends Product {


    // Atributos :
    private int warrantyPeriod;


    // Construtores :

    public FunitureProducts(String name, double price, int amount, int warrantyPeriod) {


        // Atribuindo parametros com os atributos :
        super(name,price,amount);
        this.warrantyPeriod = warrantyPeriod;


    }


}
