package diff;

/**simpl class to test differences */
public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age){
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
    
    // Here we deleted method

    //HERE we have a new method
    public boolean isAdult(){
        return this.getAge() >= 18;
    }

}
