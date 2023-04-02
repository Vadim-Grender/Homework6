import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person ("Petr","Stan",34, Person.Type.MALE);
        Person person2 = new Person("Egor", "Hachev", 21, Person.Type.MALE);
        Person person3 = new Person("Olga", "Bukova", 19, Person.Type.FEMALE);
        Person person4 = new Person("Artem", "Denisov", 18, Person.Type.MALE);
        Person person5 = new Person("Natali", "Portman", 39, Person.Type.FEMALE);
        Person person6 = new Person("Anna", "Kurova", 22, Person.Type.FEMALE);
        Person person7 = new Person("Andrey", "Gron", 14, Person.Type.MALE);
        Map map = new HashMap<>();
        map.put(0,person1);
        map.put(1,person2);
        map.put(2,person3);
        map.put(3,person4);
        map.put(4,person5);
        map.put(5,person6);
        map.put(6,person7);

        System.out.println(howYears(map));
    }
    public static Map howYears(Map map){
        Map tempMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < map.size(); i++){
            Person tempPerson = (Person) map.get(i);
            if (tempPerson.getAge() >= 20){
                tempMap.put(count, tempPerson);
                count++;
            }
        }return  tempMap;

    }
}