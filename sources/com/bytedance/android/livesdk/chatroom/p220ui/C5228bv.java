package com.bytedance.android.livesdk.chatroom.p220ui;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bv */
final class C5228bv {
    /* renamed from: a */
    static void m16885a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
