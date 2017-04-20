package org.easyarch.easynotify.core;

import org.easyarch.easynotify.redis.RedisKits;

/**
 * Created by xingtianyu on 17-4-20
 * 下午1:25
 * description:
 */

public class TaskTest {

    public static void main(String[] args) {
        RedisKits.strings().set("username","xingtianyu");
        System.out.println(RedisKits.strings().get("username"));
    }
}
