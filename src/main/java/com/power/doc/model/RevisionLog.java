package com.power.doc.model;

/**
 * 接口文档修订日志
 *
 * @author yolanda0608 2018/12/15
 */
public class RevisionLog {

    /**
     * version
     */
    private String version;

    /**
     * status
     */
    private String status;

    /**
     * author
     */
    private String author;

    /**
     * update time
     */
    private String revisionTime;

    /**
     * description
     */
    private String remarks;

    public static RevisionLog getLog() {
        return new RevisionLog();
    }

    public String getVersion() {
        return version;
    }

    public RevisionLog setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public RevisionLog setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public RevisionLog setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getRevisionTime() {
        return revisionTime;
    }

    public RevisionLog setRevisionTime(String revisionTime) {
        this.revisionTime = revisionTime;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public RevisionLog setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
}
