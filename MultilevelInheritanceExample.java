class Person {
    void speak() {
        System.out.println("Person is speaking");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

class CollegeStudent extends Student {
    void attendclass() {
        System.out.println("College student is attending class");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();

        cs.study();
        cs.speak();
        cs.attendclass();
    }
}
