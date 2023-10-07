

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new BackgroundWork());
        thread.setDaemon(true);
        thread.start();
        long start = System.currentTimeMillis();
        long end = start + 1000;
        while(true){
            start = System.currentTimeMillis();
            if(end == start){
                end = start + 1000;
                System.out.println("Работает основная программа");
            }
        }
    }


}
