package ir.maktab58.homework3.question2;

enum Degree {
    BACHELOR,
    MASTER,
    PHD;
}

public class Teacher extends Person{
    private Degree degree;

    public Teacher(String firstName, String lastName, int identityNum, Degree degree) {
        super(firstName, lastName, identityNum);
        this.degree = degree;
    }

    public void printIsATeacherMessage() {
        System.out.println(getFirstName() + " " + getLastName() + " is a teacher.");
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
