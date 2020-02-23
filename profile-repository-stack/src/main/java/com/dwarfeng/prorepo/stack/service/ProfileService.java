package com.dwarfeng.prorepo.stack.service;

import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.service.CrudService;

/**
 * 用户档案服务。
 *
 * @author DwArFeng
 * @since alpha-0.0.1
 */
public interface ProfileService extends CrudService<StringIdKey, Profile> {
}
