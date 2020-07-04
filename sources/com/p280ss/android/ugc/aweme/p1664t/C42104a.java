package com.p280ss.android.ugc.aweme.p1664t;

import com.bytedance.ies.geckoclient.p572f.C10884a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34334h;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34337j;
import com.p280ss.android.websocket.p344ws.p1781a.C45446d;
import com.p280ss.android.websocket.p344ws.p1781a.C45447e;
import java.util.HashMap;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.t.a */
public final class C42104a implements C10884a {
    /* renamed from: a */
    public final boolean mo26260a() {
        return C34334h.m111033d().f89486b;
    }

    /* renamed from: b */
    public final int mo26262b() {
        if (C34337j.f89496g.mo87193a().f89497a) {
            return 1239108;
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo26261a(String str) {
        return ((Boolean) SharePrefCache.inst().getUseNewPackageNow().mo59877d()).booleanValue();
    }

    /* renamed from: a */
    public final void mo26259a(String str, int i) {
        if (C34334h.m111033d().f89486b) {
            String e = C34334h.m111033d().mo87179e();
            C45447e eVar = new C45447e(e, 1012, 0, 0, i, str.getBytes(), "", "", new HashMap());
            C7705c.m23799a().mo20394d(new C45446d(e, eVar));
        }
    }
}
