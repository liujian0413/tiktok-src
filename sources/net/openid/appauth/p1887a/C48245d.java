package net.openid.appauth.p1887a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.Iterator;

/* renamed from: net.openid.appauth.a.d */
public final class C48245d {

    /* renamed from: a */
    static final Intent f123225a = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    /* renamed from: a */
    private static boolean m149672a(ResolveInfo resolveInfo) {
        if (!resolveInfo.filter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator schemesIterator = resolveInfo.filter.schemesIterator();
        boolean z = false;
        boolean z2 = false;
        while (schemesIterator.hasNext()) {
            String str = (String) schemesIterator.next();
            z |= WebKitApi.SCHEME_HTTP.equals(str);
            z2 |= WebKitApi.SCHEME_HTTPS.equals(str);
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[Catch:{ NameNotFoundException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f A[Catch:{ NameNotFoundException -> 0x0083 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<net.openid.appauth.p1887a.C48243b> m149669a(android.content.Context r10) {
        /*
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 64
            r3 = 23
            if (r1 < r3) goto L_0x0015
            r1 = 131136(0x20040, float:1.8376E-40)
            goto L_0x0017
        L_0x0015:
            r1 = 64
        L_0x0017:
            android.content.Intent r3 = f123225a
            r4 = 0
            android.content.pm.ResolveInfo r3 = r10.resolveActivity(r3, r4)
            if (r3 == 0) goto L_0x0025
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            android.content.Intent r5 = f123225a
            java.util.List r1 = r10.queryIntentActivities(r5, r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0030:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r1.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            boolean r6 = m149672a(r5)
            if (r6 == 0) goto L_0x0030
            android.content.pm.ActivityInfo r6 = r5.activityInfo     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r6 = r6.packageName     // Catch:{ NameNotFoundException -> 0x0083 }
            android.content.pm.PackageInfo r6 = r10.getPackageInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0083 }
            android.content.pm.ActivityInfo r7 = r5.activityInfo     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r7 = r7.packageName     // Catch:{ NameNotFoundException -> 0x0083 }
            boolean r7 = m149671a(r10, r7)     // Catch:{ NameNotFoundException -> 0x0083 }
            r8 = 1
            if (r7 == 0) goto L_0x006b
            net.openid.appauth.a.b r7 = new net.openid.appauth.a.b     // Catch:{ NameNotFoundException -> 0x0083 }
            r7.<init>(r6, r8)     // Catch:{ NameNotFoundException -> 0x0083 }
            android.content.pm.ActivityInfo r9 = r5.activityInfo     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r9 = r9.packageName     // Catch:{ NameNotFoundException -> 0x0083 }
            boolean r9 = r9.equals(r3)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r9 == 0) goto L_0x0068
            r0.add(r4, r7)     // Catch:{ NameNotFoundException -> 0x0083 }
            goto L_0x006c
        L_0x0068:
            r0.add(r7)     // Catch:{ NameNotFoundException -> 0x0083 }
        L_0x006b:
            r8 = 0
        L_0x006c:
            net.openid.appauth.a.b r7 = new net.openid.appauth.a.b     // Catch:{ NameNotFoundException -> 0x0083 }
            r7.<init>(r6, r4)     // Catch:{ NameNotFoundException -> 0x0083 }
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r5 = r5.packageName     // Catch:{ NameNotFoundException -> 0x0083 }
            boolean r5 = r5.equals(r3)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r5 == 0) goto L_0x007f
            r0.add(r8, r7)     // Catch:{ NameNotFoundException -> 0x0083 }
            goto L_0x0030
        L_0x007f:
            r0.add(r7)     // Catch:{ NameNotFoundException -> 0x0083 }
            goto L_0x0030
        L_0x0083:
            goto L_0x0030
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.p1887a.C48245d.m149669a(android.content.Context):java.util.List");
    }

    /* renamed from: a */
    private static boolean m149671a(PackageManager packageManager, String str) {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        intent.setPackage(str);
        if (packageManager.resolveService(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C48243b m149670a(Context context, C48244c cVar) {
        C48243b bVar = null;
        for (C48243b bVar2 : m149669a(context)) {
            if (bVar2.f123224d.booleanValue()) {
                return bVar2;
            }
            if (bVar == null) {
                bVar = bVar2;
            }
        }
        return bVar;
    }
}
