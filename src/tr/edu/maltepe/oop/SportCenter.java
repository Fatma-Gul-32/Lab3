package tr.edu.maltepe.oop;

public class SportCenter {

    public SportCenter(){

    }
    public SportCenter(Person person){
        System.out.println("Welcome to Sport Center "+ person.getName());
    }

    public void swimmingField(String name){

        System.out.println(name + " goes to sport center and swims");
    }

    public void footballField(String name){

        System.out.println(name + " goes to sport center and plays football");
    }
}
