package com.p280ss.android.ugc.aweme.freeflowcard;

import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.utils.C23484l;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29977f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.b */
public class C29971b {

    /* renamed from: c */
    private static final String f78771c = "b";

    /* renamed from: f */
    private static C29971b f78772f;

    /* renamed from: a */
    public int f78773a = -1;

    /* renamed from: b */
    public boolean f78774b = true;

    /* renamed from: d */
    private String f78775d = "";

    /* renamed from: e */
    private String f78776e = "https://aweme.snssdk.com/falcon/douyin_falcon/douyinCard/enter/?hide_nav_bar=1";

    /* renamed from: g */
    private boolean f78777g;

    /* renamed from: d */
    public final void mo76166d() {
        this.f78777g = false;
    }

    /* renamed from: b */
    public static void m98270b() {
        C29977f.m98290a().mo76173c();
    }

    private C29971b() {
    }

    /* renamed from: a */
    public static C29971b m98269a() {
        if (f78772f == null) {
            synchronized (C29971b.class) {
                if (f78772f == null) {
                    f78772f = new C29971b();
                }
            }
        }
        return f78772f;
    }

    /* renamed from: c */
    public final String mo76165c() {
        StringBuilder sb = new StringBuilder();
        sb.append(C23484l.m77111a(AwemeApplication.m21341a()));
        String sb2 = sb.toString();
        this.f78776e = (String) SharePrefCache.inst().getDouyinCardScheme().mo59877d();
        return C33786f.m108941a(this.f78776e).mo86195a("oid", sb2).mo86194a().toString();
    }
}
