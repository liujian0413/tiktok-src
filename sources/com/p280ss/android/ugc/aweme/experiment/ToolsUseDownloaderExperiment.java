package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "tools_use_downloader")
/* renamed from: com.ss.android.ugc.aweme.experiment.ToolsUseDownloaderExperiment */
public final class ToolsUseDownloaderExperiment {
    @C6382b(mo15285a = true)
    private static final boolean CONTROL_GROUP = false;
    public static final ToolsUseDownloaderExperiment INSTANCE = new ToolsUseDownloaderExperiment();
    @C6382b
    private static final boolean USE_DOWNLOADER = true;

    private ToolsUseDownloaderExperiment() {
    }

    public final boolean getCONTROL_GROUP() {
        return CONTROL_GROUP;
    }

    public final boolean getUSE_DOWNLOADER() {
        return USE_DOWNLOADER;
    }
}
