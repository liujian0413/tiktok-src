package com.p280ss.android.ugc.gamora.editor;

import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.editor.ar */
public final class C44065ar {
    /* renamed from: a */
    public static final void m139484a(View view, float f, long j) {
        C7573i.m23587b(view, "layout");
        view.animate().translationY(f).setDuration(j).start();
    }

    /* renamed from: a */
    public static final void m139483a(View view, float f, float f2, float f3) {
        C7573i.m23587b(view, "layout");
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
