/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.daos;


import com.htl.domain.tables.SysAttachment;
import com.htl.domain.tables.records.SysAttachmentRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;

import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;

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
public class SysAttachmentDao extends DAOImpl<SysAttachmentRecord, com.htl.domain.tables.pojos.SysAttachment, String> implements VertxDAO<com.htl.domain.tables.records.SysAttachmentRecord, com.htl.domain.tables.pojos.SysAttachment, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new SysAttachmentDao without any configuration
     */
    public SysAttachmentDao() {
        super(SysAttachment.SYS_ATTACHMENT, com.htl.domain.tables.pojos.SysAttachment.class);
    }

    /**
     * Create a new SysAttachmentDao with an attached configuration
     */
    public SysAttachmentDao(Configuration configuration) {
        super(SysAttachment.SYS_ATTACHMENT, com.htl.domain.tables.pojos.SysAttachment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.htl.domain.tables.pojos.SysAttachment object) {
        return object.getPkId();
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByPkId(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.PK_ID, values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code>
     */
    public com.htl.domain.tables.pojos.SysAttachment fetchOneByPkId(String value) {
        return fetchOne(SysAttachment.SYS_ATTACHMENT.PK_ID, value);
    }

    /**
     * Fetch records that have <code>B_CONTENT IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByBContent(byte[]... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.B_CONTENT, values);
    }

    /**
     * Fetch records that have <code>S_NAME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchBySName(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.S_NAME, values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchBySCode(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.S_CODE, values);
    }

    /**
     * Fetch records that have <code>S_TYPE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchBySType(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.S_TYPE, values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByJConfig(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.J_CONFIG, values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByIsActive(Boolean... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByZSigma(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.Z_SIGMA, values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByZLanguage(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.Z_LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByZCreateBy(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.Z_CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByZCreateTime(LocalDateTime... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.Z_CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByZUpdateBy(String... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.Z_UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysAttachment> fetchByZUpdateTime(LocalDateTime... values) {
        return fetch(SysAttachment.SYS_ATTACHMENT.Z_UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByPkIdAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.PK_ID, values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code> asynchronously
     */
    public CompletableFuture<com.htl.domain.tables.pojos.SysAttachment> fetchOneByPkIdAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByPkId(value)), vertx());
    }

    /**
     * Fetch records that have <code>B_CONTENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByBContentAsync(List<byte[]> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.B_CONTENT, values);
    }

    /**
     * Fetch records that have <code>S_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchBySNameAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.S_NAME, values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchBySCodeAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.S_CODE, values);
    }

    /**
     * Fetch records that have <code>S_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchBySTypeAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.S_TYPE, values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByJConfigAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.J_CONFIG, values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByIsActiveAsync(List<Boolean> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByZSigmaAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.Z_SIGMA, values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByZLanguageAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.Z_LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByZCreateByAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.Z_CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByZCreateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.Z_CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByZUpdateByAsync(List<String> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.Z_UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysAttachment>> fetchByZUpdateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(SysAttachment.SYS_ATTACHMENT.Z_UPDATE_TIME, values);
    }

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
