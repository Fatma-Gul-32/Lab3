package tr.edu.maltepe.oop;

public class Student extends Person implements IDoSport{

    SportCenter sportCenter= new SportCenter();

    public Student(){}
    public Student(String name,String surname, int id, String sport){

        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
        this.setSport(sport);
    }

    @Override
    public void Likes(Person student){

        System.out.println( student.getName() + " likes " + student.getSport());
        if (student.getSport()== "Swimming"){
            swim(student);
        }
        else play_football(student);
    }

    @Override
    public void swim(Person std) {

        sportCenter.swimmingField(std.getName());
    }

    @Override
    public void play_football(Person std) {

        sportCenter.footballField(std.getName());
    }
}
