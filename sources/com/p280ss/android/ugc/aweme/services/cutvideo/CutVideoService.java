package com.p280ss.android.ugc.aweme.services.cutvideo;

import android.content.Context;
import com.p280ss.android.ugc.aweme.shortvideo.cut.p1552a.C38729a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.p1552a.C38742b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.CutVideoService */
public final class CutVideoService implements ICutVideoService {
    public final CutVideoView getCutVideoView(Context context) {
        C7573i.m23587b(context, "context");
        CutVideoView cutVideoView = new CutVideoView(context);
        cutVideoView.setProxy(new C38729a());
        return cutVideoView;
    }

    public final DisplayVideoView getDisplayVideoView(Context context) {
        C7573i.m23587b(context, "context");
        DisplayVideoView displayVideoView = new DisplayVideoView(context);
        displayVideoView.setProxy(new C38742b());
        return displayVideoView;
    }
}
