public class Student1 {
    String name;
    static int count = 0;
    Student1(String name) {
        this.name = name;
        count++;
    }
    void display() {
        System.out.println("Student Name: " + name);
    }
    public static void main(String[] args) {
        Student1 s1 = new Student1("Shreyas");
        Student1 s2 = new Student1("Prashanth");
        Student1 s3 = new Student1("Chaitanya");
        s1.display();
        s2.display();
        s3.display();
        System.out.println("Total Students: " + Student1.count);
    }
}
