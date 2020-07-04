package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.t */
final class C5734t {
    /* renamed from: a */
    static void m18061a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
