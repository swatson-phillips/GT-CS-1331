public class Driver{
    public static void main(String[] args) {
        Person p = new Person();
        p.talk();

        Student s = new Student();
        s.talk();
        s.talk("What up!!!");
        s.setAge(70);
        System.out.println(s.getAge());
    }
}
