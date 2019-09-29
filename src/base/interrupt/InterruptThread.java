package base.interrupt;

/**
 * @author zhipeng zhai
 * @date 2019/9/29 0029
 * 线程中断机制
 */
public class InterruptThread implements Runnable{

    @Override
    public void run() {
        while (true){

            try {
                /**
                 * 线程等待状态中，执行中断，会抛出 InterruptedException 异常，中断标识会被复位。
                 */
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("线程中断状态：" + Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }

            if (Thread.currentThread().isInterrupted()){
                System.out.println("中断线程");
                break;
            }
        }

    }

    public static void main(String args[]) throws InterruptedException {
        InterruptThread interruptThread = new InterruptThread();
        Thread thread = new Thread(interruptThread);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }

}
