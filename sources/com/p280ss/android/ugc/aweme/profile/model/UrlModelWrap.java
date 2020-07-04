package com.p280ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UrlModelWrap */
public class UrlModelWrap implements Serializable {
    private int position;
    private UrlModel urlModel;

    public int getPosition() {
        return this.position;
    }

    public UrlModel getUrlModel() {
        return this.urlModel;
    }

    public String toJsonString() {
        return new C6600e().mo15979b((Object) this);
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setUrlModel(UrlModel urlModel2) {
        this.urlModel = urlModel2;
    }

    public static UrlModelWrap fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (UrlModelWrap) new C6600e().mo15974a(str, UrlModelWrap.class);
    }

    public UrlModelWrap(int i, UrlModel urlModel2) {
        this.position = i;
        this.urlModel = urlModel2;
    }
}
