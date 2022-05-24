import model.worker.*;

public class Main {

    public static void main(String[] args) {
        Supervisor supervisor1 = new Supervisor("Darryl", "Philbin", 1970, 6500.0,
                0.3, 0.3, 668542336, 502427555, 02, "Warehouse");

        Supervisor supervisor2 = new Supervisor("Dwight", "Schrute", 1967, 6550.0,
                0.4, 0.5, 668542346, 502427355, 10, "Sales");

        ManualWorker manualWorker1 = new ManualWorker("Roy", "Anderson", 1971,
                40.0, 160, 10, supervisor1, "forklift");

        WhiteCollarWorker whiteCollarWorker1 = new WhiteCollarWorker("Jim", "Halpert",
                1973, 6800.0, 0.4, supervisor2, 555555555, 10);

        Trustee trustee1 = new Trustee("Michael", "Scott", 1965, 10000.0, supervisor2, 5);

        Intern intern1 = new Intern("Ryan.", "Howard", 1980, whiteCollarWorker1, true);

        supervisor1.printData();
        supervisor2.printData();
        manualWorker1.printData();
        whiteCollarWorker1.printData();
        trustee1.printData();
        intern1.printData();

    }
}
