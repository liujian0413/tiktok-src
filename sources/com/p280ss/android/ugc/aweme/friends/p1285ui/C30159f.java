package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.f */
final class C30159f {
    /* renamed from: a */
    static void m98793a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    static boolean m98794a(Context context) {
        try {
            return C6900g.m21454b().mo16943d();
        } catch (Exception unused) {
            return false;
        }
    }
}
