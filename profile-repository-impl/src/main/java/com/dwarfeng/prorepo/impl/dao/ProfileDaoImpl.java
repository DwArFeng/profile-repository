package com.dwarfeng.prorepo.impl.dao;

import com.dwarfeng.prorepo.impl.bean.entity.HibernateProfile;
import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.prorepo.stack.dao.ProfileDao;
import com.dwarfeng.subgrade.impl.dao.HibernateBaseDao;
import com.dwarfeng.subgrade.impl.dao.HibernatePresetLookupDao;
import com.dwarfeng.subgrade.sdk.bean.key.HibernateStringIdKey;
import com.dwarfeng.subgrade.sdk.interceptor.analyse.BehaviorAnalyse;
import com.dwarfeng.subgrade.stack.bean.dto.PagingInfo;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.exception.DaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProfileDaoImpl implements ProfileDao {

    @Autowired
    private HibernateBaseDao<StringIdKey, HibernateStringIdKey, Profile, HibernateProfile> baseDao;
    @Autowired
    private HibernatePresetLookupDao<Profile, HibernateProfile> lookupDao;

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager")
    public StringIdKey insert(Profile element) throws DaoException {
        return baseDao.insert(element);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager")
    public void update(Profile element) throws DaoException {
        baseDao.update(element);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager")
    public void delete(StringIdKey key) throws DaoException {
        baseDao.delete(key);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager", readOnly = true)
    public boolean exists(StringIdKey key) throws DaoException {
        return baseDao.exists(key);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager", readOnly = true)
    public Profile get(StringIdKey key) throws DaoException {
        return baseDao.get(key);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager", readOnly = true)
    public List<Profile> lookup(String preset, Object[] objs) throws DaoException {
        return lookupDao.lookup(preset, objs);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager", readOnly = true)
    public List<Profile> lookup(String preset, Object[] objs, PagingInfo pagingInfo) throws DaoException {
        return lookupDao.lookup(preset, objs, pagingInfo);
    }

    @Override
    @BehaviorAnalyse
    @Transactional(transactionManager = "hibernateTransactionManager", readOnly = true)
    public int lookupCount(String preset, Object[] objs) throws DaoException {
        return lookupDao.lookupCount(preset, objs);
    }
}
