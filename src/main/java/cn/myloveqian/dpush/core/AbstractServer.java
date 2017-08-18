package cn.myloveqian.dpush.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhiwei
 * created date 17-8-18 下午11:06
 * Github:https://github.com/loveqianqian
 */
public abstract class AbstractServer implements NettyServer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean isStart() {
        return false;
    }

    @Override
    public boolean isShutDown() {
        return false;
    }
}
