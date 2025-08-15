public class hollowDiamond {
    public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i < rows; i++){
            for(int s = 1; s <= rows - i; s++){
                System.out.print("  ");
            }

            for(int j = 1; j <= 2 * i - 1; j++){
                if(j == 1 || j == 2 * i - 1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i = rows; i >= 1; i--){
            for(int s = 1; s <= rows - i; s++){
                System.out.print("  ");
            }

            for(int j = 1; j <= 2 * i - 1; j++){
                if(j == 1 || j == 2 * i - 1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
