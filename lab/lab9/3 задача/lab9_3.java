
class Person {

    String name;
    int age;

    void displayInfo() {

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

class Student extends Person {

    String group;

    void study() {

        System.out.println(name + " учится в группе " + group);
    }

    @Override
    void displayInfo() {

        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}

class Professor extends Person {

    String subject;

    void teach() {

        System.out.println(name + " преподаёт предмет: " + subject);
    }

    @Override
    void displayInfo() {

        super.displayInfo();
        System.out.println("Предмет: " + subject);
    }
}

public class lab9_3 {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Жас Исагулов";
        student.age = 20;
        student.group = "ПО-22-1";

        System.out.println("----- Студент -----");

        student.displayInfo();
        student.study();

        Professor professor = new Professor();

        professor.name = "Айгуль Сериковна";
        professor.age = 45;
        professor.subject = "Java";

        System.out.println("\n----- Профессор -----");

        professor.displayInfo();
        professor.teach();

        System.out.println("\n----- Полиморфизм -----");

        Person person;

        person = student;
        person.displayInfo();

        person = professor;
        person.displayInfo();

    }
}
