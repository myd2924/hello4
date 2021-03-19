package com.myd.hello4.beanfactorypostprocessor;

import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/19 10:53
 * @Description:
 */
@Service("calaService")
public class CalaServiceImpl implements CalaService {

    @Setter
    private String desc = "desc init by service";

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
