public class starFullPyramid {
    public static void main(String[] args){
        int rows = 5;

        for(int i = 1; i <= rows; i++){
            for(int space = 1; space <= rows - i; space++){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
