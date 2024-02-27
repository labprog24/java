interface Person {
    String getName();
    int getAge();
}

class Teacher implements Person {
    private String name;
    private int age;
    private String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}

class Student implements Person {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void study() {
        System.out.println(name + " is studying " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 35, "Math");
        Student student = new Student("Alice", 20, "Computer Science");

        System.out.println("Teacher: " + teacher.getName() + ", Age: " + teacher.getAge());
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());

        teacher.teach();
        student.study();
    }
}
