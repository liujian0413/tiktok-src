package com.p280ss.android.ugc.aweme.base.share;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo */
public class RocketFansGroupInfo implements Serializable {
    @C6593c(mo15949a = "download_url")
    public String downloadUrl;
    @C6593c(mo15949a = "schema")
    public String schema;
    @C6593c(mo15949a = "token")
    public String token;

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
