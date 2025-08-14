public class diamondNumbers {
    public static void main(String[] args){
        int rows = 5;

        for(int i = 1; i < rows; i++){
            for(int space = 1; space <= rows - i; space++){
                System.out.print("  ");
            }
            //increasing numbers
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            //decreasing numbers
            for(int k = i - 1; k >= 1; k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }

        //inverted pyramid
        for(int i = rows - 2; i >= 1; i--){
            for(int space = 1; space <= rows - i; space++){
                System.out.print("  ");
            }
            //increasing number
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            //decreasing number
            for(int k = i - 1; k >= 1; k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
