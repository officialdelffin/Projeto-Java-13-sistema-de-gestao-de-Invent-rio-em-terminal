
// Pacotes :
package br.com.officialdelffin.AbstractClass;


// Classe abstrata de produtos :
public class Product {


    // Atributos :
    private String name;
    private double price ;
    private int amount ;


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
    public Product ( String name , double price , int amount ) {


        this.name    = name;
        this.price   = price;
        this.amount  = amount;


    }


    // Métodos :

    // Fazendo a sobre carga do metodo to String :
    @Override
    public String toString() {


        return "Nome do produto : " + this.getName() + "\nPreço : " + this.getPrice() + "\nQuantidade : " + this.getAmount();


    }


}
