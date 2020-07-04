package com.p280ss.android.ugc.aweme.zhima;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.common.utility.collection.C6307b;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.zhima.a */
public final class C43583a {
    /* renamed from: a */
    public static boolean m138109a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("alipays://"));
        if (!C6307b.m19566a((Collection<T>) packageManager.queryIntentActivities(intent, 64))) {
            return true;
        }
        return false;
    }
}
