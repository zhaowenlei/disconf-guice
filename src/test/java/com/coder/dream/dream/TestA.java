package com.coder.dream.dream;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

/**
 * Created by konghang on 2016/11/28.
 */
@Singleton
public class TestA {

    @Inject
    private JedisConfig jedisConfig;

    public void say(){
        System.out.println(jedisConfig);
        System.out.println(StaticConfig.getStaticVar());
        System.out.printf("124");
    }
}
