package com.p280ss.android.ugc.aweme.shortvideo;

import com.facebook.common.internal.C13315l;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.am */
public final class C38452am implements C18245g<C38455ap> {
    /* renamed from: a */
    private static void m122934a(C38455ap apVar) {
        C6893q.m21444a("aweme_movie_publish_error_rate", 0, (JSONObject) null);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        m122934a((C38455ap) obj);
    }

    public final void onFailure(Throwable th) {
        C6893q.m21444a("aweme_movie_publish_error_rate", C38574ce.m123267a(13, th), C6869c.m21381a().mo16887a("exception", C13315l.m38963c(th)).mo16888b());
    }
}
