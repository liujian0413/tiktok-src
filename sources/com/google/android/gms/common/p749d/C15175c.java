package com.google.android.gms.common.p749d;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;

/* renamed from: com.google.android.gms.common.d.c */
final class C15175c {
    /* renamed from: a */
    static ApplicationInfo m44158a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C7108b.f19972a == null) {
            C7108b.f19972a = packageManager.getApplicationInfo(str, i);
        }
        return C7108b.f19972a;
    }
}
