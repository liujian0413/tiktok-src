package com.p280ss.android.ugc.aweme.p759ac;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.ac.g */
final class C15464g {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public static void m45279a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    static boolean m45280a(Context context) {
        try {
            return C6900g.m21454b().mo16943d();
        } catch (Exception unused) {
            return false;
        }
    }
}
