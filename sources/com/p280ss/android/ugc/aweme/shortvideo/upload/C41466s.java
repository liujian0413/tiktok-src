package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.facebook.common.internal.C13315l;
import com.google.common.base.C17454q;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseException;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.s */
public final class C41466s implements C18245g<SynthetiseResult> {

    /* renamed from: a */
    private File f107862a;

    /* renamed from: b */
    private long f107863b;

    /* renamed from: c */
    private C17454q f107864c = C17454q.m58004b();

    /* renamed from: d */
    private boolean f107865d;

    /* renamed from: a */
    private static void m132142a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fileInfo", str);
        } catch (JSONException unused) {
        }
        C6893q.m21452b("aweme_movie_publish_log", "synthesis_error", jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(SynthetiseResult synthetiseResult) {
        long a = this.f107864c.mo44941a(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder("PublishDurationMonitor Synthetise end success durationMs:");
        sb.append(a);
        C41530am.m132280a(sb.toString());
        C38510bb a2 = C38510bb.m123095a();
        if (this.f107862a.exists()) {
            a2.mo96478a("speed", Float.valueOf(((float) this.f107863b) / ((float) a))).mo96480a("duration", Long.valueOf(a));
        }
        if (synthetiseResult != null) {
            a2.mo96477a("is_fast_import", Boolean.valueOf(synthetiseResult.isFastImport)).mo96481a("support_max_resolution", synthetiseResult.fastImportResolution).mo96477a("is_new_framework", Boolean.valueOf(synthetiseResult.isNewFramework)).mo96477a("has_subtitle", Boolean.valueOf(synthetiseResult.hasSubtitle));
        }
        JSONObject b = a2.mo96482b();
        if (this.f107865d) {
            C6893q.m21444a("aweme_mv_edit_error_rate", 0, b);
        }
        C6893q.m21444a("aweme_synthesis_error_rate_parallel", 0, b);
    }

    public final void onFailure(Throwable th) {
        int i;
        SynthetiseResult synthetiseResult;
        C41530am.m132280a("PublishDurationMonitor Synthetise end failed");
        if (th instanceof SynthetiseException) {
            SynthetiseException synthetiseException = (SynthetiseException) th;
            i = synthetiseException.getCode();
            synthetiseResult = synthetiseException.getResult();
            m132142a(synthetiseResult.toString());
        } else {
            i = 10038;
            synthetiseResult = null;
        }
        JSONObject b = C38510bb.m123096a(synthetiseResult).mo96481a("exception", C13315l.m38963c(th)).mo96481a("event", C41494t.m132184a().mo102150b().toString()).mo96482b();
        if (this.f107865d) {
            C6893q.m21444a("aweme_mv_edit_error_rate", i, b);
        }
        C6893q.m21444a("aweme_synthesis_error_rate_parallel", i, b);
    }

    public C41466s(String str, long j, boolean z) {
        this.f107862a = new File(str);
        this.f107863b = j;
        this.f107865d = z;
    }
}
