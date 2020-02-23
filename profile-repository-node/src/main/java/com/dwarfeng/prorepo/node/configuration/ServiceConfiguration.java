package com.dwarfeng.prorepo.node.configuration;

import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.prorepo.stack.cache.ProfileCache;
import com.dwarfeng.prorepo.stack.dao.ProfileDao;
import com.dwarfeng.subgrade.impl.bean.key.ExceptionKeyFetcher;
import com.dwarfeng.subgrade.impl.service.DaoOnlyPresetLookupService;
import com.dwarfeng.subgrade.impl.service.GeneralCrudService;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.log.LogLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Autowired
    private ProfileCache profileCache;
    @Autowired
    private ProfileDao profileDao;
    @Autowired
    private ServiceExceptionMapperConfiguration serviceExceptionMapperConfiguration;
    @Value("${cache.timeout.entity.profile}")
    private long profileTimeout;

    @Bean
    public GeneralCrudService<StringIdKey, Profile> profileGeneralCrudService() {
        return new GeneralCrudService<>(
                profileDao,
                profileCache,
                new ExceptionKeyFetcher<>(),
                serviceExceptionMapperConfiguration.mapServiceExceptionMapper(),
                LogLevel.WARN,
                profileTimeout
        );
    }

    @Bean
    public DaoOnlyPresetLookupService<Profile> profileDaoOnlyPresetLookupService() {
        return new DaoOnlyPresetLookupService<>(
                profileDao,
                serviceExceptionMapperConfiguration.mapServiceExceptionMapper(),
                LogLevel.WARN
        );
    }
}
