package com.snapchat.kit.sdk.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.support.p022v4.content.FileProvider;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.io.File;

public class SnapUtils {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: a */
        static ApplicationInfo m61303a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            TextUtils.equals(str, C6399b.m19921a().getPackageName());
            return packageManager.getApplicationInfo(str, 0);
        }
    }

    /* renamed from: a */
    private static boolean m61302a(int i) {
        return i >= 1729;
    }

    public static String getFileProviderAuthority(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".fileprovider");
        return sb.toString();
    }

    public static Uri getFileProviderUri(Context context, File file) {
        if (file == null) {
            return null;
        }
        return FileProvider.getUriForFile(context, getFileProviderAuthority(context), file);
    }

    public static boolean isSnapchatInstalled(PackageManager packageManager, String str) {
        try {
            ApplicationInfo a = _lancet.m61303a(packageManager, str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (!a.enabled || !m61302a(packageInfo.versionCode)) {
                return false;
            }
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
