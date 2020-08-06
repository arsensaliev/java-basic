package homework_5;

public class Main {
    public static void main(String[] args) {
        Person[] personArr = new Person[5];
        personArr[0] = new Person("Арсен", "Салиев", "Сабитович", "Full-stack разработчик", "arsensaliev03@gmail.com", "87080778008", 300000, 17);
        personArr[1] = new Person("Иван", "Иванов", "Иванович", "Мойщик", "azino777@mail.ru", "777777777", 10000000, 46);
        personArr[2] = new Person("Саша", "Шел", "По", "Шассе", "сосалаСушку@mail.ru", "123456789", 10000, 37);
        personArr[3] = new Person("Михаил", "Зубенко", "Петрович", "Мафиозник", "vor.v.zakone@yandex.ru", "8007770230", 5500000, 42);
        personArr[4] = new Person("Ярик", "Васильев", "Александрович", "Гонщик", "ff1.sport@car.com", "103", 3000, 20);

        readArr(personArr);
    }

    public static void readArr(Person[] arr) {
        for (Person person : arr) {
            if (person.age > 40) {
                person.info();
            }
        }
    }
}
