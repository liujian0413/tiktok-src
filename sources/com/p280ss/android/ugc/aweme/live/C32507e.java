package com.p280ss.android.ugc.aweme.live;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdk.feed.setting.C6123a;
import com.bytedance.android.livesdkapi.service.C9514b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.live.settings.C32545c;

/* renamed from: com.ss.android.ugc.aweme.live.e */
public final class C32507e {
    /* renamed from: a */
    public static Fragment m105297a() {
        return new FeedLiveFragment();
    }

    /* renamed from: c */
    public static C9514b m105302c() {
        return C5951b.m18637b();
    }

    /* renamed from: b */
    public static void m105301b() {
        if ("local_test".equals(C6399b.m19941q())) {
            C6123a.m19072a(true);
        }
    }

    /* renamed from: a */
    public static void m105299a(C9514b bVar) {
        C5951b.m18636a(bVar);
    }

    /* renamed from: a */
    public static void m105298a(Context context) {
        C5951b.m18634a(context);
        C5951b.m18635a(C32514f.f84776a);
    }

    /* renamed from: a */
    public static void m105300a(C32545c cVar) {
        if (cVar != null && cVar.status_code == 0) {
            C6123a.m19071a(AwemeApplication.m21341a(), cVar.f84858a);
        }
    }
}
