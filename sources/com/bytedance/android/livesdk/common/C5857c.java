package com.bytedance.android.livesdk.common;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.common.c */
public class C5857c extends Dialog {

    /* renamed from: f */
    protected boolean f17241f;

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f17241f) {
                window.setLayout(-1, -2);
                return;
            }
            window.setLayout(-2, -1);
        }
    }

    public C5857c(Context context, boolean z) {
        int i;
        if (z) {
            i = R.style.xv;
        } else {
            i = R.style.xw;
        }
        super(context, i);
        Window window = getWindow();
        if (window != null) {
            getWindow().requestFeature(1);
            if (z) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
        }
        this.f17241f = z;
    }
}
