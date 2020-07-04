package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.aj */
final class C21501aj {
    /* renamed from: a */
    static void m72196a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
