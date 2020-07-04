package com.p280ss.android.ugc.aweme.video.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "videocache_loader_type")
/* renamed from: com.ss.android.ugc.aweme.video.experiment.VideoCacheLoaderTypeExperiment */
public final class VideoCacheLoaderTypeExperiment {
    @C6382b
    public static final int ALIBABA_PRELOAD = 5;
    @C6382b
    public static final int BYTEDANCE_PRELOAD = 2;
    @C6382b(mo15285a = true)
    public static final int HTTP_PRELOAD = 0;
    public static final VideoCacheLoaderTypeExperiment INSTANCE = new VideoCacheLoaderTypeExperiment();
    @C6382b
    public static final int KINGSOFT_PRELOAD = 3;
    @C6382b
    public static final int XY_PRELOAD = 1;
    @C6382b
    public static final int YF_PRELOAD = 4;

    private VideoCacheLoaderTypeExperiment() {
    }
}
