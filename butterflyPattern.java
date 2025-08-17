public class butterflyPattern {
    public static void main(String[] args){
        int rows = 5;

        for(int i = 1; i < rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int s = 1; s <= 2*(rows-i);s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int s = 1; s <= 2*(rows-i);s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
