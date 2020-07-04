package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EncryptedVideoContent */
public final class EncryptedVideoContent implements Serializable {
    @C6593c(mo15949a = "skey")
    private String secretKey;
    @C6593c(mo15949a = "md5")
    private String sourceMD5;
    @C6593c(mo15949a = "tkey")
    private String tosKey;

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSourceMD5() {
        return this.sourceMD5;
    }

    public final String getTosKey() {
        return this.tosKey;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setSourceMD5(String str) {
        this.sourceMD5 = str;
    }

    public final void setTosKey(String str) {
        this.tosKey = str;
    }
}
