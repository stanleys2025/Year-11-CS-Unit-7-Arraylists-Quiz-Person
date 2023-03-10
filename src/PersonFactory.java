import java.util.ArrayList;

public class PersonFactory {

    private static ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public static ArrayList<Person> getAllPersons() {
        return allPersons;
    }

    public static void setAllPersons(ArrayList<Person> allPersons) {
        PersonFactory.allPersons = allPersons;
    }

    public static void addPerson(Person person) {
        String newLastName = person.getLastName();
        int position = 0;

        for(Person value : allPersons){
            if(newLastName.compareTo(value.getLastName()) > 0){
                position++;
            }
        }

        allPersons.add(position, person);
    }

    public static ArrayList<Person> under18() {
        ArrayList<Person> minors = new ArrayList<>();
        for(Person value : allPersons){
            if(value.getAge() < 18){
                minors.add(value);
            }
        }
        return minors;
    }

    public static boolean checkLastName(String lastName) {
        for(Person value : allPersons){
            if(value.getLastName().compareTo(lastName) == 0){
                return true;
            }
        }
        return false;
    }
}
