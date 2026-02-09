public class star_pattern {
    public static void main(String[] args){

        for (int i=0; i<10; i++){
            for (int k=10-i; k>0; k--){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println(" ");

        for (int i=9; i>0; i--){
            for (int k=9-i; k>0; k--){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println(" ");

        for (int i=0; i<5; i++){
            for (int k=5-i; k>0; k--){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=5; i>0; i--){
            for (int k=5-i; k>0; k--){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
