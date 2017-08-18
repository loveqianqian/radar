package cn.myloveqian.dpush.entity;

import java.nio.channels.Channel;

/**
 * Created by zhiwei
 * created date 17-8-18 下午11:01
 * github:https://github.com/loveqianqian
 */
public class MessageEntity {

    private long timeStamp = 0L;
    private String username;
    private String nick;
    private Channel channel;
    private String address;
    private boolean isAuth = false;

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAuth() {
        return isAuth;
    }

    public void setAuth(boolean auth) {
        isAuth = auth;
    }
}
