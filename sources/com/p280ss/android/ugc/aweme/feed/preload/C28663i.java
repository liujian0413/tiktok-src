package com.p280ss.android.ugc.aweme.feed.preload;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.base.p1062f.C23337e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.i */
public final class C28663i {

    /* renamed from: a */
    private C23339g f75516a = C23337e.m76561a(C6399b.m19921a(), "LogpbPreference");

    /* renamed from: b */
    private C6600e f75517b = new C6600e();

    /* renamed from: com.ss.android.ugc.aweme.feed.preload.i$a */
    static class C28665a {

        /* renamed from: a */
        public static final C28663i f75519a = new C28663i();
    }

    /* renamed from: a */
    public static C28663i m94306a() {
        return C28665a.f75519a;
    }

    /* renamed from: c */
    private Map<String, String> m94307c() {
        try {
            return (Map) new C6600e().mo15975a(this.f75516a.mo60623a("foryou_feed_cached_logpb", ""), new C6597a<HashMap<String, String>>() {
            }.type);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo73726b() {
        Map c = m94307c();
        if (c != null) {
            for (Entry entry : c.entrySet()) {
                if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                    C28199ae.m92689a().f74300a.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo73725a(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            String b = this.f75517b.mo15979b((Object) logPbBean);
            HashMap hashMap = new HashMap();
            hashMap.put(str, b);
            this.f75516a.mo60632b("foryou_feed_cached_logpb", this.f75517b.mo15979b((Object) hashMap));
        }
    }
}
