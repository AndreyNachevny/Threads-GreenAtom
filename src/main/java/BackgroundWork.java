public class BackgroundWork implements Runnable{

    private volatile long start = System.currentTimeMillis();
    private volatile long end = start + 10000;

    @Override
    public void run() {
        while(true){
            start = System.currentTimeMillis();
            if (start == end){
                System.out.println("Асинхронный привет!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Асинхронный пока!");
                start = System.currentTimeMillis();
                end = start + 10000;
            }
        }
    }
}
