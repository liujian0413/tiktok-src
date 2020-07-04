package com.p280ss.android.ugc.aweme.video.preload;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* renamed from: com.ss.android.ugc.aweme.video.preload.i */
public final class C43304i {
    /* renamed from: a */
    public static void m137380a(Aweme aweme) {
        C43305j.m137386g().mo105028b();
        C43305j.m137386g().mo105085a(aweme);
        if (aweme != null && aweme.getVideo() != null) {
            aweme.getVideo().setSourceId(aweme.getAid());
            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
            if (properPlayAddr != null) {
                properPlayAddr.setSourceId(aweme.getAid());
            }
        }
    }
}
