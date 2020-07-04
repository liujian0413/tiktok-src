package com.p280ss.android.ugc.aweme.photo;

import com.facebook.common.internal.C13315l;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.C38574ce;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;

/* renamed from: com.ss.android.ugc.aweme.photo.d */
public final class C34730d implements C18245g<VideoCreation> {
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public final void onFailure(Throwable th) {
        int a = C38574ce.m123267a(11, th);
        String c = C13315l.m38963c(th);
        C6893q.m21452b("aweme_photo_publish_log", "fetch_upload_parameters_error", C6869c.m21381a().mo16887a("exception", c).mo16888b());
        C6893q.m21444a("aweme_photo_publish_error_rate", a, C6869c.m21381a().mo16887a("exception", c).mo16888b());
    }
}
