// Абстрактный класс "Человек"
abstract class Person {
    protected String fullName;
    protected int birthYear;
    protected double salary;

    // Конструктор
    public Person(String fullName, int birthYear, double salary) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    // Абстрактный метод для вывода информации о человеке
    public abstract void displayInfo();
}

// Класс Директор
class Director extends Person {
    public Director(String fullName, int birthYear, double salary) {
        super(fullName, birthYear, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Директор: " + fullName + ", год рождения: " + birthYear + ", зарплата: " + salary);
    }
}

// Класс Начальник отдела
class DepartmentHead extends Person {
    public DepartmentHead(String fullName, int birthYear, double salary) {
        super(fullName, birthYear, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Начальник отдела: " + fullName + ", год рождения: " + birthYear + ", зарплата: " + salary);
    }
}

// Класс Работник
class Worker extends Person {
    public Worker(String fullName, int birthYear, double salary) {
        super(fullName, birthYear, salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Работник: " + fullName + ", год рождения: " + birthYear + ", зарплата: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов классов
        Director director = new Director("Иван Иванович", 1970, 10000.0);
        DepartmentHead departmentHead = new DepartmentHead("Петр Петрович", 1985, 8000.0);
        Worker worker = new Worker("Анна Сергеевна", 1995, 5000.0);

        // Вывод информации о каждом объекте
        director.displayInfo();
        departmentHead.displayInfo();
        worker.displayInfo();
    }
}
