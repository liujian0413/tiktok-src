package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p280ss.android.common.applog.TeaAgent;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.l */
public final class C41560l {
    /* renamed from: a */
    public static void m132355a(Context context) {
        int i;
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        File[] fileArr = null;
        if (VERSION.SDK_INT >= 19) {
            fileArr = context.getExternalFilesDirs(null);
            i = -1;
        } else {
            i = 1;
        }
        if (fileArr != null) {
            i = fileArr.length;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("file_dirs_num", i);
        bundle.putString("did", TeaAgent.getServerDeviceId());
        instance.mo47131a("sdcard_num", bundle);
    }
}
