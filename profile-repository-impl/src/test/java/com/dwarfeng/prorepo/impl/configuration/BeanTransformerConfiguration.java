package com.dwarfeng.prorepo.impl.configuration;

import com.dwarfeng.prorepo.impl.bean.HibernateMapper;
import com.dwarfeng.prorepo.impl.bean.entity.HibernateProfile;
import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.subgrade.impl.bean.MapStructBeanTransformer;
import com.dwarfeng.subgrade.sdk.bean.key.HibernateStringIdKey;
import com.dwarfeng.subgrade.stack.bean.BeanTransformer;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTransformerConfiguration {

    @Bean
    public BeanTransformer<StringIdKey, HibernateStringIdKey> stringIdKeyBeanTransformer() {
        return new MapStructBeanTransformer<>(
                StringIdKey.class,
                HibernateStringIdKey.class,
                HibernateMapper.class
        );
    }

    @Bean
    public BeanTransformer<Profile, HibernateProfile> profileBeanTransformer() {
        return new MapStructBeanTransformer<>(
                Profile.class,
                HibernateProfile.class,
                HibernateMapper.class
        );
    }
}
