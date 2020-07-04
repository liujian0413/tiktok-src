package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bd */
public final class C38515bd implements C18245g<VideoCreation> {
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public C38515bd() {
        C6893q.m21444a("aweme_movie_publish_error_rate_sdk", -1, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        C6893q.m21444a("aweme_movie_publish_error_rate_sdk", C38574ce.m123267a(11, th), C38510bb.m123095a().mo96481a("exception", C17462u.m58024b(th)).mo96482b());
    }
}
