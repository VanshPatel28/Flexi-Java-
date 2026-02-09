//import JAVA.MyClass;

public class Feb9 {
    public static void main(String[] arg){
        //MyClass obj1 = new MyClass();
        //obj1.display();

        Calculator obj2 = new Calculator();
        int a = obj2.add(12,13);
        int b = obj2.add(12,13,14);
        double c = obj2.add(12.13,13.12);
        System.out.println("the result is :- "+a+", "+b+", "+c);

        
        BankAccount obj4 = new SavingsAccount();
        double sa = obj4.getInterestRate();
        System.out.println("the value in saving account is :- "+sa);

        
        BankAccount obj5 = new CurrentAccount();
        double ca = obj5.getInterestRate();
        System.out.println("the value in saving account is :- "+ca);
    }
}

class Calculator{

    int add(int a, int b){
        return (a+b);
    }

    double add(double a, double b){
        return (a+b);
    }

    int add(int a, int b, int c){
        return (a+b+c);
    }

    int multi(int a, int b){
        return (a*b);
    }
}

class BankAccount{
    double getInterestRate(){
        return (0.0);
    }
}

class SavingsAccount extends BankAccount{
    double getInterestRate(){
        return (4.5);
    }
}

class CurrentAccount extends BankAccount{
    double getInterestRate(){
        return (3.0);
    }
}