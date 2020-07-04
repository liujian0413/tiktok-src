package com.p1848vk.sdk.p1849a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.vk.sdk.a.d */
final class C47110d {
    /* renamed from: a */
    static ApplicationInfo m147313a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        TextUtils.equals(str, C6399b.m19921a().getPackageName());
        return packageManager.getApplicationInfo(str, 0);
    }
}
