import java.util.ArrayList;
import java.util.Date;

public class BugTrackingProgram {
    public static void main(String[] args) throws Exception {
        BugTrackingSystem system = new BugTrackingSystem("1.0.0");

        Bug bug1 = new Bug("Application crashes when user clicks button", new Date());
        Bug bug2 = new Bug("Text is cut off in the settings menu", new Date());
        system.addBug(bug1);
        system.addBug(bug2);

        Employee employee1 = new Employee("John Smith");
        Employee employee2 = new Employee("Jane Doe");
        system.addEmployee(employee1);
        system.addEmployee(employee2);

        ArrayList<Bug> searchResults = system.searchBugs("crashes");
        for (Bug bug : searchResults) {
            System.out.println(bug.getDescription());
        }

        ArrayList<Bug> bugHistory = system.getBugHistory();
        for (Bug bug : bugHistory) {
            System.out.println(bug.getDescription() + " - " + bug.getSolution());
        }

        system.evaluateEmployee(employee1, 4);
        int employee1Rating = employee1.getRating();
        System.out.println(employee1.getName() + " has a rating of " + employee1Rating);

        system.setLatestVersion("1.0.1");
        String latestVersion = system.getLatestVersion();
        System.out.println("The latest version is " + latestVersion);
    }
}
