package model.worker;

public class Supervisor extends Person {
    private double pension;
    private double bonusPercent;
    private double bonusSupervisor;
    private int phoneNumber;
    private int mobileNumber;
    private int roomNumber;
    private String departament;

    public Supervisor(String name, String surname, int yearOfBirth, double pension, double bonusPercent, double bonusSupervisor, int phoneNumber, int mobileNumber, int roomNumber, String departament) {
        super(name, surname, yearOfBirth);
        this.pension = pension;
        this.bonusPercent = bonusPercent;
        this.bonusSupervisor = bonusSupervisor;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.roomNumber = roomNumber;
        this.departament = departament;
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

    public void setBonusPercent(double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    public double getBonusSupervisor() {
        return bonusSupervisor;
    }

    public void setBonusSupervisor(double bonusSupervisor) {
        this.bonusSupervisor = bonusSupervisor;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void printData() {
        System.out.println("\n--------------------------------------------------" +
                "\nSupervisor - Name: " + getName() + " Surname: " + getSurname() +
                "\nYear of Birth: " + getYearOfBirth() +
                "\nPension: " + getPension() +
                "\nBonus percent: " + getBonusPercent() +
                "\nBonus Supervisor: " + getBonusSupervisor() +
                "\nPhone: " + getPhoneNumber() +
                "\nMobile phone: " + getMobileNumber() +
                "\nRoom number: " + getRoomNumber() +
                "\nDepartament: " + getDepartament() +
                "\nPaycheck: " + calculatePaycheck() + " PLN" +
                "\n--------------------------------------------------");
    }

    public double calculatePaycheck() {
        return getPension() + (getBonusPercent() * getPension()) + getBonusSupervisor();
    }
}
