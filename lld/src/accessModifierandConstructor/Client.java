package accessModifierandConstructor;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tarun");
        s.rno = 21;
        System.out.println(s.getName());
        System.out.println(s.rno);
    }
}
