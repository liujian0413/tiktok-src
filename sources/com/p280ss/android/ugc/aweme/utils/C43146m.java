package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.m */
public final class C43146m {
    /* renamed from: a */
    public static boolean m136851a(Context context, String str) {
        if (C6776h.m20948b(context, str) || m136853c(context, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m136852b(Context context, String str) {
        String str2 = "";
        int i = -1;
        if (context == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo != null) {
                    i = packageInfo.versionCode;
                }
            } catch (Exception e) {
                str2 = e.getMessage();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            C6877n.m21407a("get_app_info", "", C6869c.m21381a().mo16887a("errorMsg", str2).mo16888b());
        }
        return i;
    }

    /* renamed from: c */
    private static boolean m136853c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            if (!C6307b.m19566a((Collection<T>) installedPackages)) {
                for (PackageInfo packageInfo : installedPackages) {
                    if (packageInfo != null && str.equals(packageInfo.packageName)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
