public class Jan20 {  
        public static void main(String[] args){
            /*for (int i=0; i<5; i++){
                System.out.println("Java is fun");
            }*/

            Student obj1 = new Student();
            obj1.display();

            Student obj2 = new Student(2);
            obj2.display();

            Counter obj5 = new Counter();
            Counter obj4 = new Counter();
            Counter obj3 = new Counter();

            Calculator obj6 = new Calculator();
            int result = obj6.add(2,3);
            System.out.println("the result is :- "+result);
        }
}

class Student{
    
    String name;
    int age;

    Student(){
        name = "vansh";
        age = 19;
    }

    Student(int prn){
        name = "vasu";
        age = 19;
    }

    void display(){
        System.out.println("The name is :- "+name);
        System.out.println("The age is :- "+age);
    }
}

class Counter {
    static int count = 0;

    Counter(){
        count++;
        System.out.println("the count is :- "+count);
    }
}

class Calculator{
    static int add(int a, int b){
        return (a+b);
    }
}
