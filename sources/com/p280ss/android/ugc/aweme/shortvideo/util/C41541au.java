package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.au */
public final class C41541au {
    /* renamed from: a */
    public static void m132303a(final View view, final float f) {
        if (view != null) {
            view.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        C41540at.m132301a(view, 1.0f, f);
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        C41540at.m132301a(view, f, 1.0f);
                    }
                    return false;
                }
            });
        }
    }
}
