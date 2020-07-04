package com.p280ss.android.ugc.aweme.dmt_integration;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.effect.C27430i;
import com.p280ss.android.ugc.aweme.effect.p1200d.C27424c;
import com.p280ss.android.ugc.aweme.port.internal.C35609b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.b */
public final class C27301b implements C35609b {
    /* renamed from: b */
    public final String mo70114b() {
        String h = C35563c.m114841h();
        C7573i.m23582a((Object) h, "AVEnv.getEffectSDKVersion()");
        return h;
    }

    /* renamed from: a */
    public final String mo70113a() {
        String g = C35563c.m114840g();
        C7573i.m23582a((Object) g, "AVEnv.getEffectPlatformAccessKey()");
        return g;
    }

    /* renamed from: a */
    public final C27424c mo70112a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        return new C27430i(fragmentActivity);
    }
}
