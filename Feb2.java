class Par{
    void display(){
        System.out.println("Parent class method");
    }
}

class Chi extends Par{
    void display(){
        super.display();
        System.out.println("Child class method");
    }
}

public class Feb2 {
    public static void main(String arg[]){
        //Chi obj1 = new Chi();
        //obj1.display();
    }
}

abstract class Shape{
    abstract void draw();

    void message(){
        System.out.println("this is shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Draw a circle");
    }
}