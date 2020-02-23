package com.dwarfeng.prorepo.impl.service;

import com.dwarfeng.prorepo.stack.bean.entity.Profile;
import com.dwarfeng.prorepo.stack.cache.ProfileCache;
import com.dwarfeng.prorepo.stack.dao.ProfileDao;
import com.dwarfeng.prorepo.stack.service.ProfileMaintainService;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/application-context*.xml")
public class ProfileMaintainServiceImplTest {

    @Autowired
    private ProfileMaintainService service;
    @Autowired
    private ProfileDao dao;
    @Autowired
    private ProfileCache cache;

    private Profile profile;

    @Before
    public void setUp() {
        profile = new Profile();
        profile.setKey(new StringIdKey("foo"));
        profile.setSn("张");
        profile.setGivenName("三");
        profile.setInitials("ZhangSan");
        profile.setDisplayName("张三");
        profile.setTelephoneNumber("18688889999");
        profile.setWwwHomepage("www.zhangsan.com");
        profile.setEmail("999888777@qq.com");
        profile.setCountry("CN");
        profile.setProvince("山东");
        profile.setCity("济南");
        profile.setStreet("G104");
        profile.setConsigneeAddress("XX省XX市XX区某小区某号楼某单元XXX");
        profile.setFaxNumber("XXXXXXXX");
        profile.setIdentityCardNumber("370000190001010011");
        profile.setIdentityCardType((byte) 10);
        profile.setBirthYear(1900);
        profile.setBirthMonth(1);
        profile.setBirthDay(1);
        profile.setGender((byte) 1);
        profile.setBankAccount("6667866222224943333");
        profile.setBloodType((byte) 2);
        profile.setEbg((byte) 10);
        profile.setStrongPoint("唱,跳,RAP");
        profile.setHobby("篮球");
        profile.setMotd("练习时长两年半的个人练习生");
        profile.setProfession("计算机工程师");
        profile.setJobTitle("高级工程师");
        profile.setMaritalStatus((byte) 2);
        profile.setStateOfHealth("健康");
        profile.setRank((byte) 22);
        profile.setRemark("测试用，写着玩的，并非真实的人");
    }

    @After
    public void tearDown() {
        profile = null;
    }

    @Test
    public void test() throws Exception {
        try {
            StringIdKey stringIdKey = service.insertOrUpdate(profile);
            assertEquals(stringIdKey.getStringId(), "foo");
            Profile daoProfile = dao.get(stringIdKey);
            Profile cacheProfile = cache.get(stringIdKey);
            assertEquals(BeanUtils.describe(daoProfile), BeanUtils.describe(profile));
            assertEquals(BeanUtils.describe(cacheProfile), BeanUtils.describe(profile));
        } finally {
            service.deleteIfExists(new StringIdKey("foo"));
        }
    }
}