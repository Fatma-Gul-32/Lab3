package tr.edu.maltepe.oop;

public class Professor extends Person implements IDoSport{

    SportCenter sportCenter= new SportCenter();

    public Professor(){}
    public Professor(String name,String surname, int id, String sport){

        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
        this.setSport(sport);
    }

    @Override
    public void Likes(Person prof){

        System.out.println(prof.getName() + " likes " + prof.getSport());
        if (prof.getSport()== "Swimming"){
            swim(prof);
        }
        else play_football(prof);
    }

    @Override
    public void swim(Person prof) {

        sportCenter.swimmingField(prof.getName());
    }

    @Override
    public void play_football(Person prof) {

        sportCenter.footballField(prof.getName());
    }
}
