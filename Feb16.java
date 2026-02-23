import java.util.*;

public class Feb16 {
    public static void main(String args[]){
        int[] numbers1 = {10,20,30,40,50,6,7,8,9,0};
        int[] numbers2 = {60,70,80,90,100};
        int[] numbers3 = {1,2,3,4,5};
        int[] numbers4 = new int[10];

        for (int i=0; i<numbers4.length+1; i++){
            numbers4[i] = numbers1[i]; //exception ArrayIndexOutOfBounds 
        }

        for (int i=0; i<numbers1.length; i++){
            System.out.print(numbers1[i]+",");
        }

        System.out.println("");
        
        for (int num1 : numbers1){
            System.out.print(num1+",");
        }
        System.out.println("");
        for (int num2 : numbers2){
            System.out.print(num2+",");
        }
        System.out.println("");
        for (int num3 : numbers3){
            System.out.print(num3+",");
        }


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: "+fruits);
        fruits.remove("Banana");
        System.out.println("after removing banana :- "+fruits);


        Vector<Integer> nums = new Vector<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);

        System.out.println("Vector :- "+nums);
        nums.remove(1);
        

    }
}
