package com.dwarfeng.prorepo.node.configuration;

import com.dwarfeng.prorepo.sdk.bean.entity.FastJsonProfile;
import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.subgrade.impl.bean.DozerBeanTransformer;
import com.dwarfeng.subgrade.impl.cache.RedisBaseCache;
import com.dwarfeng.subgrade.sdk.redis.formatter.StringIdStringKeyFormatter;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class CacheConfiguration {

    @Autowired
    private RedisTemplate<String, ?> template;
    @Autowired
    private Mapper mapper;
    @Autowired
    private BeanTransformerConfiguration beanTransformerConfiguration;

    @Value("${cache.prefix.entity.profile}")
    private String profilePrefix;

    @Bean
    public RedisBaseCache<StringIdKey, Profile, FastJsonProfile> profileRedisBaseCache() {
        //noinspection unchecked
        return new RedisBaseCache<>(
                (RedisTemplate<String, FastJsonProfile>) template,
                new StringIdStringKeyFormatter(profilePrefix),
                new DozerBeanTransformer<>(Profile.class, FastJsonProfile.class, mapper)
        );
    }
}
