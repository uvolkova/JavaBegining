package src.oop;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String familyName = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        Person person = new Person(name, middleName, familyName, age);

        person.setName("");
        person.setFamilyName("Mask");
        person.setAge(56);


        System.out.println("Объект класса Person был создан: " + person);
        person.calculateYearOfBirth();
    }
}

