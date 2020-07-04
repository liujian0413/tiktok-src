package com.p280ss.android.ugc.aweme.shortvideo;

import com.facebook.common.internal.C13315l;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.property.C36964i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ao */
public final class C38454ao implements C18245g<C38455ap> {
    public final /* synthetic */ void onSuccess(Object obj) {
        m122936a((C38455ap) obj);
    }

    public final void onFailure(Throwable th) {
        C6893q.m21444a("aweme_movie_publish_error_rate_sdk", C38574ce.m123267a(13, th), C6869c.m21381a().mo16887a("exception", C13315l.m38963c(th)).mo16888b());
    }

    /* renamed from: a */
    private static void m122936a(C38455ap apVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(C36964i.m118920a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C36964i.m118926b());
        C6893q.m21444a("aweme_movie_publish_error_rate_sdk", 0, new C6909j().mo16966a("enableHardRecord", sb.toString()).mo16966a("enableHardSynthetic", sb2.toString()).mo16967a());
    }
}
