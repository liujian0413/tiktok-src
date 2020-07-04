package com.p280ss.android.ugc.aweme.account.util;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.ss.android.ugc.aweme.account.util.l */
public final class C22333l {

    /* renamed from: a */
    public static final C22333l f59602a = new C22333l();

    private C22333l() {
    }

    /* renamed from: a */
    public static final void m73935a(View view, int i) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public static final void m73936a(View view, int i, int i2) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }
}
