package com.p280ss.android.ugc.aweme.longvideonew;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LongVideo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.longvideo.C32735f;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.h */
public abstract /* synthetic */ class C32800h {
    /* renamed from: b */
    static /* synthetic */ Video m106161b(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return aweme.getVideo();
    }

    /* renamed from: a */
    static /* synthetic */ Video m106160a(Aweme aweme) {
        if (C32735f.m105954a()) {
            if (aweme == null) {
                return null;
            }
            return aweme.getVideo();
        } else if (aweme == null || aweme.getLongVideos() == null || aweme.getLongVideos().size() <= 0) {
            return null;
        } else {
            return ((LongVideo) aweme.getLongVideos().get(0)).getVideo();
        }
    }
}
