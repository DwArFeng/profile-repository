package com.dwarfeng.prorepo.impl.bean.entity;

import com.dwarfeng.prorepo.sdk.util.ProfileConstraints;
import com.dwarfeng.subgrade.sdk.bean.key.HibernateStringIdKey;
import com.dwarfeng.subgrade.stack.bean.Bean;

import javax.persistence.*;
import java.util.Optional;

@Entity
@IdClass(HibernateStringIdKey.class)
@Table(name = "tbl_profile")
public class HibernateProfile implements Bean {

    private static final long serialVersionUID = -2332608358648034263L;

    // -----------------------------------------------------------主键-----------------------------------------------------------
    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(" + ProfileConstraints.KEY_LENGTH + ")", nullable = false, unique = true)
    private String stringId;

    // -----------------------------------------------------------主属性字段-----------------------------------------------------------
    @Column(name = "sn", columnDefinition = "VARCHAR(" + ProfileConstraints.SN_LENGTH + ")")
    private String sn;

    @Column(name = "given_name", columnDefinition = "VARCHAR(" + ProfileConstraints.GIVEN_NAME_LENGTH + ")")
    private String givenName;

    @Column(name = "initials", columnDefinition = "VARCHAR(" + ProfileConstraints.INITIALS_LENGTH + ")")
    private String initials;

    @Column(name = "display_name", columnDefinition = "VARCHAR(" + ProfileConstraints.DISPLAY_NAME_LENGTH + ")")
    private String displayName;

    @Column(name = "telephone_number", columnDefinition = "VARCHAR(" + ProfileConstraints.TELEPHONE_NUMBER_LENGTH + ")")
    private String telephoneNumber;

    @Column(name = "www_homepage", columnDefinition = "VARCHAR(" + ProfileConstraints.WWW_HOMEPAGE_LENGTH + ")")
    private String wwwHomepage;

    @Column(name = "email", columnDefinition = "VARCHAR(" + ProfileConstraints.EMAIL_LENGTH + ")")
    private String email;

    @Column(name = "country", columnDefinition = "VARCHAR(" + ProfileConstraints.COUNTRY_LENGTH + ")")
    private String country;

    @Column(name = "province", columnDefinition = "VARCHAR(" + ProfileConstraints.PROVINCE_LENGTH + ")")
    private String province;

    @Column(name = "city", columnDefinition = "VARCHAR(" + ProfileConstraints.CITY_LENGTH + ")")
    private String city;

    @Column(name = "street", columnDefinition = "VARCHAR(" + ProfileConstraints.STREET_LENGTH + ")")
    private String street;

    @Column(name = "consignee_address", columnDefinition = "VARCHAR(" + ProfileConstraints.CONSIGNEE_ADDRESS_LENGTH + ")")
    private String consigneeAddress;

    @Column(name = "fax_number", columnDefinition = "VARCHAR(" + ProfileConstraints.FAX_NUMBER_LENGTH + ")")
    private String faxNumber;

    @Column(name = "identity_card_number", columnDefinition = "VARCHAR(" + ProfileConstraints.IDENTITY_CARD_NUMBER_LENGTH + ")")
    private String identityCardNumber;

    @Column(name = "identity_card_type")
    private Byte identityCardType;

    @Column(name = "birth_year")
    private Integer birthYear;

    @Column(name = "birth_month")
    private Integer birthMonth;

    @Column(name = "birth_day")
    private Integer birthDay;

    @Column(name = "gender")
    private Byte gender;

    @Column(name = "bank_account", columnDefinition = "VARCHAR(" + ProfileConstraints.BANK_ACCOUNT_LENGTH + ")")
    private String bankAccount;

    @Column(name = "blood_type")
    private Byte bloodType;

    @Column(name = "ebg")
    private Byte ebg;

    @Column(name = "strong_point", columnDefinition = "VARCHAR(" + ProfileConstraints.STRONG_POINT_LENGTH + ")")
    private String strongPoint;

    @Column(name = "hobby", columnDefinition = "VARCHAR(" + ProfileConstraints.HOBBY_LENGTH + ")")
    private String hobby;

    @Column(name = "motd", columnDefinition = "VARCHAR(" + ProfileConstraints.MOTD_LENGTH + ")")
    private String motd;

    @Column(name = "profession", columnDefinition = "VARCHAR(" + ProfileConstraints.PROFESSION_LENGTH + ")")
    private String profession;

    @Column(name = "job_title", columnDefinition = "VARCHAR(" + ProfileConstraints.JOB_TITLE_LENGTH + ")")
    private String jobTitle;

    @Column(name = "marital_status")
    private Byte maritalStatus;

    @Column(name = "state_of_health", columnDefinition = "VARCHAR(" + ProfileConstraints.STATE_OF_HEALTH_LENGTH + ")")
    private String stateOfHealth;

    @Column(name = "column_rank")
    private Byte rank;

    @Column(name = "remark", columnDefinition = "VARCHAR(" + ProfileConstraints.REMARK_LENGTH + ")")
    private String remark;

    public HibernateProfile() {
    }

    public HibernateStringIdKey getKey() {
        return new HibernateStringIdKey(this.stringId);
    }

    public void setKey(HibernateStringIdKey key) {
        this.stringId = Optional.ofNullable(key).map(HibernateStringIdKey::getStringId).orElse(null);
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId;
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
        return getClass().getSimpleName() + "(" +
                "stringId = " + stringId + ", " +
                "sn = " + sn + ", " +
                "givenName = " + givenName + ", " +
                "initials = " + initials + ", " +
                "displayName = " + displayName + ", " +
                "telephoneNumber = " + telephoneNumber + ", " +
                "wwwHomepage = " + wwwHomepage + ", " +
                "email = " + email + ", " +
                "country = " + country + ", " +
                "province = " + province + ", " +
                "city = " + city + ", " +
                "street = " + street + ", " +
                "consigneeAddress = " + consigneeAddress + ", " +
                "faxNumber = " + faxNumber + ", " +
                "identityCardNumber = " + identityCardNumber + ", " +
                "identityCardType = " + identityCardType + ", " +
                "birthYear = " + birthYear + ", " +
                "birthMonth = " + birthMonth + ", " +
                "birthDay = " + birthDay + ", " +
                "gender = " + gender + ", " +
                "bankAccount = " + bankAccount + ", " +
                "bloodType = " + bloodType + ", " +
                "ebg = " + ebg + ", " +
                "strongPoint = " + strongPoint + ", " +
                "hobby = " + hobby + ", " +
                "motd = " + motd + ", " +
                "profession = " + profession + ", " +
                "jobTitle = " + jobTitle + ", " +
                "maritalStatus = " + maritalStatus + ", " +
                "stateOfHealth = " + stateOfHealth + ", " +
                "rank = " + rank + ", " +
                "remark = " + remark + ")";
    }
}
