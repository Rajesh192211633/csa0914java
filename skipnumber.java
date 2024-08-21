package huuu;

public class skipnumber {
	public static void main(String[] args) {
        int M = 50;
        int N = 100;
        int K = 7;

        printNumbers(M, N, K);
    }

    public static void printNumbers(int M, int N, int K) {
        if (K <= 0) {
            System.out.println("K must be greater than 0");
            return;
        }

        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


