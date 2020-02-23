package com.dwarfeng.prorepo.sdk.util;

/**
 * Profile对象的长度约束。
 * <p>定义了Profile对象的所有文本属性在数据库中的最大长度。</p>
 *
 * @author DwArFeng
 * @since alpha-0.0.1
 */
public class ProfileConstraints {

    public static final int MOTD_LENGTH = 100;
    public static final int KEY_LENGTH = 100;
    public static final int SN_LENGTH = 20;
    public static final int GIVEN_NAME_LENGTH = 20;
    public static final int INITIALS_LENGTH = 40;
    public static final int DISPLAY_NAME_LENGTH = 40;
    public static final int TELEPHONE_NUMBER_LENGTH = 35;
    public static final int WWW_HOMEPAGE_LENGTH = 100;
    public static final int EMAIL_LENGTH = 40;
    public static final int COUNTRY_LENGTH = 3;
    public static final int PROVINCE_LENGTH = 20;
    public static final int CITY_LENGTH = 30;
    public static final int STREET_LENGTH = 30;
    public static final int CONSIGNEE_ADDRESS_LENGTH = 100;
    public static final int FAX_NUMBER_LENGTH = 100;
    public static final int BANK_ACCOUNT_LENGTH = 22;
    public static final int IDENTITY_CARD_NUMBER_LENGTH = 22;
    public static final int STRONG_POINT_LENGTH = 50;
    public static final int HOBBY_LENGTH = 50;
    public static final int PROFESSION_LENGTH = 10;
    public static final int JOB_TITLE_LENGTH = 10;
    public static final int STATE_OF_HEALTH_LENGTH = 20;
    public static final int REMARK_LENGTH = 20;

    private ProfileConstraints() {
        throw new IllegalStateException("禁止外部实例化");
    }
}
