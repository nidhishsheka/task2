import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    
    public String toCSV() {
        return rollNumber + "," + name + "," + marks;
    }

    @Override
    public String toString() {
        return name + " (Roll No: " + rollNumber + ", Marks: " + marks + ")";
    }
}
