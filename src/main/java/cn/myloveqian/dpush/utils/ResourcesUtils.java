package cn.myloveqian.dpush.utils;

import cn.myloveqian.dpush.entity.ResourcesEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by zhiwei on 17-8-18.
 */
public class ResourcesUtils {

    private static Logger logger = LoggerFactory.getLogger(ResourcesUtils.class);

    private static List<ResourcesEntity> getResources(String fileName) {
        List<ResourcesEntity> entities=new ArrayList<>();
        InputStream resourcesInput = ResourcesUtils.class.getClassLoader().getResourceAsStream(fileName);
        Properties properties = new Properties();
        try {
            properties.load(resourcesInput);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e.getCause());
        }
        Set<Map.Entry<Object, Object>> keys = properties.entrySet();
        for (Map.Entry<Object, Object> key : keys) {
            ResourcesEntity entity = new ResourcesEntity();
            String entityKey = String.valueOf(key.getKey());
            String entityValue = String.valueOf(key.getValue());
            entity.setKey(entityKey);
            entity.setValue(entityValue);
            entities.add(entity);
        }
        return entities;
    }

    public static void main(String[] args) {
        List<ResourcesEntity> resources = getResources("dpush.properties");
        resources.forEach(entity-> System.out.println(entity.getKey()+":"+entity.getValue()));
    }

}
