import java.util.StringTokenizer;

public class Feb17 {
    public static void main(String args[]){
        
        String str2 = "Hello ";
        String str1 = new String("java");
        System.out.print(str2);
        System.out.println(str1);

        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append("World");
        System.out.println("Afer append :- "+sb);

        sb.insert(6,"Java");
        System.out.println("Afer insert :- "+sb);

        sb.replace(0,5,"Hi");
        System.out.println("Afer replace :- "+sb);

        sb.delete(2,5);
        System.out.println("Afer delete :- "+sb);

        sb.reverse();
        System.out.println("Afer reverse :- "+sb);

        String str = " Java, python, C++, Javascript";
        StringTokenizer st = new StringTokenizer(str,",");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1/num2;
            System.out.println("result :- "+result);
        }catch(ArithmeticException e){
            System.out.println("error : cannot divide by zero");
            System.out.println("Exception Message :- "+e.getMessage());
        }
    }
}
