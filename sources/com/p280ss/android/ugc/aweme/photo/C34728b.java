package com.p280ss.android.ugc.aweme.photo;

import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.C38574ce;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.b */
public final class C34728b implements C18245g<C38455ap> {
    /* renamed from: a */
    private static void m112061a(C38455ap apVar) {
        C6893q.m21444a("aweme_photo_publish_error_rate", 0, (JSONObject) null);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        m112061a((C38455ap) obj);
    }

    public final void onFailure(Throwable th) {
        String b = C17462u.m58024b(th);
        int a = C38574ce.m123267a(13, th);
        C6893q.m21452b("aweme_photo_publish_log", "publish_error", C6869c.m21381a().mo16887a("exception", b).mo16888b());
        C6893q.m21444a("aweme_photo_publish_error_rate", a, C6869c.m21381a().mo16887a("exception", b).mo16888b());
    }
}
