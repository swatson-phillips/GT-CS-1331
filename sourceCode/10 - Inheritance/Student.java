public class Student extends Person {
    private double gpa;

/** copied here after lecture
 * it doesn't matter if the main method is here or in another class
 * the private fields of the parent are still private
 */
    public static void main(String[] args) {
        Person p = new Person();
        p.talk();
        // illegal, age is not accessible
        //System.out.println(p.age);

        Student s = new Student();
        s.talk();
        s.talk("What up!!!");
        // the below direct field access is still illegal even int he child class
        //System.out.println(s.age);
        s.setAge(70);
        System.out.println(s.getAge());
    }
}
