package model.worker;

public class Trustee extends Person {
    private double pension;
    private IPerson assistant;
    private int meetings;

    public Trustee(String name, String surname, int yearOfBirth, double pension, IPerson assistant, int meetings) {
        super(name, surname, yearOfBirth);
        this.pension = pension;
        this.assistant = assistant;
        this.meetings = meetings;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public IPerson getAssistant() {
        return assistant;
    }

    public void setAssistant(IPerson assistant) {
        this.assistant = assistant;
    }

    public int getMeetings() {
        return meetings;
    }

    public void setMeetings(int meetings) {
        this.meetings = meetings;
    }

    public void printData() {
        System.out.println("\n--------------------------------------------------" +
                "\nTrustee - Name: " + getName() + " Surname: " + getSurname() +
                "\nYear of Birth: " + getYearOfBirth() +
                "\nPension: " + getPension() +
                "\nAssistant: " + assistant.getName() + " " + assistant.getSurname() +
                "\nNumber of attended meetings: " + getMeetings() +
                "\nPaycheck: " + calculatePaycheck() + " PLN" +
                "\n--------------------------------------------------");
    }

    public double calculatePaycheck() {
        return getPension() + (getMeetings() * 200);
    }
}
