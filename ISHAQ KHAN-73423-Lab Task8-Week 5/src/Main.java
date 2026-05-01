public class Main {
    // ISHAQKHAN-73423
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {// ISHAQKHAN-73423
            for (int j = 1; j <= i; j++) {// ISHAQKHAN-73423
                System.out.print("*");
            }
            System.out.println();// ISHAQKHAN-73423
        }
        // ISHAQKHAN-73423
    }
}

