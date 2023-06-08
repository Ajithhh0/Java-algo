class Pen{
  String color;
  String type; //ball or gel
  
  public void write(){
    System.out.println("writing something");
  }

  public void printColor(){
    System.out.println(this.color);
  }
}

class Student{
    String name;
    int age;

    public void printInfo(){
           System.out.println(this.name);
           System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
       
    }
}

public class OOP {
public static void main(String args[]){
    Pen pen1 = new Pen();
    pen1.color = "blue";
    pen1.type = "gel";

    pen1.write();

    Pen pen2 = new Pen();
    pen2.color = "black";
    pen2.type = "ball";

    pen1.printColor();
    pen2.printColor();


    Student s1 = new Student("Ajith", 22);
    

    s1.printInfo();
}
    
    }
    
