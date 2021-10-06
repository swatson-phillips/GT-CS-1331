public class Driver {
    public static void main(String[] args) {
        Person p = new Person(40);
        p.talk();
        //This  is legal and hints a polymorphism
        Person p2 = new Student();

        Student s = new Student();
        s.talk();
        s.talk("What up!!!");
        s.setAge(70);
        System.out.println(s.getAge());

        Dentist d = new Dentist();
        d.talk();
    }
}
