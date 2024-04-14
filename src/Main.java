public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);

        Integer valueInteger = 33;
        changeValueInteger(valueInteger);
        System.out.println(valueInteger);

        Integer[] massiveValue = new Integer[]{3, 4};
        changeMassiveValue(massiveValue);
        for (int i = 0; i < massiveValue.length; i++) {
            System.out.println(massiveValue[i]);
        }

        Integer[] massiveValue1 = new Integer[2];
        massiveValue1[0] = 3;
        massiveValue1[1] = 4;
        changeMassiveValue1(massiveValue1);
        for (int i = 0; i < massiveValue1.length; i++) {
            System.out.println(massiveValue1[i]);
        }

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println("person = " + person);

        Person2 personX = new Person2("Lyapis", "Trubetskoy");
        changePerson2(personX);
        System.out.println("person = " + personX);
    }

    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValueInteger(Integer valueInteger) {
        valueInteger = 22;
    }
    public static void changeMassiveValue(Integer[] massiveValue) {
        Integer[] massiveValueX = new Integer[]{1, 2};
    }

    public static void changeMassiveValue1(Integer[] massiveValue1) {
        Integer[] massiveValueZ = new Integer[2];
        massiveValueZ[0] = 99;
        massiveValueZ[1] = null;
    }
    public static void changePerson(Person person) {
        Person person1 = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson2(Person2 person) {
        Person2 person2 = new Person2(null, null);
        person2.setName("Ilya");
        person2.setSurname("Lagutenko");
    }
}