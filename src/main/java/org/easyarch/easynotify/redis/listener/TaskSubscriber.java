package org.easyarch.easynotify.redis.listener;

import org.easyarch.easynotify.redis.RedisKits;
import redis.clients.jedis.JedisPubSub;

/**
 * Created by xingtianyu on 17-4-20
 * 下午10:57
 * description:
 */

public class TaskSubscriber extends JedisPubSub {

    @Override
    public void onMessage(String channel, String message) {
        System.out.println("onMessage[ channel:"+channel+",message:"+message);
        RedisKits.strings().setEx("notify",5,"ding ding!!");
    }

    @Override
    public void onPMessage(String pattern, String channel, String message) {
        System.out.println("onPMessage[ pattern:"+pattern+",channel:"+channel+",message:"+message);
    }

    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        System.out.println("onSubscribe[ channel:"+channel+",subscribedChannels:"+subscribedChannels);
    }

    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        System.out.println("onPSubscribe[ pattern:"+pattern+",subscribedChannels:"+subscribedChannels);
    }
}
