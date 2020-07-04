package com.p280ss.android.ugc.aweme.discover.hotspot.p1179a;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.common.utility.C9738o;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.hotspot.a.b */
public final class C26692b {
    /* renamed from: a */
    public static final void m87676a(View view, boolean z) {
        m87677a(view, z, 400);
    }

    /* renamed from: a */
    public static final void m87675a(View view) {
        C7573i.m23587b(view, "$this$transForSpot");
        view.setTranslationY(C9738o.m28708b(view.getContext(), -13.0f));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m87677a(View view, boolean z, long j) {
        float f;
        C7573i.m23587b(view, "$this$fade");
        ViewPropertyAnimator animate = view.animate();
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animate.alpha(f).setDuration(j).start();
    }
}
