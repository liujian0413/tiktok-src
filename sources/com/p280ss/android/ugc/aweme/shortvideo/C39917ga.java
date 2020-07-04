package com.p280ss.android.ugc.aweme.shortvideo;

import com.facebook.common.internal.C13315l;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.base.C6893q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ga */
public final class C39917ga implements C18245g<SynthetiseResult> {
    public final /* synthetic */ void onSuccess(Object obj) {
        m127691a((SynthetiseResult) obj);
    }

    /* renamed from: a */
    private static void m127691a(SynthetiseResult synthetiseResult) {
        C6893q.m21444a("aweme_synthesis_error_rate_vesdk", 0, C38510bb.m123096a(synthetiseResult).mo96482b());
    }

    /* renamed from: a */
    private static void m127692a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fileInfo", str);
        } catch (JSONException unused) {
        }
        C6893q.m21452b("aweme_movie_publish_log", "synthesis_error", jSONObject);
    }

    public final void onFailure(Throwable th) {
        int i;
        SynthetiseResult synthetiseResult;
        if (th instanceof SynthetiseException) {
            SynthetiseException synthetiseException = (SynthetiseException) th;
            i = synthetiseException.getCode();
            synthetiseResult = synthetiseException.getResult();
            m127692a(synthetiseResult.toString());
        } else {
            i = 10038;
            synthetiseResult = null;
        }
        C6893q.m21444a("aweme_synthesis_error_rate_vesdk", i, C38510bb.m123096a(synthetiseResult).mo96481a("exception", C13315l.m38963c(th)).mo96482b());
    }
}
