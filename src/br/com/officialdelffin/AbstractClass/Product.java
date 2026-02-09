
// Pacotes :
package br.com.officialdelffin.AbstractClass;


import java.util.ArrayList;

// Classe abstrata de produtos :
abstract public class Product {


    // Atributos :
    private String name;
    private double price;
    private int amount;


    // Metodos Getters e Setters :

    // Getters :
    public String getName() {


        return name;


    }

    public double getPrice() {


        return price;


    }


    public int getAmount() {


        return amount;


    }


    // Construtores :


    // Faz com que obrige ao criar o objeto passar os parametros name, price , amount :
    public Product(String name, double price, int amount) {


        this.name = name;
        this.price = price;
        this.amount = amount;


    }


}
