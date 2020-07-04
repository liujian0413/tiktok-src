package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ce */
public final class C38574ce {
    /* renamed from: a */
    public static int m123267a(int i, Throwable th) {
        if (!(th instanceof ApiServerException) && !C38575cf.m123268a(C35563c.f93238a)) {
            return i * VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
        }
        return i;
    }
}
