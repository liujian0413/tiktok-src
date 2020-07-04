package com.p280ss.android.ugc.aweme.net;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.content.C0683b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23484l;

/* renamed from: com.ss.android.ugc.aweme.net.v */
public final class C34102v {
    /* renamed from: a */
    public static void m109777a(Activity activity) {
        if (VERSION.SDK_INT == 28 && "45005".equals(C23484l.m77112a()) && C0683b.m2909b(C6399b.m19921a(), "android.permission.READ_PHONE_STATE") != 0) {
            ActivityCompat.m2241a(activity, new String[]{"android.permission.READ_PHONE_STATE"}, 109);
        }
    }
}
