package model.worker;

public class ManualWorker extends Person {
    private double wagePerHour;
    private double workingHours;
    private double overtime;
    private Supervisor supervisor;
    private String skills;

    public ManualWorker(String name, String surname, int yearOfBirth, double wagePerHour, double workingHours, double overtime, Supervisor supervisor, String skills) {
        super(name, surname, yearOfBirth);
        this.wagePerHour = wagePerHour;
        this.workingHours = workingHours;
        this.overtime = overtime;
        this.supervisor = supervisor;
        this.skills = skills;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void printData() {
        System.out.println("\n--------------------------------------------------" +
                "\nManual Worker - Name: " + getName() + " Surname: " + getSurname() +
                "\nYear of Birth: " + getYearOfBirth() +
                "\nSupervisor: " + supervisor.getName() + " " + supervisor.getSurname() +
                "\nWage per hour: " + getWagePerHour() +
                "\nOvertime: " + getOvertime() +
                "\nSkills: " + getSkills() +
                "\nPaycheck: " + calculatePaycheck() + " PLN" +
                "\n--------------------------------------------------");
    }

    public double calculatePaycheck() {
        return (getWagePerHour() * getWorkingHours()) + (1.5 * getWagePerHour() * getOvertime());
    }
}
