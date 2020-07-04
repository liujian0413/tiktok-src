package com.p280ss.android.ugc.aweme.flowfeed.p1254h;

import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.a */
public final class C29365a {
    /* renamed from: a */
    public static void m96457a(final View view) {
        if (view != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }
}
