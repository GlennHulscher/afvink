
public class Main {

    public static void main(String[] args) {
        Student stud1, stud2, stud3, stud4;
        stud1 = new Student("piet", 19, 23456);
        stud2 = new Student("henk", 20, 23457);
        stud3 = new Student("kees",21, 23448);
        stud4 = new Student();

        stud1.info();
        stud2.info();
        stud3.info();
        stud4.info();
    }
}