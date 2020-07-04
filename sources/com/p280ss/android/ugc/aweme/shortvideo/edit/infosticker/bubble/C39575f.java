package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.f */
public final class C39575f {
    /* renamed from: a */
    public static final float m126467a(Context context, float f) {
        C7573i.m23587b(context, "activity");
        Resources resources = context.getResources();
        C7573i.m23582a((Object) resources, "activity.resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
