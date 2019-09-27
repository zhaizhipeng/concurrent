package base.create;

/**
 * @author zhipeng zhai
 * @date 2019/9/25 0025
 * 继承Thread
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println("继承Thread类方式，创建线程");
    }

}
