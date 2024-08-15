package inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
        Person person = new Person("Michael Cazares", 70, "Male");
        System.out.println("Person created: " + person.getName() + ", " + person.getAge() + ", " + person.getGender());

        Employee employee = new Employee("Michael Cazares", 70, "Male", "EMP007", "Director");
        System.out.println("Employee created: " + employee.getName() + ", " + employee.getAge() + ", " + employee.getGender() + ", " + employee.getEmployeeID() + ", " + employee.getTitle());
    }
}
