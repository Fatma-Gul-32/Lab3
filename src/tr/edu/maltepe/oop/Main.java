package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

	    Professor p1= new Professor("Ensar", "Gül", 1, "Football");
        Student s1 = new Student("Fatma Gül", "Bağrıaçık", 190704023, "Swimming");

        SportCenter sportCenter= new SportCenter(p1);
        SportCenter sportCenter1= new SportCenter(s1);

        p1.Likes(p1);
        s1.Likes(s1);
    }
}
