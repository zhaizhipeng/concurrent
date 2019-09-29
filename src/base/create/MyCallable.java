package base.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author zhipeng zhai
 * @date 2019/9/27 0027
 * 实现Callable方式
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Callable/Future 接口方式，创建线程。");
        Thread.sleep(3000);
        return "success";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }

}
