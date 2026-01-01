public class Student_v2 extends Person {

    double gpa;

    Student_v2(String first, String last, double gpa) {
        super(first, last); // Pass the attribute according to what parent class requires
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + " " + this.last + " has a GPA of " + this.gpa);
    }
}
