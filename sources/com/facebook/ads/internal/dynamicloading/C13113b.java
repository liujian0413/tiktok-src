package com.facebook.ads.internal.dynamicloading;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.facebook.ads.internal.dynamicloading.b */
final class C13113b {
    /* renamed from: a */
    static ApplicationInfo m38339a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        TextUtils.equals(str, C6399b.m19921a().getPackageName());
        return packageManager.getApplicationInfo(str, 0);
    }
}
