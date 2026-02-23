public class Feb23 {
    public static void main(String args[]){
        try{
            //outer try block
            System.out.println("Outer try block started.");

            try{
                //inner try block
                System.out.println("Inner try block started.");
                int result = 10/0; //this will cause ArithmeticException
            }catch (ArithmeticException e){
                //catch block for inner try
                System.out.println("caught arithmetic exception in inner try block : "+ e.getMessage());
            }

            String str = null;
            System.out.println(str.length()); //this will cause nullpointer exception
        }catch (NullPointerException e){
            //catch block for outer try
            System.out.println("Caught null pointer exception in outer block : "+ e.getMessage());
        }finally {
            //final block for outer try
            System.out.println("Finally block out of try executed.");
        }
        System.out.println("Program continues after nested try-catch blocks.");
    }
}