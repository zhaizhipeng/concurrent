package base.create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author zhipeng zhai
 * @date 2019/9/27 0027
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Callable/Future 接口方式，创建线程");
        return "success";
    }

    public static void main(String[] args){
        Callable callable = new MyCallable();
        FutureTask oneTask = new FutureTask(callable);
        Thread thread = new Thread(oneTask);
        thread.start();
    }

}
