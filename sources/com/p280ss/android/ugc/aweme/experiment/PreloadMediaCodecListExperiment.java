package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "preload_media_codec")
/* renamed from: com.ss.android.ugc.aweme.experiment.PreloadMediaCodecListExperiment */
public final class PreloadMediaCodecListExperiment {
    @C6382b(mo15285a = true)
    private static final boolean DISABLE = false;
    @C6382b
    private static final boolean ENABLE = true;
    public static final PreloadMediaCodecListExperiment INSTANCE = new PreloadMediaCodecListExperiment();

    private PreloadMediaCodecListExperiment() {
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
