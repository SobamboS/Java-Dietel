package Chapter2;


public class SmallestAndLargest2 {
    public static void main(String[] args) {

        int A = 5;
        int B = 6;
        int C = 7;
        int D = -4;
        int E = 9;

        if ((A > B) & (A > C) & (A > D) & (A > E)) {
            System.out.println("A is the largest number");
        }

        if ((B > A) & (B > C) & (B > D) & (B > E)) {
            System.out.println("B is the largest number");
        }

        if ((C > A) & (C > B) & (C > D) & (C > E)) {
            System.out.println("C is the largest number");
        }

        if ((D > A) & (D > B) & (D > C) & (D > E)) {
            System.out.println("D is the largest number");
        }

        if ((E > A) & (E > B) & (E > C) & (E > D)) {
            System.out.println("E is the largest number");
        }

        if ((A < E) & (A < B) & (A < C) & (A < D)) {
            System.out.println("A is the smallest number");
        }
        if ((B < A) & (B < C) & (B < D) & (B < E)) {
            System.out.println("B is the smallest number");
        }
        if ((C < A) & (C < B) & (C < D) & (C < E)) {
            System.out.println("C is the smallest number");
        }
        if ((D < E) & (D < B) & (D < C) & (D < A)) {
            System.out.println("D is the smallest number");
        }
        if ((E < A) & (E < B) & (E < C) & (E < D)) {
            System.out.println("E is the smallest number");
        }
    }
}

