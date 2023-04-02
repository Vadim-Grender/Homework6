import java.util.Objects;

public class Person {
    private String firstName;
    private String secondName;
    private Integer age;
    private Type sex;
    enum Type { MALE, FEMALE }
    public Person(String name, String surname, int agePerson, Type sexPerson) {
        firstName = name;
        secondName = surname;
        age = agePerson ;
        sex = sexToSring(String.valueOf(sexPerson));
    }
    public String getFirstName() {

        return firstName;
    }
    public Type getSex(){

        return sex;
    }
    public int getAge (){
        return age;
    }
    private Type sexToSring (String sex) {
        if (sex == "Male") {
            return Type.MALE;
        }
        return Type.FEMALE;
    }
    @Override
    public String toString (){
        return String.format("Name: %s, Surname: %s, Age: %d", firstName, secondName, age);
    }

    @Override
    public int hashCode () {
        return Objects.hash(firstName, age, secondName);
    }
    @Override
    public boolean equals(Object obj) {
        Person person = this;
        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson){
            return false;
        }
        Person anotherPerson = (Person) obj;
        return Objects.equals(firstName, anotherPerson.getFirstName()) && age == anotherPerson.getAge() && sex == anotherPerson.getSex();
    }

}
