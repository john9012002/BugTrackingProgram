import java.util.Date;

public class Bug {
    private String description;
    private Date dateReported;
    private String solution;

    public Bug(String description, Date dateReported) {
        this.description = description;
        this.dateReported = dateReported;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
