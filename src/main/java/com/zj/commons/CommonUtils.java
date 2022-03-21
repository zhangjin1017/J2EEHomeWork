package com.zj.commons;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

public class CommonUtils {
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }
    public static <T> T toBean(Map map, Class<T> clazz) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        T bean=clazz.newInstance();
        BeanUtils.populate(bean,map);
        return bean;
    }
}
