package com.p280ss.android.ugc.aweme.poi.p335ui.upload;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.b */
final class C35426b {
    /* renamed from: a */
    static void m114432a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    static boolean m114433a(Context context) {
        try {
            return C6900g.m21454b().mo16943d();
        } catch (Exception unused) {
            return false;
        }
    }
}
