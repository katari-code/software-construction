import java.util.*;

public class Student extends PrintInfo <String, String> {

    String studentName;
    String ACID;
    String BirthYear;
    String matricNumber;
    String email;
    HashMap<String, String> data = new HashMap<String, String>();

    public Student(HashMap<String, String> data) {
        super(data);
        this.data = data;
    }

    public Student(String studentName, String ACID, String BirthYear, String matricNumber,
            String email) {
        super(new HashMap<String, String>());
        

        
        this.studentName = studentName;
        this.ACID = ACID;
        this.BirthYear = BirthYear;
        this.matricNumber = matricNumber;
        this.email = email;
        this.addData("Name", this.studentName);
        this.addData("ACID", this.ACID);
        this.addData("Birth Year", this.BirthYear);
        this.addData("Matric Number", this.matricNumber);
        this.addData("Email", this.email);

    }

    public void addData(String key, String value) {
        super.addData(key, value);
    }

    @Override
    public void printData() {
        System.out.println("STUDENT DATA");
        super.printData();
    }
}