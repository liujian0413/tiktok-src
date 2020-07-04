package com.p280ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "webview_progress_bar")
/* renamed from: com.ss.android.ugc.aweme.commercialize.abtest.WebviewProgressBarExperiment */
public final class WebviewProgressBarExperiment {
    @C6382b(mo15285a = true)
    private static final boolean HIDE = false;
    public static final WebviewProgressBarExperiment INSTANCE = new WebviewProgressBarExperiment();
    @C6382b
    private static final boolean SHOW = true;

    private WebviewProgressBarExperiment() {
    }

    public final boolean getHIDE() {
        return HIDE;
    }

    public final boolean getSHOW() {
        return SHOW;
    }
}
