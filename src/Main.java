public class Main {
    public static class Person {
        String name;
        String surname;
        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
    public static void changePerson(Person person) {
        person = new Person("Lyapis", "Trubetskoy");
    }
    public static void main(String[] args) {
        Person person = new Person("Ilya", "Lagutenko");
        changePerson(person);
        System.out.println("person = " + person);
    }
}

// Объявите объект класса person с полями name и surname.
// Переопределите у него метод toString так, чтобы он возвращал строку из name и surname.
// Объявите метод changePerson, который принимает параметр типа Person под названием person.
// Внутри метода с помощью оператора присваивания запишите в параметр новый объект типа Person.
// Присвойте строке name значение Ilya, строке surname — значение Lagutenko.
// В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
// Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
// В следующей строке вызовите метод changePerson и передайте в него эту переменную.