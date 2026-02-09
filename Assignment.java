public class Assignment {
    public static void main(String[] args){
        System.out.println("Rule 1: Java is case-sensitive.");
        System.out.println("Rule 2: The main method is the entry point of a Java program.");

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==0 || i==4){
                    System.out.print(" *");
                }
                else{
                    if( j==0 || j==4){
                        System.out.print(" *");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==j){
                    System.out.print(" *");
                }
                if (i + j == 4 && i != j){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==0 || i==4){
                    System.out.print(" 1");
                }
                else{
                    if( j==0 || j==4){
                        System.out.print(" 1");
                    }
                    else{
                        if( i==2 && j==2){
                            System.out.print("  ");
                        }
                        else{
                            System.out.print(" 2");
                        }
                    }
                }
            }
            System.out.println(" ");
        }
    }    
}
