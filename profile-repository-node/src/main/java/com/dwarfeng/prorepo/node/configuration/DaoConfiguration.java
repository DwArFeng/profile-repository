package com.dwarfeng.prorepo.node.configuration;

import com.dwarfeng.prorepo.impl.bean.entity.HibernateProfile;
import com.dwarfeng.prorepo.impl.dao.preset.ProfilePresetCriteriaMaker;
import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.subgrade.impl.dao.HibernateBaseDao;
import com.dwarfeng.subgrade.impl.dao.HibernatePresetLookupDao;
import com.dwarfeng.subgrade.sdk.bean.key.HibernateStringIdKey;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;

@Configuration
public class DaoConfiguration {

    @Autowired
    private HibernateTemplate template;
    @Autowired
    private BeanTransformerConfiguration beanTransformerConfiguration;
    @Autowired
    private ProfilePresetCriteriaMaker profilePresetCriteriaMaker;

    @Bean
    public HibernateBaseDao<StringIdKey, HibernateStringIdKey, Profile, HibernateProfile> profileHibernateBaseDao() {
        return new HibernateBaseDao<>(
                template,
                beanTransformerConfiguration.stringIdKeyBeanTransformer(),
                beanTransformerConfiguration.profileBeanTransformer(),
                HibernateProfile.class
        );
    }

    @Bean
    public HibernatePresetLookupDao<Profile, HibernateProfile> profileHibernatePresetLookupDao() {
        return new HibernatePresetLookupDao<>(
                template,
                beanTransformerConfiguration.profileBeanTransformer(),
                HibernateProfile.class,
                profilePresetCriteriaMaker
        );
    }
}
