package com.myd.hello4.newexception.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/18 17:08
 * @Description: 加载所有返回消息
 */
public class PropertitesUtils {

    private static final Logger logger = LoggerFactory.getLogger(PropertitesUtils.class);

    private static Properties properties;

    private static final String RESOURCES = "classpath*:message.properties";

    static{
        prop();
    }

    private synchronized static void prop() {
        logger.info("开始加载属性文件。。。。");
        properties = new Properties();
        InputStream in = null;
        try{
             /*第一种，通过类加载器进行获取properties文件流*/
            //in = PropertitesUtils.class.getClassLoader().getResourceAsStream("message.properties");
            /*第二种，通过类进行获取properties文件流*/
             in = PropertitesUtils.class.getResourceAsStream("/message.properties");
            properties.load(in);
        } catch (FileNotFoundException file){
            logger.error("");
        } catch (IOException io){
            logger.error("");
        } finally {
            if(null != in){
                try {
                    in.close();
                } catch (IOException e) {
                    logger.error("message.properties文件流关闭出现异常");
                }
            }
        }

        logger.info("开始加载属性文件结束。。。。");
        logger.info("properties文件内容：" + properties);
    }

    public static String getProperties(String key){
        if(null == properties){
            prop();
        }
        return properties.getProperty(key);
    }

    public static String getProperties(String key,String defaultValue){
        if(null == properties){
            prop();
        }
        return properties.getProperty(key,defaultValue);
    }

    public static void main(String[] args) {
        System.out.println(PropertitesUtils.getProperties("200"));
    }


}
