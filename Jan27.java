public class Jan27 {
    public static void main(String[] args){

        /*Outer.Inner obj = new Outer().new Inner();
        obj.display();*/

        Child obj1 = new Child();
        obj1.c();
        //obj1.p();
        obj1.gp();
    }
}

class Outer {
    class Inner {
        void display(){
            System.out.println("Inner class method ");
        }
    }
}

class Grandparent {
    void gp(){
        System.out.println("grandparent class method");
    }
}

class Parent extends Grandparent{
    void p(){
        System.out.println("parent class method");
    }
}

class Child extends Grandparent{
    void c(){
        System.out.println("child class method");
    }
}

class Shape {
    void angle(){
        System.out.println("angle de bhen ke :- ");
    }
}

class Triangle {
    void side(){
        System.out.println("side length de chutiye :- ");
    }
} 

class Iso_triangle extends Triangle {
    void iso(){

    }
}

class Scal_triangle extends Triangle{
    void scal(){

    }
}

class Equi_triangle extends Triangle{
    void equi(){

    }
}

class RightAngled {
    void hypo(){
        System.out.println("hypo ki lenght :- ");
    }
}

class Student {
    String name;

    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println("name: "+this.name);
    }
}
