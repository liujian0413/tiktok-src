package com.p280ss.android.ugc.aweme.share.command;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.share.command.Schema */
public class Schema implements Serializable {
    @C6593c(mo15949a = "command")
    String command;
    @C6593c(mo15949a = "share_user_did")
    private long did;
    @C6593c(mo15949a = "share_user_iid")
    private long iid;
    @C6593c(mo15949a = "log_pb")
    LogPbBean logPbBean;
    @C6593c(mo15949a = "sec_uid")
    private String mSecUid;
    @C6593c(mo15949a = "relation_from")
    private String relationFrom = "";
    @C6593c(mo15949a = "rid")
    private String rid = "";
    @C6593c(mo15949a = "schema")
    private String schema = "";
    @C6593c(mo15949a = "schema_type")
    private int schemaType;
    @C6593c(mo15949a = "schema_detail")
    private SchemaDetail schemeDetail;
    @C6593c(mo15949a = "share_sdk")
    private String shareSdk = "";
    @C6593c(mo15949a = "share_user_id")
    private String shareUserId = "";
    @C6593c(mo15949a = "share_user_name")
    private String shareUserName = "";
    @C6593c(mo15949a = "status_code")
    private int statusCode;
    @C6593c(mo15949a = "status_msg")
    private String statusMsg;

    public long getDid() {
        return this.did;
    }

    public long getIid() {
        return this.iid;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public String getRelationFrom() {
        return this.relationFrom;
    }

    public String getRid() {
        return this.rid;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getSchemaType() {
        return this.schemaType;
    }

    public SchemaDetail getSchemeDetail() {
        return this.schemeDetail;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public String getShareSdk() {
        return this.shareSdk;
    }

    public String getShareUserId() {
        return this.shareUserId;
    }

    public String getShareUserName() {
        return this.shareUserName;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public String getLogPbImprId() {
        if (this.logPbBean != null) {
            return this.logPbBean.getImprId();
        }
        return "";
    }

    public void setDid(long j) {
        this.did = j;
    }

    public void setIid(long j) {
        this.iid = j;
    }

    public void setRelationFrom(String str) {
        this.relationFrom = str;
    }

    public void setRid(String str) {
        this.rid = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSchemaType(int i) {
        this.schemaType = i;
    }

    public void setSchemeDetail(SchemaDetail schemaDetail) {
        this.schemeDetail = schemaDetail;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setShareSdk(String str) {
        this.shareSdk = str;
    }

    public void setShareUserId(String str) {
        this.shareUserId = str;
    }

    public void setShareUserName(String str) {
        this.shareUserName = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
