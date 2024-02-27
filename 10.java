class TaskA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task A: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TaskB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task B: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TaskC extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task C: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        TaskA threadA = new TaskA();
        TaskB threadB = new TaskB();
        TaskC threadC = new TaskC();

        threadA.start();
        threadB.start();
        threadC.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads have finished their tasks.");
    }
}
