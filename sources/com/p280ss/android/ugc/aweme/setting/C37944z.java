package com.p280ss.android.ugc.aweme.setting;

import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.z */
public final class C37944z extends C37631g {
    /* renamed from: c */
    public final File mo31401c() {
        IIMService g = C30553b.m99810g();
        C7573i.m23582a((Object) g, "IM.get()");
        File audioDownloadCachePath = g.getAudioDownloadCachePath();
        C7573i.m23582a((Object) audioDownloadCachePath, "IM.get().audioDownloadCachePath");
        return audioDownloadCachePath;
    }
}
