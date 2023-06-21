package com.dwarfeng.prorepo.impl.configuration;

import com.dwarfeng.prorepo.sdk.bean.FastJsonMapper;
import com.dwarfeng.prorepo.sdk.bean.entity.FastJsonProfile;
import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.subgrade.impl.bean.MapStructBeanTransformer;
import com.dwarfeng.subgrade.impl.cache.RedisBaseCache;
import com.dwarfeng.subgrade.sdk.redis.formatter.StringIdStringKeyFormatter;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class CacheConfiguration {

    @Autowired
    private RedisTemplate<String, ?> template;

    @Value("${cache.prefix.entity.profile}")
    private String profilePrefix;

    @SuppressWarnings("unchecked")
    @Bean
    public RedisBaseCache<StringIdKey, Profile, FastJsonProfile> profileRedisBaseCache() {
        return new RedisBaseCache<>(
                (RedisTemplate<String, FastJsonProfile>) template,
                new StringIdStringKeyFormatter(profilePrefix),
                new MapStructBeanTransformer<>(Profile.class, FastJsonProfile.class, FastJsonMapper.class)
        );
    }
}
