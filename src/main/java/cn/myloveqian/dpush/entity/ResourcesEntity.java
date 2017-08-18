package cn.myloveqian.dpush.entity;

/**
 * Created by zhiwei
 * created date 17-8-18 下午11:07
 * Github:https://github.com/loveqianqian
 */
public class ResourcesEntity {

    private String key;
    private String value;

    public ResourcesEntity() {
    }

    public ResourcesEntity(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
