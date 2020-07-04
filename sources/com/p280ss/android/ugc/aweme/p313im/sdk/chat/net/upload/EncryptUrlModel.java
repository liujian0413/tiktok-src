package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31929y;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31929y.C31931a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.upload.EncryptUrlModel */
public class EncryptUrlModel extends UrlModel {
    @C6593c(mo15949a = "md5")
    String md5;
    @C6593c(mo15949a = "oid")
    String oid;
    @C6593c(mo15949a = "skey")
    String skey;

    public String getMd5() {
        return this.md5;
    }

    public String getOid() {
        return this.oid;
    }

    public String getSkey() {
        return this.skey;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setOid(String str) {
        this.oid = str;
    }

    public void setSkey(String str) {
        this.skey = str;
    }

    public static UrlModel convert(EncryptUrlModel encryptUrlModel) {
        if (encryptUrlModel == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        C31931a a = C31929y.m103691a(encryptUrlModel.oid, encryptUrlModel.skey);
        urlModel.setUrlList(a.mo82748a());
        urlModel.setUri(a.mo82749b());
        return urlModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptUrlModel)) {
            return false;
        }
        EncryptUrlModel encryptUrlModel = (EncryptUrlModel) obj;
        if (!TextUtils.equals(this.oid, encryptUrlModel.oid) || !TextUtils.equals(this.skey, encryptUrlModel.skey) || !TextUtils.equals(this.md5, encryptUrlModel.md5)) {
            return false;
        }
        return true;
    }
}
