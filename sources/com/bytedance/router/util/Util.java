package com.bytedance.router.util;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.RoutesConfig;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Util {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m36462x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    public static boolean isLegalUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Uri.parse(str).isHierarchical();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[Catch:{ NameNotFoundException -> 0x002f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getAppVersionCode(android.content.Context r4) {
        /*
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = -1
            java.lang.String r2 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0021 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = com.bytedance.router.util.Util._lancet.m36462x89c42dc8(r0, r2, r3)     // Catch:{ NameNotFoundException -> 0x0021 }
            if (r2 == 0) goto L_0x0021
            android.os.Bundle r3 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0021 }
            if (r3 == 0) goto L_0x0021
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0021 }
            java.lang.String r3 = "UPDATE_VERSION_CODE"
            int r2 = r2.getInt(r3, r1)     // Catch:{ NameNotFoundException -> 0x0021 }
            if (r2 <= 0) goto L_0x0020
            return r2
        L_0x0020:
            r1 = r2
        L_0x0021:
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x002f }
            r2 = 0
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r2)     // Catch:{ NameNotFoundException -> 0x002f }
            if (r4 == 0) goto L_0x002f
            int r4 = r4.versionCode     // Catch:{ NameNotFoundException -> 0x002f }
            return r4
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.util.Util.getAppVersionCode(android.content.Context):int");
    }

    public static String getRealRouteUrl(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return null;
        }
        if (TextUtils.isEmpty(parse.getScheme())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("//");
        sb.append(parse.getAuthority());
        sb.append(parse.getPath());
        return sb.toString();
    }

    public static String getRouteUrl(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            StringBuilder sb = new StringBuilder(parse.getScheme());
            sb.append("://");
            sb.append(parse.getAuthority());
            sb.append(parse.getPath());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("//");
        sb2.append(parse.getAuthority());
        sb2.append(parse.getPath());
        return sb2.toString();
    }

    public static Map<String, String> sliceUrlParams(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.m36454e("Slice url params but the url is null!!!");
            return Collections.EMPTY_MAP;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : parse.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str2)) {
                String queryParameter = parse.getQueryParameter(str2);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                hashMap.put(str2, queryParameter);
            }
        }
        return hashMap;
    }

    public static String completeUrl(String str, String str2) {
        if (!TextUtils.isEmpty(Uri.parse(str2).getScheme())) {
            return str2;
        }
        if (str2.startsWith("//")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(':');
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("://");
        sb2.append(str2);
        return sb2.toString();
    }

    public static boolean isLegalUrl(String str, RoutesConfig routesConfig) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return false;
        }
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || scheme.equals(routesConfig.getScheme())) {
            return true;
        }
        String[] otherSchemes = routesConfig.getOtherSchemes();
        if (otherSchemes != null && otherSchemes.length > 0) {
            for (String equals : otherSchemes) {
                if (scheme.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }
}
