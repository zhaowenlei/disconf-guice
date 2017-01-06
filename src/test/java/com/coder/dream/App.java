package com.coder.dream;

import com.coder.dream.disconf.client.DisconfMgrBean;
import com.coder.dream.disconf.client.DisconfModule;
import com.coder.dream.dream.JedisConfig;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Properties properties = new Properties();
        properties.put("disconf.scan.package","com.coder.dream.dream");
        Injector injector = Guice.createInjector(new DisconfModule(properties));
        DisconfMgrBean disconfMgrBean = injector.getInstance(DisconfMgrBean.class);
        disconfMgrBean.start();
        JedisConfig instance = injector.getInstance(JedisConfig.class);
        System.out.println(instance);
        disconfMgrBean.stop();
    }
}
