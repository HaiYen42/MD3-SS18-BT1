public class Main {

    public static void main(String[] args) {

        NumberGenerator numberGenerator1 = new NumberGenerator("1");
        NumberGenerator numberGenerator2= new NumberGenerator("2");
        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("hashCode1 "+thread1.hashCode());
        System.out.println("hashCode2 "+ thread2.hashCode());
        thread1.start();
        thread2.start();
    }
}