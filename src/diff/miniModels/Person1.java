package miniModels;

import java.io.Serializable;

/** simpl class to test differences */
public class Person1 implements Serializable { // Différence 1 : Implémentation d'une interface

    private String name;
    public int age; // Différence 2 : Visibilité "public" au lieu de "private"

    private String address; // Différence 3 : Présence d'un attribut supplémentaire

    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }
    
    // Différence 4 : Méthode existante ici, mais supprimée dans Person2
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name);
    }

    // Différence 5 : La méthode isAdult() est absente ici (elle sera détectée comme un ajout dans Person2)
}