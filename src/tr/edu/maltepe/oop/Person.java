package tr.edu.maltepe.oop;

public class Person {

    private String name;
    private String surname;
    private int id;
    private String sport;

    public Person(){
    }

    public Person(String name,String surname, int id, String sport){

        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
        this.setSport(sport);
    }

    public void Likes(Person person){
        System.out.println("Does " + person.getName() + " likes " + person.getSport() + "?");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
