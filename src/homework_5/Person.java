package homework_5;

public class Person {
    public String firstName;
    public String lastName;
    public String middleName;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Person(
            String firstName,
            String lastName,
            String middleName,
            String position,
            String email,
            String phone,
            int salary,
            int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("\n====================\n");
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("\n====================\n");
    }
}
