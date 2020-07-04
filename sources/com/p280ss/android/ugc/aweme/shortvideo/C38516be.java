package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.be */
public final class C38516be implements C18245g<VideoCreation> {
    /* renamed from: a */
    private static void m123112a(VideoCreation videoCreation) {
        C6893q.m21444a("fetch_upload_parameters_error", 0, (JSONObject) null);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        m123112a((VideoCreation) obj);
    }

    public final void onFailure(Throwable th) {
        C6893q.m21444a("fetch_upload_parameters_error", 1, C38510bb.m123095a().mo96481a("exception", C17462u.m58024b(th)).mo96482b());
    }
}
