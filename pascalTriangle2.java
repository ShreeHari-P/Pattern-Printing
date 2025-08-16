public class pascalTriangle2 {
    public static void main(String[] args){
        int rows = 5;

        for(int i = 0; i < rows; i++){
            int val = 1;
            for(int s = 1; s <= rows - i; s++){
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++){
                if(j == 0){
                    val = 1;
                } else{
                    val = val * (i - j + 1)/j;
                }
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
