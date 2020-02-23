package com.dwarfeng.prorepo.impl.cache;

import com.dwarfeng.prorepo.sdk.bean.entity.FastJsonProfile;
import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.prorepo.stack.cache.ProfileCache;
import com.dwarfeng.subgrade.impl.cache.RedisBaseCache;
import com.dwarfeng.subgrade.sdk.interceptor.analyse.BehaviorAnalyse;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.exception.CacheException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProfileCacheImpl implements ProfileCache {

    @Autowired
    private RedisBaseCache<StringIdKey, Profile, FastJsonProfile> baseCache;

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager", readOnly = true)
    public boolean exists(StringIdKey key) throws CacheException {
        return baseCache.exists(key);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager", readOnly = true)
    public Profile get(StringIdKey key) throws CacheException {
        return baseCache.get(key);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager")
    public void push(Profile value, long timeout) throws CacheException {
        baseCache.push(value, timeout);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager")
    public void delete(StringIdKey key) throws CacheException {
        baseCache.delete(key);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager")
    public void clear() throws CacheException {
        baseCache.clear();
    }
}
