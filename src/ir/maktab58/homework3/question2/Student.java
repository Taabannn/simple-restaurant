package ir.maktab58.homework3.question2;

import java.util.Date;

public class Student extends Person{
    private int studentId;
    private Date dateOfGraduation;
    private boolean graduationStatus;

    public Student(String firstName, String lastName, int identityNum, int studentId) {
        super(firstName, lastName, identityNum);
        this.studentId = studentId;
    }

    public void printIsAStudentMessage() {
        System.out.println(getFirstName() + " " + getLastName() + " is a student");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Date getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(Date dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public boolean isGraduationStatus() {
        return graduationStatus;
    }

    public void setGraduationStatus(boolean graduationStatus) {
        this.graduationStatus = graduationStatus;
    }
}
