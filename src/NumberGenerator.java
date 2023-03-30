public class NumberGenerator implements Runnable {
    private String number;

    public NumberGenerator(String number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Priority of thread "+ number+" is "+Thread.currentThread().getPriority());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Number of Thread "+ number + " is "+ i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
