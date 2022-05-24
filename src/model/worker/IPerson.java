package model.worker;

public interface IPerson {
    void printData();

    double calculatePaycheck();

    String getName();

    void setName(String name);

    String getSurname();

    void setSurname(String surname);

    int getYearOfBirth();

    void setYearOfBirth(int yearOfBirth);
}
