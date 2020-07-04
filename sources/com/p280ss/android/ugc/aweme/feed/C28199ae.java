package com.p280ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.ae */
public final class C28199ae {

    /* renamed from: a */
    public Map<String, String> f74300a = new ConcurrentHashMap();

    /* renamed from: b */
    private Map<String, String> f74301b = new ConcurrentHashMap();

    /* renamed from: c */
    private C6600e f74302c = new C6600e();

    /* renamed from: com.ss.android.ugc.aweme.feed.ae$a */
    static class C28200a {

        /* renamed from: a */
        public static final C28199ae f74303a = new C28199ae();
    }

    /* renamed from: a */
    public static C28199ae m92689a() {
        return C28200a.f74303a;
    }

    /* renamed from: a */
    public final String mo71790a(LogPbBean logPbBean) {
        if (logPbBean == null) {
            return "";
        }
        return this.f74302c.mo15979b((Object) logPbBean);
    }

    /* renamed from: a */
    public final String mo71791a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.f74300a.containsKey(str)) {
            return (String) this.f74300a.get(str);
        }
        return "";
    }

    /* renamed from: b */
    public final String mo71793b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.f74301b.containsKey(str)) {
            return (String) this.f74301b.get(str);
        }
        return "";
    }

    /* renamed from: a */
    public final void mo71792a(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            this.f74300a.put(str, this.f74302c.mo15979b((Object) logPbBean));
        }
    }

    /* renamed from: b */
    public final void mo71794b(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            this.f74301b.put(str, this.f74302c.mo15979b((Object) logPbBean));
        }
    }
}
