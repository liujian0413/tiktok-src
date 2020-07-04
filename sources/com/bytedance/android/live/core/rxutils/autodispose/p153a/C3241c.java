package com.bytedance.android.live.core.rxutils.autodispose.p153a;

import android.view.View;
import com.bytedance.android.live.core.rxutils.autodispose.C3246ae;
import p346io.reactivex.C7322c;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a.c */
public final class C3241c implements C3246ae {

    /* renamed from: a */
    private final View f9965a;

    /* renamed from: c */
    public final C7322c mo10173c() {
        return new C3239b(this.f9965a);
    }

    private C3241c(View view) {
        this.f9965a = view;
    }

    /* renamed from: a */
    public static C3246ae m12272a(View view) {
        if (view != null) {
            return new C3241c(view);
        }
        throw new NullPointerException("view == null");
    }
}
