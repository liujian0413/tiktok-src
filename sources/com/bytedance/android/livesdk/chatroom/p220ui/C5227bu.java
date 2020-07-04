package com.bytedance.android.livesdk.chatroom.p220ui;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bu */
final class C5227bu {
    /* renamed from: a */
    static void m16884a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
