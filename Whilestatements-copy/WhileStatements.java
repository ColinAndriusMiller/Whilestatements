public class WhileStatements
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " which is < 15");
            i++;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " which is > 5");
            k--;
        }
        int a = 3;
        int b = 8;
        while (a < 10) {
            while (b <= 20) {
                System.out.println("a is " + a + " which is < 10, " + "and b is " + b + " which is < or = 20");
                a++;
                b++;
            }
        }
    }
    
    public static void main(String[] args) 
    {
        WhileStatements hw = new WhileStatements();
        hw.run();
    }
}