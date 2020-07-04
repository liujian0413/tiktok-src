package com.p280ss.android.ugc.aweme.p313im;

import android.app.Dialog;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.f */
public final class C30559f {
    /* renamed from: a */
    public static void m99813a(Dialog dialog) {
        if (dialog != null && (dialog instanceof BottomSheetDialog)) {
            FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialog).findViewById(R.id.a7r);
            if (frameLayout != null) {
                BottomSheetBehavior a = BottomSheetBehavior.m1365a(frameLayout);
                a.mo1352a(frameLayout.getHeight());
                a.f1341g = true;
            }
        }
    }
}
