package com.p280ss.android.ugc.aweme.feed.p1226b;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;

/* renamed from: com.ss.android.ugc.aweme.feed.b.b */
public final class C28229b {
    /* renamed from: a */
    public static void m92772a(Aweme aweme) {
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
