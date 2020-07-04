package com.p280ss.android.ugc.aweme.commercialize.egg;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.e */
final class C24656e {
    /* renamed from: a */
    static void m80824a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
