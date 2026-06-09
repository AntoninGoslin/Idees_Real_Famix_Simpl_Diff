package soutenance_exemple;

// nom de class différent
public class Person2 {
    //1) changement de visibilité
    private int age;
    //2) name n'existe plus 

    public void sayHello() { 
        System.out.println("Hello");
    }

    // 3) Ajout d'une méthode
    public boolean isAdult() {
        return this.age >= 18;
    }
}









