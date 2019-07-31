package com.boot.learning3.bean;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name="COUNTRY_V",schema="SDM")
@XmlRootElement(name="CountryV")
@Setter
@Getter
public class CountryV implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name="CONFIG_STATUS_CD")
    private String configStatusCd;

    @Column(name="CONFIG_STATUS_TS")
    private Timestamp configStatusTs;

    @Column(name="COUNTRY_NM")
    private String countryNm;

    @Column(name="CREATE_TS")
    private Timestamp createTs;

    @Column(name="CREATE_USERID")
    private String createId;
    
    @Id
    @XmlID
    @Column(name="CTRY_ISO_CD")
    private String ctryIsoCd;

    @Column(name="LOCKED_BY_USER_ID")
    private String lockedByUserId;

    @Column(name="ROW_STATUS_CD")
    private String rowStatusCd;

    @Column(name="UPDATE_TS")
    private Timestamp updateTs;

    @Column(name="UPDATE_USERID")
    private String updateId;
    
    @Transient
    public int positionId;    
}
