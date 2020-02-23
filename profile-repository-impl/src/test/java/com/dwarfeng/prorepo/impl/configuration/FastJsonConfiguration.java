package com.dwarfeng.prorepo.impl.configuration;

import com.alibaba.fastjson.parser.ParserConfig;
import com.dwarfeng.prorepo.sdk.bean.entity.FastJsonProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FastJsonConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(FastJsonConfiguration.class);

    public FastJsonConfiguration() {
        LOGGER.info("正在配置 FastJson autotype 白名单");
        ParserConfig.getGlobalInstance().addAccept(FastJsonProfile.class.getCanonicalName());
        LOGGER.debug("FastJson autotype 白名单配置完毕");
    }
}
