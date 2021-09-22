package ir.maktab58.homework3.question2;

public class PartTimeTeacher extends Teacher{
    private double numOfHours;
    private double salaryPerHour;

    public PartTimeTeacher(String firstName, String lastName,
                           int identityNum, Degree degree, double numOfHours, double salaryPerHour) {
        super(firstName, lastName, identityNum, degree);
        this.numOfHours = numOfHours;
        this.salaryPerHour = salaryPerHour;
    }

    public void printIsAPrtTimeTeacherMessage() {
        System.out.println(getFirstName() + " " + getLastName() + " is a part-time teacher.");
    }

    public double getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(double numOfHours) {
        this.numOfHours = numOfHours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
