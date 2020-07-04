package com.p280ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.p1385g.C33023i;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.services.n */
public final class C23046n implements C33023i {
    /* renamed from: a */
    public final Intent mo60019a() {
        Intent mainActivityIntent = MainActivity.getMainActivityIntent(C6399b.m19921a());
        C7573i.m23582a((Object) mainActivityIntent, "MainActivity.getMainActi….getApplicationContext())");
        return mainActivityIntent;
    }

    /* renamed from: b */
    public final Activity mo60020b() {
        C7573i.m23582a((Object) AwemeApplication.m21341a(), "AwemeApplication.getApplication()");
        return AwemeApplication.m21343b();
    }

    /* renamed from: c */
    public final boolean mo60021c() {
        C7573i.m23582a((Object) AwemeApplication.m21341a(), "AwemeApplication.getApplication()");
        return AwemeApplication.m21343b() instanceof MainActivity;
    }
}
