package com.p280ss.android.ugc.aweme.longvideo;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LongVideo;

/* renamed from: com.ss.android.ugc.aweme.longvideo.i */
public final class C32747i {

    /* renamed from: a */
    public static final C32747i f85378a = new C32747i();

    private C32747i() {
    }

    /* renamed from: a */
    public static LongVideo m106010a(Aweme aweme) {
        if (aweme == null || aweme.getLongVideos() == null || aweme.getLongVideos().size() <= 0) {
            return null;
        }
        return (LongVideo) aweme.getLongVideos().get(0);
    }
}
