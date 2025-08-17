public class zigzag{
    public static void main(String[] args){
        int cols = 17;

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= cols; j++){
                if((i+j)%4 == 0 || (i == 2 && j % 2 == 0)){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}