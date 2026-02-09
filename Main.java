public class Main{

    public static void main(String[] args){
        System.out.println("hello world");

        for (int i=0; i<5; i++){
            for (int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=5; i>0; i--){
            for (int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}