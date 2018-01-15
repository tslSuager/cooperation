import java.sql.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    ///////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Person[] aa = new Person[]{
                new Person(), new Person(), new Person()
        };

        aa[0].setAge(1);
        aa[1].setAge(3);
        aa[2].setAge(2);
        Person person = new Person();
        person.setAge(3);
//        int i = Arrays.binarySearch(aa, person);
//        System.out.println(i);

        List<Person> people = Arrays.asList(aa);
        Collections.sort(people);
//        Collections.reverse(people);
//        aa= (Person[]) people.toArray();
        for (Person ss :
                people) {
            System.out.println(ss);
        }

    }
}
