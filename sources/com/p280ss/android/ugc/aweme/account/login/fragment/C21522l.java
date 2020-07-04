package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.l */
final class C21522l {
    /* renamed from: a */
    static void m72202a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
