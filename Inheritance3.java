class Person{
    
    int age;
    String name;

    public void details(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person {
    public void schoolStudent(){
        System.out.println("Is a school student");
    }
    public void cllgStudent(){
        System.out.println("Is a college student");
    }
}

class Result extends Student{

    int m1, m2, m3;

    public void marks(int m1, int m2, int m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        System.out.println("Subject 1 marks: "+ m1);
        System.out.println("Subject 2 marks: "+ m2);
        System.out.println("Subject 3 marks: "+m3);
    }

    public void grade(){
        if ( (m1+m2+m3)> 240) {
            System.out.println("A");
        }else if ( (m1+m2+m3) > 180){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
    }

    
}

public class Inheritance3 {
    public static void main(String[] args) {

        Person person = new Person();
        person.details("Simran", 21);

        Student student = new Student();
        student.cllgStudent();

        Result result = new Result();
        result.marks(80, 90, 100);
        result.grade();

    }
}
