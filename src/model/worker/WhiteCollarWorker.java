package model.worker;

public class WhiteCollarWorker extends Person {
    private double pension;
    private double bonusPercent;
    private Supervisor supervisor;
    private int phoneNumber;
    private int roomNumber;

    public WhiteCollarWorker(String name, String surname, int yearOfBirth, double pension, double bonusPercent, Supervisor supervisor, int phoneNumber, int roomNumber) {
        super(name, surname, yearOfBirth);
        this.pension = pension;
        this.bonusPercent = bonusPercent;
        this.supervisor = supervisor;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public double getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(double bonusPrecent) {
        this.bonusPercent = bonusPrecent;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void printData() {
        System.out.println("\n--------------------------------------------------" +
                "\nWhite-collar worker - Name: " + getName() + " Surname: " + getSurname() +
                "\nYear of Birth: " + getYearOfBirth() +
                "\nPension: " + getPension() +
                "\nBonus percent: " + getBonusPercent() +
                "\nSupervisor: " + supervisor.getName() + " " + supervisor.getSurname() +
                "\nPhone: " + getPhoneNumber() +
                "\nRoom number: " + getRoomNumber() +
                "\nPaycheck: " + calculatePaycheck() + " PLN" +
                "\n--------------------------------------------------");
    }

    public double calculatePaycheck() {
        return getPension() + (getBonusPercent() * getPension());
    }
}
