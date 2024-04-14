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
        Integer[] massiveValue1 = new Integer[10];
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

}