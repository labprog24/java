public class POLY {
    static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

    static int findValue(int n, int r, int a) {
        int k = (a - 1) / fact(n);
        int answer = k;
        for(int i = 0; i < r - 1; i++)
            answer = answer * (n + r - i);
        answer = answer + 1;
        return answer;
    }

    public static void main(String args[]) {
        int N = 1;
        int A = 2;
        int R = 3;
        System.out.print(findValue(N, R, A));
}
}
