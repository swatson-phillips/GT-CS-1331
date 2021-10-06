public class Dentist extends Person {
    protected String degree;

    public Dentist() {
        this("DDS");
    }

    public Dentist(String degree) {
        super(); //this is inserted implicitly so we don't actually have to write it
        this.degree = degree;
    }

    //this talk method doesn't override the parent's talk method so using the annotation causes a compile time error.
    //@Override
    public void talk(String s, int times) {
        super.talk();
        System.out.println("I know my hands are in your mouth but... tell me your life story...");
    }
}
