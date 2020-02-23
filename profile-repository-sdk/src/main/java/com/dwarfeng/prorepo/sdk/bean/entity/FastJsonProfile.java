package com.dwarfeng.prorepo.sdk.bean.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.dwarfeng.subgrade.stack.bean.Bean;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;

/**
 * FastJson用户档案。
 *
 * @author DwArFeng
 * @since alpha-0.0.1
 */
public class FastJsonProfile implements Bean {

    private static final long serialVersionUID = -1012777186493254644L;
    
    @JSONField(name = "key", ordinal = 1)
    private StringIdKey key;

    @JSONField(name = "sn", ordinal = 2)
    private String sn;

    @JSONField(name = "given_name", ordinal = 3)
    private String givenName;

    @JSONField(name = "initials", ordinal = 4)
    private String initials;

    @JSONField(name = "display_name", ordinal = 5)
    private String displayName;

    @JSONField(name = "telephone_number", ordinal = 6)
    private String telephoneNumber;

    @JSONField(name = "www_homepage", ordinal = 6)
    private String wwwHomepage;

    @JSONField(name = "email", ordinal = 7)
    private String email;

    @JSONField(name = "country", ordinal = 8)
    private String country;

    @JSONField(name = "province", ordinal = 9)
    private String province;

    @JSONField(name = "city", ordinal = 10)
    private String city;

    @JSONField(name = "street", ordinal = 11)
    private String street;

    @JSONField(name = "consignee_address", ordinal = 12)
    private String consigneeAddress;

    @JSONField(name = "fax_number", ordinal = 13)
    private String faxNumber;

    @JSONField(name = "identity_card_number", ordinal = 14)
    private String identityCardNumber;

    @JSONField(name = "identity_card_number", ordinal = 15)
    private byte identityCardType;

    @JSONField(name = "birth_year", ordinal = 16)
    private int birthYear;

    @JSONField(name = "birth_month", ordinal = 17)
    private int birthMonth;

    @JSONField(name = "birth_day", ordinal = 18)
    private int birthDay;

    @JSONField(name = "gender", ordinal = 19)
    private byte gender;

    @JSONField(name = "bank_account", ordinal = 20)
    private String bankAccount;

    @JSONField(name = "blood_type", ordinal = 21)
    private byte bloodType;

    @JSONField(name = "ebg", ordinal = 22)
    private byte ebg;

    @JSONField(name = "strong_point", ordinal = 23)
    private String strongPoint;

    @JSONField(name = "hobby", ordinal = 24)
    private String hobby;

    @JSONField(name = "motd", ordinal = 25)
    private String motd;

    @JSONField(name = "profession", ordinal = 26)
    private String profession;

    @JSONField(name = "job_title", ordinal = 27)
    private String jobTitle;

    @JSONField(name = "marital_status", ordinal = 28)
    private String maritalStatus;

    @JSONField(name = "state_of_health", ordinal = 29)
    private String stateOfHealth;

    @JSONField(name = "rank", ordinal = 30)
    private byte rank;

    @JSONField(name = "remark", ordinal = 31)
    private String remark;

    public FastJsonProfile() {
    }

    public FastJsonProfile(
            StringIdKey key, String sn, String givenName, String initials, String displayName, String telephoneNumber,
            String wwwHomepage, String email, String country, String province, String city, String street,
            String consigneeAddress, String faxNumber, String identityCardNumber, byte identityCardType, int birthYear,
            int birthMonth, int birthDay, byte gender, String bankAccount, byte bloodType, byte ebg, String strongPoint,
            String hobby, String motd, String profession, String jobTitle, String maritalStatus, String stateOfHealth,
            byte rank, String remark) {
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

    public StringIdKey getKey() {
        return key;
    }

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

    public byte getIdentityCardType() {
        return identityCardType;
    }

    public void setIdentityCardType(byte identityCardType) {
        this.identityCardType = identityCardType;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public byte getBloodType() {
        return bloodType;
    }

    public void setBloodType(byte bloodType) {
        this.bloodType = bloodType;
    }

    public byte getEbg() {
        return ebg;
    }

    public void setEbg(byte ebg) {
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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getStateOfHealth() {
        return stateOfHealth;
    }

    public void setStateOfHealth(String stateOfHealth) {
        this.stateOfHealth = stateOfHealth;
    }

    public byte getRank() {
        return rank;
    }

    public void setRank(byte rank) {
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
        return "FastJsonProfile{" +
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
