public class Main {
    public static void main(String[] args) {
        Student student = new Student("Adilet", "Islambek uulu", "Java-9", 6);
        Student student1 = new Student("Khafiz","Turusbek uulu","Java-8",1);
        Aspirant aspirant = new Aspirant("Kanykei", "Akjoltoi kyzy", "Java-9", 8);
        Aspirant aspirant1 = new Aspirant("Madina","Khalikova","Java-8",3);
        Student[] students = {student,student1, aspirant,aspirant1};
        for (Student stu : students) {
            System.out.println(stu);
            System.out.println(stu.getScholArship());

        }
    }
}