package com.p280ss.android.ugc.aweme.photomovie;

import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseException;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photomovie.t */
final class C34936t implements C18245g<SynthetiseResult> {
    C34936t() {
    }

    /* renamed from: a */
    private static void m112584a(SynthetiseResult synthetiseResult) {
        C6893q.m21444a("aweme_photo_movie_synthesis_error_rate", 0, (JSONObject) null);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        m112584a((SynthetiseResult) obj);
    }

    public final void onFailure(Throwable th) {
        int i;
        if (th instanceof SynthetiseException) {
            i = ((SynthetiseException) th).getCode();
        } else {
            i = 1;
        }
        C6893q.m21444a("aweme_photo_movie_synthesis_error_rate", i, (JSONObject) null);
        C6893q.m21452b("aweme_movie_publish_log", "aweme_photo_movie_synthesis_error_rate", C6869c.m21381a().mo16887a("exception", C17462u.m58024b(th)).mo16888b());
    }
}
