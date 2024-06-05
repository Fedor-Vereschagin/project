public class ClassAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 58;
        person1.speak();
        System.out.println(person1.calculateYearsToRetirement() + "Years for retirement");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();
        person2.setName("Kirill");
        System.out.println(person2.calculateYearsToRetirement() + "Years for retirement");
    }
}
class Person {
    String name;
    int age;
    void speak(){
        System.out.println("My name is " + name + " I'm " + age + " years old.");
    }
    int calculateYearsToRetirement(){
        return 65 - age;
    }
    void setName( String newName ) {
        name = newName;
    }
    private void sayHello(){ System.out.println("Hello");}
}
