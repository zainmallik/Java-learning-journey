class A extends Thread {
    public void run() {
        System.out.println("Thread A is running");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B is running");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {

        A obj = new A();
        B obj1 = new B();

        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.MIN_PRIORITY);

        System.out.println("A priority: " + obj.getPriority());
        System.out.println("B priority: " + obj1.getPriority());

        obj.start();
        obj1.start();
    }
}