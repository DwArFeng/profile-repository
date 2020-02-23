package com.dwarfeng.prorepo.stack.cache;

import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.cache.BaseCache;

/**
 * 用户档案缓存。
 *
 * @author DwArFeng
 * @since alpha-0.0.1
 */
public interface ProfileCache extends BaseCache<StringIdKey, Profile> {
}
