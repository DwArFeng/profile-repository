package com.dwarfeng.prorepo.stack.bean.entity;

import com.dwarfeng.subgrade.stack.bean.entity.Entity;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;

/**
 * 用户档案。
 *
 * @author DwArFeng
 * @since alpha-0.0.1
 */
public class Profile implements Entity<StringIdKey> {

    private static final long serialVersionUID = 1202269147083080132L;

    /**
     * 主键。
     */
    private StringIdKey key;

    /**
     * 姓。
     */
    private String sn;

    /**
     * 名。
     */
    private String givenName;

    /**
     * 英文缩写。
     */
    private String initials;

    /**
     * 显示名称。
     */
    private String displayName;

    /**
     * 手机号。
     */
    private String telephoneNumber;

    /**
     * 个人主页。
     */
    private String wwwHomepage;

    /**
     * 电子邮箱号。
     */
    private String email;

    /**
     * 国家。
     */
    private String country;

    /**
     * 省。
     */
    private String province;

    /**
     * 市。
     */
    private String city;

    /**
     * 街道。
     */
    private String street;

    /**
     * 收件地址。
     */
    private String consigneeAddress;

    /**
     * 传真号码。
     */
    private String faxNumber;

    /**
     * 身份证件号码。
     */
    private String identityCardNumber;

    /**
     * 身份证件类型。
     */
    private Byte identityCardType;

    /**
     * 出生年份。
     */
    private Integer birthYear;

    /**
     * 出生月份。
     */
    private Integer birthMonth;

    /**
     * 出生日份。
     */
    private Integer birthDay;

    /**
     * 性别。
     */
    private Byte gender;

    /**
     * 银行账户。
     */
    private String bankAccount;

    /**
     * 血型。
     */
    private Byte bloodType;

    /**
     * 教育背景。
     */
    private Byte ebg;

    /**
     * 特长。
     */
    private String strongPoint;

    /**
     * 爱好。
     */
    private String hobby;

    /**
     * 每日提示（格言/个性签名）。
     */
    private String motd;

    /**
     * 职业。
     */
    private String profession;

    /**
     * 职称。
     */
    private String jobTitle;

    /**
     * 婚姻状况。
     */
    private Byte maritalStatus;

    /**
     * 健康状况。
     */
    private String stateOfHealth;

    /**
     * 等级。
     */
    private Byte rank;

    /**
     * 备注。
     */
    private String remark;

    public Profile() {
    }

    public Profile(
            StringIdKey key, String sn, String givenName, String initials, String displayName, String telephoneNumber,
            String wwwHomepage, String email, String country, String province, String city, String street,
            String consigneeAddress, String faxNumber, String identityCardNumber, Byte identityCardType, Integer birthYear,
            Integer birthMonth, Integer birthDay, Byte gender, String bankAccount, Byte bloodType, Byte ebg, String strongPoint,
            String hobby, String motd, String profession, String jobTitle, Byte maritalStatus, String stateOfHealth,
            Byte rank, String remark) {
        this.key = key;
        this.sn = sn;
        this.givenName = givenName;
        this.initials = initials;
        this.displayName = displayName;
        this.telephoneNumber = telephoneNumber;
        this.wwwHomepage = wwwHomepage;
        this.email = email;
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.consigneeAddress = consigneeAddress;
        this.faxNumber = faxNumber;
        this.identityCardNumber = identityCardNumber;
        this.identityCardType = identityCardType;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.gender = gender;
        this.bankAccount = bankAccount;
        this.bloodType = bloodType;
        this.ebg = ebg;
        this.strongPoint = strongPoint;
        this.hobby = hobby;
        this.motd = motd;
        this.profession = profession;
        this.jobTitle = jobTitle;
        this.maritalStatus = maritalStatus;
        this.stateOfHealth = stateOfHealth;
        this.rank = rank;
        this.remark = remark;
    }

    @Override
    public StringIdKey getKey() {
        return key;
    }

    @Override
    public void setKey(StringIdKey key) {
        this.key = key;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getWwwHomepage() {
        return wwwHomepage;
    }

    public void setWwwHomepage(String wwwHomepage) {
        this.wwwHomepage = wwwHomepage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public Byte getIdentityCardType() {
        return identityCardType;
    }

    public void setIdentityCardType(Byte identityCardType) {
        this.identityCardType = identityCardType;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Byte getBloodType() {
        return bloodType;
    }

    public void setBloodType(Byte bloodType) {
        this.bloodType = bloodType;
    }

    public Byte getEbg() {
        return ebg;
    }

    public void setEbg(Byte ebg) {
        this.ebg = ebg;
    }

    public String getStrongPoint() {
        return strongPoint;
    }

    public void setStrongPoint(String strongPoint) {
        this.strongPoint = strongPoint;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Byte getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Byte maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getStateOfHealth() {
        return stateOfHealth;
    }

    public void setStateOfHealth(String stateOfHealth) {
        this.stateOfHealth = stateOfHealth;
    }

    public Byte getRank() {
        return rank;
    }

    public void setRank(Byte rank) {
        this.rank = rank;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "key=" + key +
                ", sn='" + sn + '\'' +
                ", givenName='" + givenName + '\'' +
                ", initials='" + initials + '\'' +
                ", displayName='" + displayName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", wwwHomepage='" + wwwHomepage + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", consigneeAddress='" + consigneeAddress + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", identityCardNumber='" + identityCardNumber + '\'' +
                ", identityCardType=" + identityCardType +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthDay=" + birthDay +
                ", gender=" + gender +
                ", bankAccount='" + bankAccount + '\'' +
                ", bloodType=" + bloodType +
                ", ebg=" + ebg +
                ", strongPoint='" + strongPoint + '\'' +
                ", hobby='" + hobby + '\'' +
                ", motd='" + motd + '\'' +
                ", profession='" + profession + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", stateOfHealth='" + stateOfHealth + '\'' +
                ", rank=" + rank +
                ", remark='" + remark + '\'' +
                '}';
    }
}
