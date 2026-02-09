public class Feb3 {
    public static void main(String arg[]){
        Cat obj1 = new Cat();
        obj1.voi();

        A obj2 = new B();
        obj2.alpha();
    }
}

class Ani{
     void voice(){
        System.out.println("this is the animal voice");
     }

     Ani(){
        System.out.println("u r in Animal class");
     }
}

class Cat extends Ani{

    Cat(){
        System.out.println("u r in Cat class");
    }

    void voi(){
        System.out.println("Meow Meow");
    }
}

interface A{
    void alpha();
}

class B implements A{
    public void alpha(){
        System.out.println("yo");
    }
} 
