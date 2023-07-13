import java.util.ArrayList;

public class BugTrackingSystem {
    private ArrayList<Bug> bugs;
    private ArrayList<Employee> employees;
    private String latestVersion;

    public BugTrackingSystem(String latestVersion) {
        this.bugs = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.latestVersion = latestVersion;
    }

    public void addBug(Bug bug) {
        bugs.add(bug);
    }

    public void removeBug(Bug bug) {
        bugs.remove(bug);
    }

    public ArrayList<Bug> searchBugs(String keyword) {
        ArrayList<Bug> results = new ArrayList<>();
        for (Bug bug : bugs) {
            if (bug.getDescription().contains(keyword)) {
                results.add(bug);
            }
        }
        return results;
    }

    public ArrayList<Bug> getBugHistory() {
        return bugs;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void evaluateEmployee(Employee employee, int rating) {
        employee.setRating(rating);
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }
}
