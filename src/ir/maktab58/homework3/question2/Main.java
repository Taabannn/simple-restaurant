package ir.maktab58.homework3.question2;

import java.awt.font.MultipleMaster;

public class Main {
    public static void main(String[] args) {
        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher("Paul", "Petty",
                    876, Degree.BACHELOR, 4500.0);
        fullTimeTeacher1.printIsAPersonMessage();
        fullTimeTeacher1.printIsATeacherMessage();
        fullTimeTeacher1.printIsAFullTimeTeacherMessage();

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher("Quentin", "Scott",
                    12345, Degree.MASTER, 4.5, 670);
        partTimeTeacher1.printIsAPersonMessage();
        partTimeTeacher1.printIsATeacherMessage();
        partTimeTeacher1.printIsAPrtTimeTeacherMessage();

         /*Student student1 = new Student("Rick", "Allen", 100012, 20);
        student1.printIsAPersonMessage();
        student1.printIsAStudentMessage();*/
    }
}
