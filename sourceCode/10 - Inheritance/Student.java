public class Student extends Person {
    private double gpa;
    public Student() {
        //call to super is deferred because there is a chained constructor call
        this(4.0);
    }
    public Student(double gpa) {
        // a call to super() is inserted ... is that what we want or do we want to explicitly call a constructor with a parameter
        this.gpa = gpa;
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("Yo!");
    }

    public void talk(String a, int time) {
        for(int i =0 ; i<time; i++)
            super.talk(a);
    }

    @Override
    public boolean equals(Object obj) {
        Student s;
        //if(!(this.getClass() == obj.getClass())) {
        if(!(obj instanceof Student)) {
            return false;

         } else {
             s = (Student) obj;
            return super.equals(s) && this.gpa == s.gpa;
        }

    }
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
        // System.out.println(s.age);
        s.setAge(70);
        System.out.println(s.getAge());
    }
}
