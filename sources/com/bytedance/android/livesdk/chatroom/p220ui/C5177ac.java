package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ac */
public final class C5177ac extends Dialog {
    public C5177ac(Context context) {
        super(context, R.style.yv);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ant, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
    }
}
