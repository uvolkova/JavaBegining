package src.oop;

import java.time.YearMonth;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
    }

    public String getMiddleName() {
        return name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + familyName + " " + name + " " + middleName + "; " + age +"лет"+"}";
    }

    int yearNow = YearMonth.now().getYear();

    int calculateYearOfBirth() {
        return yearNow - age;
    }
}


