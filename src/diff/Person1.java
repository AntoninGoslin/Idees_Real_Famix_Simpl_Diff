package diff;

/**simpl class to test differences */
public class Person1 {
    private String name;
    private int age;

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
    
    public void getOlder(){
        this.age = this.age + 1;
    }
}
