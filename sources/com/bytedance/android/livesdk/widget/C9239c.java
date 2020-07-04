package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.widget.c */
public abstract class C9239c extends Dialog {

    /* renamed from: b */
    protected boolean f25336b;

    /* renamed from: a */
    public abstract int mo9100a();

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25336b = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25336b = false;
    }

    public C9239c(Context context) {
        super(context, R.style.yh);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(mo9100a(), null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
    }
}
