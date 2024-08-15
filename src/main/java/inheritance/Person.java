package inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        this("Unknown", 0, "Unknown");
    }

    public Person(String name) {
        this(name, 0, "Unknown");
    }

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other")) {
            throw new IllegalArgumentException("Invalid gender. Accepted values: Male, Female, Other");
        }
        this.gender = gender;
    }
}
