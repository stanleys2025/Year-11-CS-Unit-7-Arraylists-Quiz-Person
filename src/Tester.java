import java.util.ArrayList;

public class Tester {
    public static void main(String args[]){
        Person person1 = new Person("1", "Jacobson", 19);
        Person person2 = new Person("2", "Jammerson", 15);
        Person person3 = new Person("3", "Lam", 12);
        Person person4 = new Person("4", "Monka", 21);
        ArrayList<Person> allPersons = new ArrayList<>();
        PersonFactory.addPerson(person1);
        PersonFactory.addPerson(person2);
        PersonFactory.addPerson(person3);
        PersonFactory.addPerson(person4);

        for(Person value: PersonFactory.getAllPersons()){
            System.out.println(value);
        }
        Person person5 = new Person("5", "Lanson" , 2);

        PersonFactory.addPerson(person5);
        System.out.println("-------------");

        for(Person value: allPersons){
            System.out.println(value);
        }

        ArrayList<Person> minors = PersonFactory.under18();
        System.out.println(PersonFactory.checkLastName("Lanson"));
    }
}
