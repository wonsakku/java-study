package chap04._4_2_exam_program._2_refactoring;


public class Person {

    private final Label _name;
    private final Label _mail;

    public Person(Label _name) {
        this(_name, new NullLabel());
    }

    public Person(Label _name, Label _mail) {
        this._name = _name;
        this._mail = _mail;
    }

    public void display(){
        _name.display();
        _mail.display();
    }

    @Override
    public String toString() {
        return "Person[name=" + _name + " mail=" + _mail + "]";
    }
}
