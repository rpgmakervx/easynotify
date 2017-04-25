package org.easyarch.easynotify.core;

import org.easyarch.easynotify.redis.RedisKits;
import org.easyarch.easynotify.redis.listener.TaskSubscriber;

/**
 * Created by xingtianyu on 17-4-21
 * 上午12:57
 * description:
 */

public class PubSubTest {

    public static void main(String[] args) {
        RedisKits.subscriber().subscribe(new TaskSubscriber(),"__keyevent@0__:expired");
    }
}
