package model.worker;

public class Intern extends Person {
    private IPerson workBuddy;
    private boolean grant;

    public Intern(String name, String surname, int yearOfBirth, IPerson workBuddy, boolean grant) {
        super(name, surname, yearOfBirth);
        this.workBuddy = workBuddy;
        this.grant = grant;
    }

    public IPerson getWorkBuddy() {
        return workBuddy;
    }

    public void setWorkBuddy(IPerson workBuddy) {
        this.workBuddy = workBuddy;
    }

    public boolean isGrant() {
        return grant;
    }

    public void setGrant(boolean grant) {
        this.grant = grant;
    }

    public void printData() {
        System.out.println("\n--------------------------------------------------" +
                "\nIntern - Name: " + getName() + " Surname: " + getSurname() +
                "\nYear of Birth: " + getYearOfBirth() +
                "\nWork-buddy: " + workBuddy.getName() + " " + workBuddy.getSurname() +
                "\nGrant: " + isGrant() +
                "\nPaycheck: " + calculatePaycheck() + " PLN" +
                "\n--------------------------------------------------");
    }

    public double calculatePaycheck() {
        if (grant) {
            return 1500;
        }
        return 0;
    }
}
