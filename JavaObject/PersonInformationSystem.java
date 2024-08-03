import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int income;
    int birthDay, birthMonth, birthYear;

    public Person(String name, int income, int birthDay, int birthMonth, int birthYear) {
        this.name = name;
        this.income = income;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }
}

public class PersonInformationSystem {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Predefined data
        people.add(new Person("Alice", 50000, 15, 3, 1990));
        people.add(new Person("Bob", 60000, 20, 5, 1985));
        people.add(new Person("Charlie", 75000, 10, 8, 1995));

        // Process queries
        System.out.println("Names with birth month 3:");
        printNamesByBirthMonth(people, 3);

        System.out.println("\nNames with birth month 5:");
        printNamesByBirthMonth(people, 5);

        System.out.println("\nNames with income >= 60000:");
        printNamesByIncome(people, 60000);
    }

    private static void printNamesByBirthMonth(List<Person> people, int month) {
        for (Person person : people) {
            if (person.birthMonth == month) {
                System.out.print(person.name + " ");
            }
        }
        System.out.println();
    }

    private static void printNamesByIncome(List<Person> people, int incomeThreshold) {
        for (Person person : people) {
            if (person.income >= incomeThreshold) {
                System.out.print(person.name + " ");
            }
        }
        System.out.println();
    }
}
