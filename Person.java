//Solution File

public class Person {
    // instance variables
    private String name; // person's name
    private int age; // person's age in years
    // constructor for Person

    public Person(String bornName) {
        // initialize instance variables
        this.name = bornName;
        this.age = 0;
    }

    // increments a person's age
    public void birthday() {
        age += 1;
    }

    // returns the age in years of this person
    public int howOld() {
        // fix this
        return age;
    }

    // returns a String representation of a Person
    public String toString() {
        // fix this
        return name + ": " + age + " years old";
    }

    // main test code
    public static void main(String[] args) {
        // create some Person objects
        Person bruno = new Person("Bruno");
        Person beyonce = new Person("Beyonce ");
        // test case for 0 age
        if (bruno.howOld() == 0)
            System.out.println("Test for bruno passed");
        // test case for 0 age
        if (beyonce.howOld() == 0)
            System.out.println("Test for beyonce passed");
        // test for birthday
        beyonce.birthday();
        beyonce.birthday();
        // test case for 0 age
        if (beyonce.howOld() == 2)
            System.out.println("Test for zion is 2 passed");
        // test toString
        System.out.println(bruno.toString());
        System.out.println(beyonce.toString());
        // StdOut.println(bruno);
        // StdOut.println(beyonce);
    }
}