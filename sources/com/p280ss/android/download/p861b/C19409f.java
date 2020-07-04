package com.p280ss.android.download.p861b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.bytedance.common.utility.C6319n;
import java.io.File;

/* renamed from: com.ss.android.download.b.f */
public final class C19409f {
    /* renamed from: a */
    public static boolean m63770a(Context context, String str) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || str == null || C6319n.m19593a(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
                if (packageArchiveInfo == null) {
                    return false;
                }
                String str2 = packageArchiveInfo.packageName;
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str2, 1);
                } catch (NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i <= packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return z;
    }
}
