package org.easyarch.easynotify.core;

import org.easyarch.easynotify.redis.RedisKits;

/**
 * Created by xingtianyu on 17-4-20
 * 下午1:25
 * description:
 */

public class TaskTest {

    public static void main(String[] args) {
//        RedisKits.publisher().publish("chatroom.me","hi!");
//        RedisKits.strings().set("code","200");
        RedisKits.strings().setEx("notify",5,"ding ding!!");
    }
}
