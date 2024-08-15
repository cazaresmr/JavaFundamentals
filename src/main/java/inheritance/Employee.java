package inheritance;

public class Employee extends Person {
    private String employeeID;
    private String title;

    public Employee() {
        super("Michael", 0, "Male"); // Provide a valid default gender
    }

    public Employee(String name, int age, String gender, String employeeID, String title) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setTitle(title);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if (employeeID == null || employeeID.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty");
        }
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }
}
