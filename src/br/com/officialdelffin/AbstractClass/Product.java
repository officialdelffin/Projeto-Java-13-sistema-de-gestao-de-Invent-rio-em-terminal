
// Pacotes :
package br.com.officialdelffin.AbstractClass;


// Importações :
import java.util.ArrayList;


// Classe abstrata de produtos :
abstract public class Product implements Comparable<Product>{


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


    // Sobreescrita de metodos :

    // CompareTo de Comparable :
    @Override
    public int compareTo(Product listWithComparation) {


        // Estou pedindo para comparar os nomes dos objetos da classe Product e com isso ele consegue fazer a ordernação por ordem alfabética :
        return this.getName().compareTo(listWithComparation.getName());


    }


}
