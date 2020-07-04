package com.p280ss.android.ugc.aweme.shortvideo.p1547a;

import com.p280ss.android.medialib.jni.EffectThumb;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.a.a */
public final class C38419a extends EffectThumb {
    public final int init(String str) {
        C7573i.m23587b(str, "path");
        return super.init(C43142i.m136842a(str, MediaType.VIDEO));
    }

    public final int init(String str, long j, long j2, float f) {
        C7573i.m23587b(str, "path");
        return super.init(C43142i.m136842a(str, MediaType.VIDEO), j, j2, f);
    }
}
