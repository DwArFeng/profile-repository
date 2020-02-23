package com.dwarfeng.prorepo.impl.configuration;

import com.dwarfeng.prorepo.impl.bean.entity.HibernateProfile;
import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.subgrade.impl.bean.DozerBeanTransformer;
import com.dwarfeng.subgrade.sdk.bean.key.HibernateStringIdKey;
import com.dwarfeng.subgrade.stack.bean.BeanTransformer;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTransformerConfiguration {

    @Autowired
    private Mapper mapper;

    @Bean
    public BeanTransformer<StringIdKey, HibernateStringIdKey> stringIdKeyBeanTransformer() {
        return new DozerBeanTransformer<>(
                StringIdKey.class,
                HibernateStringIdKey.class,
                mapper
        );
    }

    @Bean
    public BeanTransformer<Profile, HibernateProfile> profileBeanTransformer() {
        return new DozerBeanTransformer<>(
                Profile.class,
                HibernateProfile.class,
                mapper
        );
    }
}
