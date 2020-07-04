package com.p280ss.android.ugc.aweme.opensdk.share.presenter;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.presenter.d */
final class C34696d {
    /* renamed from: a */
    static void m112005a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
