package people_10_1;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUnderfinedException, IncorrectAgeException {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPesel(pesel);
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) throws NameUnderfinedException {
        if ((firstName.length() < 2) || firstName == null) {
            throw new NameUnderfinedException("Za krótkie imię");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) throws NameUnderfinedException {
        if ((lastName.length() < 2) || lastName == null) {
            throw new NameUnderfinedException("Za krótkie nazwisko");
        } else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException("Wiek nie może być mniejszy od 1");
        } else {
            this.age = age;
        }
    }

    public String getPesel() {
        return pesel;
    }

    private void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
