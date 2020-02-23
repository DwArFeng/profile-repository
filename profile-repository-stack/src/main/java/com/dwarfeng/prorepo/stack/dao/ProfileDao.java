package com.dwarfeng.prorepo.stack.dao;

import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.dao.BaseDao;
import com.dwarfeng.subgrade.stack.dao.PresetLookupDao;

/**
 * 用户数据访问层。
 *
 * @author DwArFeng
 * @since alpha-0.0.1
 */
public interface ProfileDao extends BaseDao<StringIdKey, Profile>, PresetLookupDao<Profile> {
}
