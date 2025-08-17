public class concentricNumberSquare {
    public static void main(String[] args){
        int n = 4;
        int size = 2 * n - 1;

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                int top = i, left = j, bottom = size - 1 - i, right = size - 1 - j;
                int layer = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - layer)+" ");
            }
            System.out.println();
        }
    }
}
