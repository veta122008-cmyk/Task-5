public class Main {
    public static void main(String[] args) {
        printFigure( 8);
    }
    static void printFigure(int s) {
        for (int i = 0; i < s; i++) {
            int width = s - i;
            if (width < 1) width = 1;
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == s - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("$");
                }
            }
            System.out.println();
        }
    }
}
