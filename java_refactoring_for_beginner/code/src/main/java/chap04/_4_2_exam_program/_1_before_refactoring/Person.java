package chap04._4_2_exam_program._1_before_refactoring;

public class Person {

    private final Label _name;
    private final Label _mail;

    public Person(Label _name) {
        this(_name, null);
    }

    public Person(Label _name, Label _mail) {
        this._name = _name;
        this._mail = _mail;
    }

    public void display(){
        if(_name != null){
            _name.display();
        }
        if(_mail != null){
            _mail.display();
        }
    }

    @Override
    public String toString() {
        String result = "Person[" +
                "name=";

        if(_name == null){
            result += "\"(none)\"";
        }else{
            result += _name;
        }
        result += " mail=";

        if(_mail == null){
            result += "\"(none)\"";
        }else{
            result += _mail;
        }
        result += "]";
        return result;
    }
}
