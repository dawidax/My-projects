public class Main {
    public static void main(String[] args) {

        int x0 = 0;
        int x1 = 1;
        int x2;
        int counter = 20;

        System.out.print(x0+"  "+x1+"  ");
        for (int i = 2; i < counter; i++) {

            x2 = x0+x1;
            System.out.print(x2 + "  ");
            x0 = x1;
            x1 = x2;
        }
    }
}
