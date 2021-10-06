public class Person {
    private int age;
    public Person() {
        this(0);
    }

    public Person(int age) {
        this.age = age;
    }

    public void talk(){
        System.out.println("Hello dear friend!");
    }

    public void talk(String words) {
        System.out.println(words);
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public boolean equals(Object obj) {
        Person p;
        //if(!(this.getClass() == obj.getClass())) {
        if(!(obj instanceof Person)) {
            return false;

         } else {
             p = (Person) obj;
            return this.age == p.age;
        }

    }
    public String toString(){
        return "This is a person who is " + age + " years old.";
    }
}
