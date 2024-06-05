public class Lesson19 {
    public static void main(String[] args) {
        String name = "Фёдор";
        Human human = new Human();
        System.out.println(name);
        human.getName();
    }
}
class Human {
    String name = "Костя";
    public void getName(){
        System.out.println(name);
    }
}