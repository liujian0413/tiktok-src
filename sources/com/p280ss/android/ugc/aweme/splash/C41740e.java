package com.p280ss.android.ugc.aweme.splash;

import android.app.Activity;
import android.support.p022v4.app.C0578a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C21758j.C21760a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.splash.e */
public final class C41740e implements C21760a {

    /* renamed from: a */
    public static final C41740e f108634a = new C41740e();

    /* renamed from: b */
    private static final String f108635b = f108635b;

    private C41740e() {
    }

    /* renamed from: b */
    public final void mo58102b(Activity activity) {
        C7573i.m23587b(activity, f108635b);
    }

    /* renamed from: a */
    public final void mo58101a(Activity activity) {
        C7573i.m23587b(activity, f108635b);
        if (!C6399b.m19944t()) {
            C6907h.m21524a("sys_status", (Map) C22984d.m75611a().mo59970a("voiceover", C0578a.m2439a(C6399b.m19921a()) ? 1 : 0).mo59973a(f108635b, activity.getClass().getSimpleName()).f60753a);
        }
    }
}
