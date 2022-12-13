import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private Set<String> passportNumbers;
    private String surName;
    private String name;
    private String lastName;
    private String dateOfBirth;

    public Passport(Set<String> passportNumbers, String surName, String name, String lastName, String dateOfBirth) {
        this.passportNumbers = passportNumbers;
        this.surName = surName;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        if (name == null || name.isEmpty() || name.isBlank())
            throw new IllegalArgumentException("Некорректно заполнено Имя");
        if (surName == null || surName.isEmpty() || surName.isBlank())
            throw new IllegalArgumentException("Некорректно заполнена Фамилия");
        if (dateOfBirth == null || dateOfBirth.isEmpty() || dateOfBirth.isBlank())
            throw new IllegalArgumentException("Некорректно заполнена Дата рождения");


    }

    public Set<String> getPassportNumbers() {
        return passportNumbers;
    }


    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isSetNumber(String s) {
        return passportNumbers.contains(s);
    }

    public String print(String s) {
        for (String passport1:passportNumbers) {
            return passport1;
        }
        return null;
    }


    @Override
    public String toString() {
        return "Номер паспорта: " + passportNumbers +
                " Фамилия: " + surName +
                " Имя: " + name +
                " Отчество: " + lastName +
                " Дата рождения: " + dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumbers == passport.passportNumbers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumbers);
    }

}