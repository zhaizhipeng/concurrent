package base.create;

/**
 * @author zhipeng zhai
 * @date 2019/9/27 0027
 * 实现Runnable接口方式
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("实现Runnable接口方式，创建线程。");
    }

    public static void main(String[] args){
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
