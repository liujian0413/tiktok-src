package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.x */
final class C5755x {
    /* renamed from: a */
    static void m18121a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
