package concurrency;

/**
 * Created by yifeiyuan on 16/8/29.
 */
public class Join {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("t sleep done");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
//        t.setDaemon(true);
        t.start();

        try {
            // 等500毫秒 没结束就返回
            t.join(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main done");


    }
}
