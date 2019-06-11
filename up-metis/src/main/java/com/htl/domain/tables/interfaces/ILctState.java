/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.interfaces;


import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface ILctState extends Serializable {

    /**
     * Getter for <code>DB_HTL.LCT_STATE.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.PK_ID</code>. uniqueId,PK_ID
     */
    public ILctState setPkId(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.S_NAME</code>. 全名,name,S_NAME
     */
    public String getSName();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.S_NAME</code>. 全名,name,S_NAME
     */
    public ILctState setSName(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.S_CODE</code>. code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.S_CODE</code>. code,S_CODE
     */
    public ILctState setSCode(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.S_ALIAS</code>. 别名、缩写,alias,S_ALIAS
     */
    public String getSAlias();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.S_ALIAS</code>. 别名、缩写,alias,S_ALIAS
     */
    public ILctState setSAlias(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.J_CONFIG</code>. config,J_CONFIG
     */
    public ILctState setJConfig(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.I_ORDER</code>. order,I_ORDER
     */
    public Integer getIOrder();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.I_ORDER</code>. order,I_ORDER
     */
    public ILctState setIOrder(Integer value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.R_COUNTRY_ID</code>. countryId,R_COUNTRY_ID
     */
    public String getRCountryId();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.R_COUNTRY_ID</code>. countryId,R_COUNTRY_ID
     */
    public ILctState setRCountryId(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public ILctState setIsActive(Boolean value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public ILctState setZSigma(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public ILctState setZLanguage(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public ILctState setZCreateBy(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public ILctState setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public ILctState setZUpdateBy(String value);

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public ILctState setZUpdateTime(LocalDateTime value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ILctState
     */
    public void from(com.htl.domain.tables.interfaces.ILctState from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ILctState
     */
    public <E extends com.htl.domain.tables.interfaces.ILctState> E into(E into);

    default ILctState fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getString("PK_ID"));
        setSName(json.getString("S_NAME"));
        setSCode(json.getString("S_CODE"));
        setSAlias(json.getString("S_ALIAS"));
        setJConfig(json.getString("J_CONFIG"));
        setIOrder(json.getInteger("I_ORDER"));
        setRCountryId(json.getString("R_COUNTRY_ID"));
        setIsActive(json.getBoolean("IS_ACTIVE"));
        setZSigma(json.getString("Z_SIGMA"));
        setZLanguage(json.getString("Z_LANGUAGE"));
        setZCreateBy(json.getString("Z_CREATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        setZUpdateBy(json.getString("Z_UPDATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PK_ID", getPkId());
        json.put("S_NAME", getSName());
        json.put("S_CODE", getSCode());
        json.put("S_ALIAS", getSAlias());
        json.put("J_CONFIG", getJConfig());
        json.put("I_ORDER", getIOrder());
        json.put("R_COUNTRY_ID", getRCountryId());
        json.put("IS_ACTIVE", getIsActive());
        json.put("Z_SIGMA", getZSigma());
        json.put("Z_LANGUAGE", getZLanguage());
        json.put("Z_CREATE_BY", getZCreateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        json.put("Z_UPDATE_BY", getZUpdateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return json;
    }

}