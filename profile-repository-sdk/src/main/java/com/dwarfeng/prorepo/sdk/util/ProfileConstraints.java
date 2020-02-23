package com.dwarfeng.prorepo.sdk.util;

/**
 * Profile对象的长度约束。
 * <p>定义了Profile对象的所有文本属性在数据库中的最大长度。</p>
 *
 * @author DwArFeng
 * @since alpha-0.0.1
 */
public class ProfileConstraints {

    public static final String MOTD_LENGTH = "100";
    public static final String KEY_LENGTH = "100";
    public static final String SN_LENGTH = "20";
    public static final String GIVEN_NAME_LENGTH = "20";
    public static final String INITIALS_LENGTH = "40";
    public static final String DISPLAY_NAME_LENGTH = "40";
    public static final String TELEPHONE_NUMBER_LENGTH = "35";
    public static final String WWW_HOMEPAGE_LENGTH = "100";
    public static final String EMAIL_LENGTH = "40";
    public static final String COUNTRY_LENGTH = "3";
    public static final String PROVINCE_LENGTH = "20";
    public static final String CITY_LENGTH = "30";
    public static final String STREET_LENGTH = "30";
    public static final String CONSIGNEE_ADDRESS_LENGTH = "100";
    public static final String FAX_NUMBER_LENGTH = "100";
    public static final String BANK_ACCOUNT_LENGTH = "22";
    public static final String IDENTITY_CARD_NUMBER_LENGTH = "22";
    public static final String STRONG_POINT_LENGTH = "50";
    public static final String HOBBY_LENGTH = "50";
    public static final String PROFESSION_LENGTH = "10";
    public static final String JOB_TITLE_LENGTH = "10";
    public static final String STATE_OF_HEALTH_LENGTH = "20";
    public static final String REMARK_LENGTH = "20";

    private ProfileConstraints() {
        throw new IllegalStateException("禁止外部实例化");
    }
}
