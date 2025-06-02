
public class countingstairswithoutorderclass {

    static int nthStair(int n) {
        int s = n / 2;
        return s + 1;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(nthStair(n));
    }
}

