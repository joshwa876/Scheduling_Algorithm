public class Employee {
    private String aFirstName;
    private String aLastName;
    private int aId;
    private Schedule aworkShift;

    public Employee(String aFirstName,
                    String aLastName, int aId,
                    Schedule aWorkShift) {
        this.aFirstName = aFirstName;
        this.aLastName = aLastName;
        this.aId = aId;
        this.aworkShift = aWorkShift;
    }

    public String getaFirstName() {
        return aFirstName;
    }

    public void setaFirstName(String aFirstName) {
        this.aFirstName = aFirstName;
    }

    public String getaLastName() {
        return aLastName;
    }

    public void setaLastName(String aLastName) {
        this.aLastName = aLastName;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public Schedule getAworkShift() {
        return aworkShift;
    }

    public void setAworkShift(Schedule aworkShift) {
        this.aworkShift = aworkShift;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "aFirstName='" + aFirstName + '\'' +
                ", aLastName='" + aLastName + '\'' +
                ", aId=" + aId +
                ", aworkShift=" + aworkShift +
                '}';
    }
}
