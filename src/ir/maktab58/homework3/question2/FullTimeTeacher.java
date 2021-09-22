package ir.maktab58.homework3.question2;

public class FullTimeTeacher extends Teacher{
    private double salaryBase;
    private static double taxShare = 0.07;
    private static double insuranceShare = 0.03;

    public FullTimeTeacher(String firstName, String lastName, int identityNum, Degree degree, double salaryBase) {
        super(firstName, lastName, identityNum, degree);
        this.salaryBase = salaryBase;
    }

    public void printIsAFullTimeTeacherMessage() {
        System.out.println(getFirstName() + " " + getLastName() + " is a full-time teacher.");
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }

    public static double getTaxShare() {
        return taxShare;
    }

    public static void setTaxShare(double taxShare) {
        FullTimeTeacher.taxShare = taxShare;
    }

    public static double getInsuranceShare() {
        return insuranceShare;
    }

    public static void setInsuranceShare(double insuranceShare) {
        FullTimeTeacher.insuranceShare = insuranceShare;
    }
}
