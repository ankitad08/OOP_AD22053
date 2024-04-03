public class PracticalNo9{
    private static int counter = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printNumbers());
        Thread thread2 = new Thread(() -> printNumbers());

        thread1.start();
        thread2.start();
    }

    private static synchronized void printNumbers() {
        for (int i = 0; i < 5; i++) {
            counter += 5;
            System.out.print(counter + " ");
        }
    }
}