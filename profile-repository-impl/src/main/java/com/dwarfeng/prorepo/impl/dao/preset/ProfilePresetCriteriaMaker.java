package com.dwarfeng.prorepo.impl.dao.preset;

import com.dwarfeng.subgrade.sdk.hibernate.criteria.PresetCriteriaMaker;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Component;

@Component
public class ProfilePresetCriteriaMaker implements PresetCriteriaMaker {

    @Override
    public void makeCriteria(DetachedCriteria criteria, String preset, Object[] objs) {
//        if (AccountMaintainService.ID_LIKE.equals(preset)) {
//            idLike(criteria, objs);
//        } else {
//            throw new IllegalArgumentException("无法识别的预设: " + preset);
//        }
    }
}
