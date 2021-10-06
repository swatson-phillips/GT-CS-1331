public class Driver {
    public static void main(String[] args) {
        Person p1 = new Person(40);
        Person p2 = new Person(40);
        //p1.talk();
        //This  is legal and hints a polymorphism
        //Person p3 = new Student();

        Student student = new Student(40);
        //student.talk();
        //student.talk("What up!!!");
        student.setAge(40);
        //System.out.println(student.getAge());

        Dentist dentist = new Dentist();
        //dentist.talk();

        /** test equals method **/
        System.out.println("p1.equals(p2) --> " + p1.equals(p2));
        System.out.println("p2.equals(p1) --> " + p2.equals(p1));
        //below violates the rule of symmetry IFF we use the instanceof check in the Person's equals()
        System.out.println("p1.equals(student) --> " + p1.equals(student));
        System.out.println("student.equals(p1) --> " + student.equals(p1));
        //System.out.println("p1.equals(dentist) --> " + p1.equals(dentist));
        //System.out.println(dentist.equals(p1));

        System.out.println(p1);
        // if we haven't overriden the toString method in Student then the Person's toString method is used
        System.out.println(student); 
        System.out.println(dentist);
        testSymmetry();
    }
}
