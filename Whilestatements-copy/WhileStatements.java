public class WhileStatements
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        do {
            System.out.println("i is " + i + " which is < 15");
            i++;
        } while (i < 15);
        int k = 10;
        do {
            System.out.println("k is " + k + " which is > 5");
            k--;
        } while (k > 5);
        int a = 3;
        int b = 8;
        do { 
            System.out.println("a is " + a + " which is < 10, " + "and b is " + b + " which is < or = 20");
            a++;
            b++;
        } while (a < 10 & b <= 20);
    }

    public static void main(String[] args) 
    {
        WhileStatements hw = new WhileStatements();
        hw.run();
    }
}