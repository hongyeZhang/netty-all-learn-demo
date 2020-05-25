package com.zhq.chapter7;

import io.netty.channel.socket.nio.NioSocketChannel;
import org.junit.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledTest {

    @Test
    public void test1() throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        ScheduledFuture<?> future = executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("5 second later");
            }
        }, 5, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(8);
        executorService.shutdown();
    }


    @Test
    public void test2() throws InterruptedException {
        NioSocketChannel nioSocketChannel = new NioSocketChannel();
        ScheduledFuture<?> future = nioSocketChannel.eventLoop().schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("after 5 seconds");
            }
        }, 5 ,TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(8);










    }





}
