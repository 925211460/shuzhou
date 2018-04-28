package com.shuzhou.test.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * Created by lufei on 18/4/24.
 */
public class ZookeeperConnector implements Watcher{

    private static ZooKeeper zookeeper;
    public static void main(String[] args) throws IOException, InterruptedException {
        zookeeper = new ZooKeeper("47.100.47.12:2181",5000,new ZookeeperConnector());
        System.out.println(zookeeper.getState());
        Thread.sleep(Integer.MAX_VALUE);
    }

    private void doSomething(){

        System.out.println("do something");
    }
    @Override
    public void process(WatchedEvent event) {

        System.out.println("收到事件："+event);
        if (event.getState()== Event.KeeperState.SyncConnected){

            if (event.getType()== Event.EventType.None && null==event.getPath()){
                doSomething();
            }
        }
    }
}
