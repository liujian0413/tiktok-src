package com.bytedance.android.live.base.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.g */
public final class C2347g {
    @C6593c(mo15949a = "uri")

    /* renamed from: a */
    public String f7710a;
    @C6593c(mo15949a = "url_list")

    /* renamed from: b */
    public List<String> f7711b;

    /* renamed from: a */
    public final ImageModel mo8251a() {
        return new ImageModel(this.f7710a, this.f7711b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlStruct{uri='");
        sb.append(this.f7710a);
        sb.append('\'');
        sb.append(", urlList=");
        sb.append(this.f7711b);
        sb.append('}');
        return sb.toString();
    }
}
