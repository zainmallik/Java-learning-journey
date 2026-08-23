class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Hi");
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Hello");
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
            }
        }
    }
}

public class BasicThreads {
    public static void main(String[] args) {

        A obj = new A();
        B obj1 = new B();

        obj1.start();

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
        }

        obj.start();
    }
}