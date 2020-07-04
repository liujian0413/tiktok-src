package com.p280ss.android.deviceregister.p289a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.C6730a;
import com.p280ss.android.deviceregister.p290b.C6786b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.a.d */
public final class C6781d {

    /* renamed from: a */
    private static String f19299a = null;

    /* renamed from: b */
    private static C6730a f19300b = null;

    /* renamed from: c */
    private static String f19301c = null;

    /* renamed from: d */
    private static String f19302d = null;

    /* renamed from: e */
    private static int f19303e = 0;

    /* renamed from: f */
    private static int f19304f = 0;

    /* renamed from: g */
    private static String f19305g = null;

    /* renamed from: h */
    private static String f19306h = null;

    /* renamed from: i */
    private static String f19307i = "2.5.5.6";

    /* renamed from: j */
    private static ConcurrentHashMap<String, Object> f19308j = new ConcurrentHashMap<>();

    /* renamed from: k */
    private static boolean f19309k = false;

    /* renamed from: l */
    private static JSONObject f19310l;

    /* renamed from: m */
    private static String f19311m;

    /* renamed from: n */
    private static String f19312n;

    /* renamed from: o */
    private static String f19313o;

    /* renamed from: p */
    private static String f19314p;

    /* renamed from: q */
    private static final Object f19315q = new Object();

    /* renamed from: r */
    private static C6786b f19316r;

    /* renamed from: s */
    private static C6780c f19317s;

    /* renamed from: t */
    private static boolean f19318t = false;

    /* renamed from: u */
    private static String f19319u;

    /* renamed from: v */
    private static ConcurrentHashMap<String, Object> f19320v;

    /* renamed from: a */
    public static String m20965a() {
        return f19319u;
    }

    /* renamed from: b */
    public static String m20979b() {
        return f19302d;
    }

    /* renamed from: c */
    public static String m20984c() {
        return f19305g;
    }

    /* renamed from: d */
    public static int m20986d() {
        return f19304f;
    }

    /* renamed from: f */
    public static String m20990f() {
        return f19299a;
    }

    /* renamed from: g */
    public static String m20991g() {
        return f19301c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x051c, code lost:
        if (com.bytedance.common.utility.C6319n.m19593a(f19306h) == false) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0538, code lost:
        if (r0.equals(f19306h) == false) goto L_0x051e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0542 A[Catch:{ Throwable -> 0x0603 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0547 A[Catch:{ Throwable -> 0x0603 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x054e A[Catch:{ Throwable -> 0x0603 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0570 A[Catch:{ Throwable -> 0x0603 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x059e A[Catch:{ Throwable -> 0x0601 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x05c9 A[Catch:{ Throwable -> 0x0601 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05e4 A[Catch:{ Throwable -> 0x0601 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05eb A[Catch:{ Throwable -> 0x0601 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05f2 A[Catch:{ Throwable -> 0x0601 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x062f A[Catch:{ Throwable -> 0x063c }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0652 A[SYNTHETIC, Splitter:B:243:0x0652] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0780  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x07be A[Catch:{ Throwable -> 0x0868 }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x07e8 A[Catch:{ Throwable -> 0x0868 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x083c A[Catch:{ Throwable -> 0x0868 }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x086f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20978a(android.content.Context r21, org.json.JSONObject r22) {
        /*
            r1 = r21
            r2 = r22
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            org.json.JSONObject r0 = f19310l
            r4 = 1
            if (r0 == 0) goto L_0x001b
            java.lang.Object r5 = f19315q
            monitor-enter(r5)
            org.json.JSONObject r0 = f19310l     // Catch:{ all -> 0x0018 }
            m20976a(r0, r2)     // Catch:{ all -> 0x0018 }
            monitor-exit(r5)     // Catch:{ all -> 0x0018 }
            return r4
        L_0x0018:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            long r5 = android.os.SystemClock.uptimeMillis()
            java.util.HashMap r7 = new java.util.HashMap
            r0 = 64
            r7.<init>(r0)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            long r9 = android.os.SystemClock.uptimeMillis()
            r11 = 0
            java.lang.String r12 = r21.getPackageName()     // Catch:{ Exception -> 0x087c }
            android.content.pm.PackageManager r0 = r21.getPackageManager()     // Catch:{ Exception -> 0x006b }
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = com.p280ss.android.deviceregister.p289a.C19296e.m63227a(r0, r12, r13)     // Catch:{ Exception -> 0x006b }
            android.os.Bundle r0 = r0.metaData     // Catch:{ Exception -> 0x006b }
            java.lang.String r13 = f19299a     // Catch:{ Exception -> 0x006b }
            if (r13 == 0) goto L_0x0054
            java.lang.String r13 = f19299a     // Catch:{ Exception -> 0x006b }
            int r13 = r13.length()     // Catch:{ Exception -> 0x006b }
            if (r13 <= 0) goto L_0x0054
            java.lang.String r13 = "channel"
            java.lang.String r14 = f19299a     // Catch:{ Exception -> 0x006b }
            r3.put(r13, r14)     // Catch:{ Exception -> 0x006b }
            goto L_0x005f
        L_0x0054:
            java.lang.String r13 = "channel"
            java.lang.String r14 = "UMENG_CHANNEL"
            java.lang.String r14 = r0.getString(r14)     // Catch:{ Exception -> 0x006b }
            r3.put(r13, r14)     // Catch:{ Exception -> 0x006b }
        L_0x005f:
            java.lang.String r13 = "appkey"
            java.lang.String r14 = "UMENG_APPKEY"
            java.lang.String r0 = r0.getString(r14)     // Catch:{ Exception -> 0x006b }
            r3.put(r13, r0)     // Catch:{ Exception -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            m20974a(r0)     // Catch:{ Exception -> 0x087c }
        L_0x006f:
            java.lang.String r0 = "channel"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r13)     // Catch:{ Exception -> 0x087c }
            java.lang.String r0 = "appkey"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r9)     // Catch:{ Exception -> 0x087c }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            java.lang.String r0 = f19319u     // Catch:{ Exception -> 0x087c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x087c }
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = "package"
            java.lang.String r13 = f19319u     // Catch:{ Exception -> 0x087c }
            r3.put(r0, r13)     // Catch:{ Exception -> 0x087c }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x087c }
            r0.<init>()     // Catch:{ Exception -> 0x087c }
            java.lang.String r13 = "real_package_name"
            java.lang.String r14 = r21.getPackageName()     // Catch:{ Exception -> 0x087c }
            r0.putString(r13, r14)     // Catch:{ Exception -> 0x087c }
            com.p280ss.android.deviceregister.C6789d.m21060a(r0)     // Catch:{ Exception -> 0x087c }
            java.lang.String r0 = "package"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r13)     // Catch:{ Exception -> 0x087c }
            java.lang.String r0 = "real_package_name"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r9)     // Catch:{ Exception -> 0x087c }
            goto L_0x00e8
        L_0x00d0:
            java.lang.String r0 = "package"
            java.lang.String r13 = r21.getPackageName()     // Catch:{ Exception -> 0x087c }
            r3.put(r0, r13)     // Catch:{ Exception -> 0x087c }
            java.lang.String r0 = "package"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r9)     // Catch:{ Exception -> 0x087c }
        L_0x00e8:
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            com.ss.android.common.a r0 = f19300b     // Catch:{ Exception -> 0x087c }
            if (r0 == 0) goto L_0x00f8
            com.ss.android.common.a r0 = f19300b     // Catch:{ Exception -> 0x087c }
            java.lang.String r0 = r0.mo16342i()     // Catch:{ Exception -> 0x087c }
            f19301c = r0     // Catch:{ Exception -> 0x087c }
        L_0x00f8:
            java.lang.String r0 = f19302d     // Catch:{ Exception -> 0x087c }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x087c }
            if (r0 != 0) goto L_0x0104
            java.lang.String r0 = f19302d     // Catch:{ Exception -> 0x087c }
            f19301c = r0     // Catch:{ Exception -> 0x087c }
        L_0x0104:
            java.lang.String r0 = "app_version"
            java.lang.String r13 = f19301c     // Catch:{ Exception -> 0x087c }
            r3.put(r0, r13)     // Catch:{ Exception -> 0x087c }
            java.lang.String r0 = "app_version"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r9)     // Catch:{ Exception -> 0x087c }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            com.ss.android.common.a r0 = f19300b     // Catch:{ Exception -> 0x087c }
            if (r0 == 0) goto L_0x012a
            com.ss.android.common.a r0 = f19300b     // Catch:{ Exception -> 0x087c }
            int r0 = r0.mo16344k()     // Catch:{ Exception -> 0x087c }
            f19303e = r0     // Catch:{ Exception -> 0x087c }
        L_0x012a:
            java.lang.String r0 = "version_code"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r9)     // Catch:{ Exception -> 0x087c }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            android.content.pm.PackageManager r0 = r21.getPackageManager()     // Catch:{ Exception -> 0x087c }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r11)     // Catch:{ Exception -> 0x087c }
            android.content.pm.ApplicationInfo r12 = r0.applicationInfo     // Catch:{ Exception -> 0x087c }
            if (r12 == 0) goto L_0x0167
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ Exception -> 0x087c }
            int r0 = r0.labelRes     // Catch:{ Exception -> 0x087c }
            if (r0 <= 0) goto L_0x0158
            java.lang.String r12 = "display_name"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x087c }
            r8.put(r12, r0)     // Catch:{ Exception -> 0x087c }
        L_0x0158:
            java.lang.String r0 = "display_name"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r9)     // Catch:{ Exception -> 0x087c }
        L_0x0167:
            com.ss.android.common.a r0 = f19300b     // Catch:{ Exception -> 0x087c }
            if (r0 == 0) goto L_0x01ab
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            com.ss.android.common.a r0 = f19300b     // Catch:{ Exception -> 0x087c }
            int r0 = r0.mo16340g()     // Catch:{ Exception -> 0x087c }
            if (r0 <= 0) goto L_0x017c
            java.lang.String r12 = "update_version_code"
            r8.put(r12, r0)     // Catch:{ Exception -> 0x087c }
        L_0x017c:
            java.lang.String r0 = "update_version_code"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r9)     // Catch:{ Exception -> 0x087c }
            com.ss.android.common.a r0 = f19300b     // Catch:{ Exception -> 0x087c }
            int r0 = r0.mo16338e()     // Catch:{ Exception -> 0x087c }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            if (r0 <= 0) goto L_0x019c
            java.lang.String r12 = "manifest_version_code"
            r8.put(r12, r0)     // Catch:{ Exception -> 0x087c }
        L_0x019c:
            java.lang.String r0 = "manifest_version_code"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x087c }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x087c }
            r7.put(r0, r9)     // Catch:{ Exception -> 0x087c }
        L_0x01ab:
            r0 = 4
            java.lang.String[] r9 = new java.lang.String[r0]
            java.lang.String r10 = "channel"
            r9[r11] = r10
            java.lang.String r10 = "appkey"
            r9[r4] = r10
            r10 = 2
            java.lang.String r12 = "package"
            r9[r10] = r12
            r10 = 3
            java.lang.String r12 = "app_version"
            r9[r10] = r12
            int r10 = f19304f     // Catch:{ Exception -> 0x0287 }
            if (r10 != 0) goto L_0x01d0
            com.ss.android.common.a r10 = f19300b     // Catch:{ Exception -> 0x0287 }
            if (r10 == 0) goto L_0x01d0
            com.ss.android.common.a r10 = f19300b     // Catch:{ Exception -> 0x0287 }
            int r10 = r10.mo16335b()     // Catch:{ Exception -> 0x0287 }
            f19304f = r10     // Catch:{ Exception -> 0x0287 }
        L_0x01d0:
            java.lang.String r10 = "aid"
            int r12 = f19304f     // Catch:{ Exception -> 0x0287 }
            r8.put(r10, r12)     // Catch:{ Exception -> 0x0287 }
            r10 = 0
        L_0x01d8:
            if (r10 >= r0) goto L_0x01f7
            r12 = r9[r10]     // Catch:{ Exception -> 0x0287 }
            java.lang.Object r13 = r3.get(r12)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0287 }
            boolean r14 = com.bytedance.common.utility.C6319n.m19593a(r13)     // Catch:{ Exception -> 0x0287 }
            if (r14 == 0) goto L_0x01f1
            java.lang.String r13 = "appkey"
            boolean r12 = r13.equals(r12)     // Catch:{ Exception -> 0x0287 }
            if (r12 != 0) goto L_0x01f4
            return r11
        L_0x01f1:
            r8.put(r12, r13)     // Catch:{ Exception -> 0x0287 }
        L_0x01f4:
            int r10 = r10 + 1
            goto L_0x01d8
        L_0x01f7:
            java.lang.String r0 = "version_code"
            int r3 = f19303e     // Catch:{ Exception -> 0x0287 }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "sdk_version"
            java.lang.String r3 = f19307i     // Catch:{ Exception -> 0x0287 }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "os"
            java.lang.String r3 = "Android"
            r8.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "os_version"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0287 }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "os_version"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0287 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0287 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "os_api"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0287 }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "os_api"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0287 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0287 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "device_model"
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0287 }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "device_model"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0287 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0287 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "device_brand"
            java.lang.String r3 = android.os.Build.BRAND     // Catch:{ Exception -> 0x0287 }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "cpu_abi"
            java.lang.String r3 = android.os.Build.CPU_ABI     // Catch:{ Exception -> 0x0287 }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = "cpu_abi"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0287 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0287 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0287 }
            java.lang.String r0 = f19305g     // Catch:{ Exception -> 0x0287 }
            if (r0 != 0) goto L_0x0281
            java.lang.String r0 = ""
        L_0x0281:
            java.lang.String r3 = "release_build"
            r8.put(r3, r0)     // Catch:{ Exception -> 0x0287 }
            goto L_0x028b
        L_0x0287:
            r0 = move-exception
            m20974a(r0)
        L_0x028b:
            long r9 = android.os.SystemClock.uptimeMillis()
            android.content.res.Resources r0 = r21.getResources()     // Catch:{ Exception -> 0x02d8 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Exception -> 0x02d8 }
            int r3 = r0.densityDpi     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r12 = "density_dpi"
            r8.put(r12, r3)     // Catch:{ Exception -> 0x02d8 }
            r12 = 120(0x78, float:1.68E-43)
            if (r3 == r12) goto L_0x02b3
            r12 = 240(0xf0, float:3.36E-43)
            if (r3 == r12) goto L_0x02b0
            r12 = 320(0x140, float:4.48E-43)
            if (r3 == r12) goto L_0x02ad
            java.lang.String r3 = "mdpi"
            goto L_0x02b5
        L_0x02ad:
            java.lang.String r3 = "xhdpi"
            goto L_0x02b5
        L_0x02b0:
            java.lang.String r3 = "hdpi"
            goto L_0x02b5
        L_0x02b3:
            java.lang.String r3 = "ldpi"
        L_0x02b5:
            java.lang.String r12 = "display_density"
            r8.put(r12, r3)     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r3 = "resolution"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d8 }
            r12.<init>()     // Catch:{ Exception -> 0x02d8 }
            int r13 = r0.heightPixels     // Catch:{ Exception -> 0x02d8 }
            r12.append(r13)     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r13 = "x"
            r12.append(r13)     // Catch:{ Exception -> 0x02d8 }
            int r0 = r0.widthPixels     // Catch:{ Exception -> 0x02d8 }
            r12.append(r0)     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x02d8 }
            r8.put(r3, r0)     // Catch:{ Exception -> 0x02d8 }
            goto L_0x02dc
        L_0x02d8:
            r0 = move-exception
            m20974a(r0)
        L_0x02dc:
            java.lang.String r0 = "display_density"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r7.put(r0, r3)
            java.lang.String r0 = "resolution"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r7.put(r0, r3)
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0397 }
            android.content.res.Resources r0 = r21.getResources()     // Catch:{ Exception -> 0x0397 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x0397 }
            java.util.Locale r0 = r0.locale     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = r0.getLanguage()     // Catch:{ Exception -> 0x0397 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0397 }
            if (r3 != 0) goto L_0x0315
            java.lang.String r3 = "language"
            r8.put(r3, r0)     // Catch:{ Exception -> 0x0397 }
        L_0x0315:
            java.lang.String r0 = "language"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0397 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0397 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0397 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = com.p280ss.android.deviceregister.p855c.C19319c.m63354e(r21)     // Catch:{ Exception -> 0x0397 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0397 }
            if (r3 != 0) goto L_0x0339
            java.lang.String r3 = "mc"
            r8.put(r3, r0)     // Catch:{ Exception -> 0x0397 }
            f19306h = r0     // Catch:{ Exception -> 0x0397 }
        L_0x0339:
            java.lang.String r0 = "mc"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0397 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0397 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0397 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0397 }
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x0397 }
            int r0 = r0.getRawOffset()     // Catch:{ Exception -> 0x0397 }
            r3 = 3600000(0x36ee80, float:5.044674E-39)
            int r0 = r0 / r3
            r3 = -12
            if (r0 >= r3) goto L_0x035e
            r0 = -12
        L_0x035e:
            r3 = 12
            if (r0 <= r3) goto L_0x0364
            r0 = 12
        L_0x0364:
            java.lang.String r3 = "timezone"
            r8.put(r3, r0)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = "timezone"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0397 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0397 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0397 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = com.bytedance.common.utility.NetworkUtils.m19552f(r21)     // Catch:{ Exception -> 0x0397 }
            if (r0 == 0) goto L_0x0387
            java.lang.String r3 = "access"
            r8.put(r3, r0)     // Catch:{ Exception -> 0x0397 }
        L_0x0387:
            java.lang.String r0 = "access"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0397 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0397 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x0397 }
            goto L_0x039b
        L_0x0397:
            r0 = move-exception
            m20974a(r0)
        L_0x039b:
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03c2 }
            java.lang.String r0 = com.p280ss.android.common.applog.NetUtil.getAliyunUuid()     // Catch:{ Exception -> 0x03c2 }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x03c2 }
            if (r0 != 0) goto L_0x03b2
            java.lang.String r0 = "aliyun_uuid"
            java.lang.String r3 = com.p280ss.android.common.applog.NetUtil.getAliyunUuid()     // Catch:{ Exception -> 0x03c2 }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x03c2 }
        L_0x03b2:
            java.lang.String r0 = "aliyun_uuid"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03c2 }
            r3 = 0
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x03c2 }
            r7.put(r0, r3)     // Catch:{ Exception -> 0x03c2 }
            goto L_0x03c6
        L_0x03c2:
            r0 = move-exception
            m20974a(r0)
        L_0x03c6:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = f19308j     // Catch:{ Exception -> 0x03fc }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x03fc }
            if (r0 != 0) goto L_0x03f4
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = f19308j     // Catch:{ Exception -> 0x03fc }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x03fc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x03fc }
        L_0x03d8:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x03fc }
            if (r3 == 0) goto L_0x03f4
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x03fc }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x03fc }
            if (r3 == 0) goto L_0x03d8
            java.lang.Object r9 = r3.getKey()     // Catch:{ Exception -> 0x03fc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x03fc }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x03fc }
            r8.put(r9, r3)     // Catch:{ Exception -> 0x03fc }
            goto L_0x03d8
        L_0x03f4:
            java.lang.String r0 = "not_request_sender"
            boolean r3 = f19309k     // Catch:{ Exception -> 0x03fc }
            r8.put(r0, r3)     // Catch:{ Exception -> 0x03fc }
            goto L_0x0400
        L_0x03fc:
            r0 = move-exception
            m20974a(r0)
        L_0x0400:
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x042b }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x042b }
            java.lang.String r3 = r0.getNetworkOperatorName()     // Catch:{ Exception -> 0x042b }
            java.lang.String r0 = r0.getNetworkOperator()     // Catch:{ Exception -> 0x042b }
            boolean r12 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Exception -> 0x042b }
            if (r12 != 0) goto L_0x041f
            java.lang.String r12 = "carrier"
            r8.put(r12, r3)     // Catch:{ Exception -> 0x042b }
        L_0x041f:
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x042b }
            if (r3 != 0) goto L_0x042f
            java.lang.String r3 = "mcc_mnc"
            r8.put(r3, r0)     // Catch:{ Exception -> 0x042b }
            goto L_0x042f
        L_0x042b:
            r0 = move-exception
            m20974a(r0)
        L_0x042f:
            java.lang.String r0 = "carrier"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r7.put(r0, r3)
            java.lang.String r0 = "mcc_mnc"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r7.put(r0, r3)
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r3 = com.p280ss.android.common.util.C6776h.m20950c()     // Catch:{ Throwable -> 0x04a2 }
            if (r3 == 0) goto L_0x0460
            java.lang.String r3 = "MIUI-"
            r0.append(r3)     // Catch:{ Throwable -> 0x04a2 }
            goto L_0x0489
        L_0x0460:
            boolean r3 = com.p280ss.android.common.util.C6776h.m20953d()     // Catch:{ Throwable -> 0x04a2 }
            if (r3 == 0) goto L_0x046c
            java.lang.String r3 = "FLYME-"
            r0.append(r3)     // Catch:{ Throwable -> 0x04a2 }
            goto L_0x0489
        L_0x046c:
            java.lang.String r3 = com.p280ss.android.common.util.C6776h.m20946b()     // Catch:{ Throwable -> 0x04a2 }
            boolean r12 = com.p280ss.android.common.util.C6776h.m20945a(r3)     // Catch:{ Throwable -> 0x04a2 }
            if (r12 == 0) goto L_0x047b
            java.lang.String r12 = "EMUI-"
            r0.append(r12)     // Catch:{ Throwable -> 0x04a2 }
        L_0x047b:
            boolean r12 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x04a2 }
            if (r12 != 0) goto L_0x0489
            r0.append(r3)     // Catch:{ Throwable -> 0x04a2 }
            java.lang.String r3 = "-"
            r0.append(r3)     // Catch:{ Throwable -> 0x04a2 }
        L_0x0489:
            java.lang.String r3 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Throwable -> 0x04a2 }
            r0.append(r3)     // Catch:{ Throwable -> 0x04a2 }
            int r3 = r0.length()     // Catch:{ Throwable -> 0x04a2 }
            if (r3 <= 0) goto L_0x04a6
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x04a2 }
            f19313o = r0     // Catch:{ Throwable -> 0x04a2 }
            java.lang.String r0 = "rom"
            java.lang.String r3 = f19313o     // Catch:{ Throwable -> 0x04a2 }
            r8.put(r0, r3)     // Catch:{ Throwable -> 0x04a2 }
            goto L_0x04a6
        L_0x04a2:
            r0 = move-exception
            m20974a(r0)
        L_0x04a6:
            java.lang.String r0 = "rom"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r7.put(r0, r3)
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = com.p280ss.android.deviceregister.p855c.C19321d.m63372a()     // Catch:{ Throwable -> 0x04c8 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x04c8 }
            if (r3 != 0) goto L_0x04cc
            java.lang.String r3 = "rom_version"
            r8.put(r3, r0)     // Catch:{ Throwable -> 0x04c8 }
            goto L_0x04cc
        L_0x04c8:
            r0 = move-exception
            m20974a(r0)
        L_0x04cc:
            java.lang.String r0 = "rom_version"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r7.put(r0, r3)
            long r9 = android.os.SystemClock.uptimeMillis()
            m20982b(r1, r8)
            java.lang.String r0 = "sig_hash"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r7.put(r0, r3)
            long r9 = android.os.SystemClock.uptimeMillis()
            android.content.SharedPreferences r3 = com.p280ss.android.deviceregister.p289a.C6778a.m20959a(r21)
            java.lang.String r0 = "mac_addr"
            r12 = 0
            java.lang.String r0 = r3.getString(r0, r12)
            java.lang.String r13 = "google_aid"
            java.lang.String r13 = r3.getString(r13, r12)
            java.lang.String r14 = "app_language"
            java.lang.String r14 = r3.getString(r14, r12)
            java.lang.String r15 = "app_region"
            java.lang.String r15 = r3.getString(r15, r12)
            boolean r16 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r16 == 0) goto L_0x0520
            java.lang.String r0 = f19306h
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r0 != 0) goto L_0x053b
        L_0x051e:
            r12 = 1
            goto L_0x053c
        L_0x0520:
            java.lang.String r16 = f19306h
            boolean r16 = com.bytedance.common.utility.C6319n.m19593a(r16)
            if (r16 == 0) goto L_0x0532
            f19306h = r0
            java.lang.String r0 = "mc"
            java.lang.String r12 = f19306h     // Catch:{ JSONException -> 0x053b }
            r8.put(r0, r12)     // Catch:{ JSONException -> 0x053b }
            goto L_0x053b
        L_0x0532:
            java.lang.String r12 = f19306h
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x053b
            goto L_0x051e
        L_0x053b:
            r12 = 0
        L_0x053c:
            boolean r0 = com.p280ss.android.deviceregister.C6789d.m21091k()     // Catch:{ Throwable -> 0x0603 }
            if (r0 == 0) goto L_0x0547
            java.lang.String r0 = com.p280ss.android.deviceregister.p855c.C19319c.m63370m(r21)     // Catch:{ Throwable -> 0x0603 }
            goto L_0x0548
        L_0x0547:
            r0 = 0
        L_0x0548:
            boolean r16 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x0603 }
            if (r16 == 0) goto L_0x0552
            java.lang.String r0 = com.p280ss.android.C6725a.m20835a()     // Catch:{ Throwable -> 0x0603 }
        L_0x0552:
            java.lang.String r11 = com.p280ss.android.C6725a.m20837b()     // Catch:{ Throwable -> 0x0603 }
            java.lang.String r4 = com.p280ss.android.C6725a.m20839c()     // Catch:{ Throwable -> 0x0603 }
            boolean r16 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x0603 }
            if (r16 != 0) goto L_0x0568
            boolean r16 = r0.equals(r13)     // Catch:{ Throwable -> 0x0603 }
            if (r16 != 0) goto L_0x0568
            r13 = 1
            goto L_0x056a
        L_0x0568:
            r0 = r13
            r13 = 0
        L_0x056a:
            boolean r16 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x0603 }
            if (r16 != 0) goto L_0x0575
            java.lang.String r2 = "google_aid"
            r8.put(r2, r0)     // Catch:{ Throwable -> 0x0603 }
        L_0x0575:
            java.lang.String r2 = "google_aid"
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0603 }
            r18 = 0
            long r16 = r16 - r9
            r19 = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r16)     // Catch:{ Throwable -> 0x0601 }
            r7.put(r2, r5)     // Catch:{ Throwable -> 0x0601 }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r11)     // Catch:{ Throwable -> 0x0601 }
            if (r2 != 0) goto L_0x0597
            boolean r2 = r11.equals(r14)     // Catch:{ Throwable -> 0x0601 }
            if (r2 != 0) goto L_0x0597
            r14 = r11
            r2 = 1
            goto L_0x0598
        L_0x0597:
            r2 = 0
        L_0x0598:
            boolean r5 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Throwable -> 0x0601 }
            if (r5 != 0) goto L_0x05a3
            java.lang.String r5 = "app_language"
            r8.put(r5, r14)     // Catch:{ Throwable -> 0x0601 }
        L_0x05a3:
            java.lang.String r5 = "app_language"
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0601 }
            r6 = 0
            long r16 = r16 - r9
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ Throwable -> 0x0601 }
            r7.put(r5, r6)     // Catch:{ Throwable -> 0x0601 }
            boolean r5 = com.bytedance.common.utility.C6319n.m19593a(r4)     // Catch:{ Throwable -> 0x0601 }
            if (r5 != 0) goto L_0x05c2
            boolean r5 = r4.equals(r15)     // Catch:{ Throwable -> 0x0601 }
            if (r5 != 0) goto L_0x05c2
            r15 = r4
            r4 = 1
            goto L_0x05c3
        L_0x05c2:
            r4 = 0
        L_0x05c3:
            boolean r5 = com.bytedance.common.utility.C6319n.m19593a(r15)     // Catch:{ Throwable -> 0x0601 }
            if (r5 != 0) goto L_0x05ce
            java.lang.String r5 = "app_region"
            r8.put(r5, r15)     // Catch:{ Throwable -> 0x0601 }
        L_0x05ce:
            java.lang.String r5 = "app_region"
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0601 }
            r6 = 0
            long r16 = r16 - r9
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ Throwable -> 0x0601 }
            r7.put(r5, r6)     // Catch:{ Throwable -> 0x0601 }
            android.content.SharedPreferences$Editor r5 = r3.edit()     // Catch:{ Throwable -> 0x0601 }
            if (r13 == 0) goto L_0x05e9
            java.lang.String r6 = "google_aid"
            r5.putString(r6, r0)     // Catch:{ Throwable -> 0x0601 }
        L_0x05e9:
            if (r2 == 0) goto L_0x05f0
            java.lang.String r0 = "app_language"
            r5.putString(r0, r14)     // Catch:{ Throwable -> 0x0601 }
        L_0x05f0:
            if (r4 == 0) goto L_0x05f7
            java.lang.String r0 = "app_region"
            r5.putString(r0, r15)     // Catch:{ Throwable -> 0x0601 }
        L_0x05f7:
            if (r2 != 0) goto L_0x05fd
            if (r4 != 0) goto L_0x05fd
            if (r13 == 0) goto L_0x0609
        L_0x05fd:
            r5.commit()     // Catch:{ Throwable -> 0x0601 }
            goto L_0x0609
        L_0x0601:
            r0 = move-exception
            goto L_0x0606
        L_0x0603:
            r0 = move-exception
            r19 = r5
        L_0x0606:
            m20974a(r0)
        L_0x0609:
            if (r12 == 0) goto L_0x0619
            android.content.SharedPreferences$Editor r0 = r3.edit()
            java.lang.String r2 = "mac_addr"
            java.lang.String r4 = f19306h
            r0.putString(r2, r4)
            r0.commit()
        L_0x0619:
            long r4 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "app_track"
            java.lang.String r2 = ""
            java.lang.String r0 = r3.getString(r0, r2)
            f19314p = r0
            java.lang.String r0 = f19314p     // Catch:{ Throwable -> 0x063c }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x063c }
            if (r0 != 0) goto L_0x0640
            java.lang.String r0 = "app_track"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x063c }
            java.lang.String r3 = f19314p     // Catch:{ Throwable -> 0x063c }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x063c }
            r8.put(r0, r2)     // Catch:{ Throwable -> 0x063c }
            goto L_0x0640
        L_0x063c:
            r0 = move-exception
            m20974a(r0)
        L_0x0640:
            java.lang.String r0 = "app_track"
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r7.put(r0, r2)
            com.ss.android.deviceregister.b.b r0 = f19316r
            if (r0 == 0) goto L_0x075c
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            com.ss.android.deviceregister.b.b r0 = f19316r     // Catch:{ Exception -> 0x0758 }
            java.lang.String r0 = r0.mo16584b()     // Catch:{ Exception -> 0x0758 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0758 }
            if (r4 != 0) goto L_0x0667
            java.lang.String r4 = "device_id"
            r8.put(r4, r0)     // Catch:{ Exception -> 0x0758 }
        L_0x0667:
            java.lang.String r0 = "device_id"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0758 }
            r7.put(r0, r2)     // Catch:{ Exception -> 0x0758 }
            com.ss.android.deviceregister.b.b r0 = f19316r     // Catch:{ Exception -> 0x0758 }
            java.lang.String r0 = r0.mo16585d()     // Catch:{ Exception -> 0x0758 }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0758 }
            if (r2 != 0) goto L_0x0687
            java.lang.String r2 = "openudid"
            r8.put(r2, r0)     // Catch:{ Exception -> 0x0758 }
        L_0x0687:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            com.ss.android.deviceregister.b.b r0 = f19316r     // Catch:{ Exception -> 0x0758 }
            java.lang.String r0 = r0.f19348p     // Catch:{ Exception -> 0x0758 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0758 }
            if (r4 != 0) goto L_0x069a
            java.lang.String r4 = "install_id"
            r8.put(r4, r0)     // Catch:{ Exception -> 0x0758 }
        L_0x069a:
            java.lang.String r0 = "install_id"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0758 }
            r7.put(r0, r2)     // Catch:{ Exception -> 0x0758 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            com.ss.android.deviceregister.b.b r0 = f19316r     // Catch:{ Exception -> 0x0758 }
            java.lang.String r0 = r0.mo16586e()     // Catch:{ Exception -> 0x0758 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0758 }
            if (r4 != 0) goto L_0x06be
            java.lang.String r4 = "udid"
            r8.put(r4, r0)     // Catch:{ Exception -> 0x0758 }
        L_0x06be:
            java.lang.String r0 = "udid"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0758 }
            r7.put(r0, r2)     // Catch:{ Exception -> 0x0758 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            com.ss.android.deviceregister.b.b r0 = f19316r     // Catch:{ Exception -> 0x0758 }
            java.lang.String r0 = r0.mo16587f()     // Catch:{ Exception -> 0x0758 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0758 }
            if (r4 != 0) goto L_0x06e2
            java.lang.String r4 = "clientudid"
            r8.put(r4, r0)     // Catch:{ Exception -> 0x0758 }
        L_0x06e2:
            java.lang.String r0 = "clientudid"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0758 }
            r7.put(r0, r2)     // Catch:{ Exception -> 0x0758 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            com.ss.android.deviceregister.b.b r0 = f19316r     // Catch:{ Exception -> 0x0758 }
            java.lang.String r0 = r0.mo16589h()     // Catch:{ Exception -> 0x0758 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0758 }
            if (r4 != 0) goto L_0x0706
            java.lang.String r4 = "serial_number"
            r8.put(r4, r0)     // Catch:{ Exception -> 0x0758 }
        L_0x0706:
            java.lang.String r0 = "serial_number"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0758 }
            r7.put(r0, r2)     // Catch:{ Exception -> 0x0758 }
            boolean r0 = m20992h()     // Catch:{ Exception -> 0x0758 }
            if (r0 == 0) goto L_0x075c
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            com.ss.android.deviceregister.b.b r0 = f19316r     // Catch:{ Exception -> 0x0758 }
            java.lang.String[] r0 = r0.mo16588g()     // Catch:{ Exception -> 0x0758 }
            if (r0 == 0) goto L_0x0748
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x0758 }
            r4.<init>()     // Catch:{ Exception -> 0x0758 }
            int r5 = r0.length     // Catch:{ Exception -> 0x0758 }
            r6 = 0
        L_0x072e:
            if (r6 >= r5) goto L_0x0743
            r9 = r0[r6]     // Catch:{ Exception -> 0x0758 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0740 }
            r10.<init>()     // Catch:{ JSONException -> 0x0740 }
            java.lang.String r11 = "sim_serial_number"
            org.json.JSONObject r9 = r10.put(r11, r9)     // Catch:{ JSONException -> 0x0740 }
            r4.put(r9)     // Catch:{ JSONException -> 0x0740 }
        L_0x0740:
            int r6 = r6 + 1
            goto L_0x072e
        L_0x0743:
            java.lang.String r0 = "sim_serial_number"
            r8.put(r0, r4)     // Catch:{ Exception -> 0x0758 }
        L_0x0748:
            java.lang.String r0 = "sim_serial_number"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0758 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0758 }
            r7.put(r0, r2)     // Catch:{ Exception -> 0x0758 }
            goto L_0x075c
        L_0x0758:
            r0 = move-exception
            m20974a(r0)
        L_0x075c:
            long r2 = android.os.SystemClock.uptimeMillis()
            boolean r0 = com.p280ss.android.deviceregister.C6789d.m21085e(r21)
            if (r0 == 0) goto L_0x076e
            java.lang.String r0 = "new_user_mode"
            r4 = 1
            r8.put(r0, r4)     // Catch:{ JSONException -> 0x076d }
            goto L_0x076e
        L_0x076d:
        L_0x076e:
            java.lang.String r0 = "new_user_mode"
            long r4 = android.os.SystemClock.uptimeMillis()
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.put(r0, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = f19320v
            if (r0 == 0) goto L_0x07ac
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = f19320v
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x078a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x07ac
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()     // Catch:{ JSONException -> 0x07aa }
            if (r3 == 0) goto L_0x078a
            java.lang.Object r3 = r2.getKey()     // Catch:{ JSONException -> 0x07aa }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x07aa }
            java.lang.Object r2 = r2.getValue()     // Catch:{ JSONException -> 0x07aa }
            r8.put(r3, r2)     // Catch:{ JSONException -> 0x07aa }
            goto L_0x078a
        L_0x07aa:
            goto L_0x078a
        L_0x07ac:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x0868 }
            java.lang.String r0 = r0.getCountry()     // Catch:{ Throwable -> 0x0868 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x0868 }
            if (r4 != 0) goto L_0x07c3
            java.lang.String r4 = "region"
            r8.put(r4, r0)     // Catch:{ Throwable -> 0x0868 }
        L_0x07c3:
            java.lang.String r0 = "region"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x0868 }
            r7.put(r0, r2)     // Catch:{ Throwable -> 0x0868 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x0868 }
            java.util.TimeZone r0 = r0.getTimeZone()     // Catch:{ Throwable -> 0x0868 }
            java.lang.String r0 = r0.getID()     // Catch:{ Throwable -> 0x0868 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x0868 }
            if (r4 != 0) goto L_0x07ed
            java.lang.String r4 = "tz_name"
            r8.put(r4, r0)     // Catch:{ Throwable -> 0x0868 }
        L_0x07ed:
            java.lang.String r0 = "tz_name"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x0868 }
            r7.put(r0, r2)     // Catch:{ Throwable -> 0x0868 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x0868 }
            java.util.TimeZone r0 = r0.getTimeZone()     // Catch:{ Throwable -> 0x0868 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0868 }
            int r0 = r0.getOffset(r4)     // Catch:{ Throwable -> 0x0868 }
            int r0 = r0 / 1000
            java.lang.String r4 = "tz_offset"
            r8.put(r4, r0)     // Catch:{ Throwable -> 0x0868 }
            java.lang.String r0 = "tz_offset"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            r6 = 0
            long r4 = r4 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x0868 }
            r7.put(r0, r2)     // Catch:{ Throwable -> 0x0868 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Throwable -> 0x0868 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Throwable -> 0x0868 }
            java.lang.String r0 = r0.getSimCountryIso()     // Catch:{ Throwable -> 0x0868 }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x0868 }
            if (r1 != 0) goto L_0x0841
            java.lang.String r1 = "sim_region"
            r8.put(r1, r0)     // Catch:{ Throwable -> 0x0868 }
        L_0x0841:
            java.lang.String r0 = "sim_region"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            r1 = 0
            long r4 = r4 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x0868 }
            r7.put(r0, r1)     // Catch:{ Throwable -> 0x0868 }
            java.lang.String r0 = "header_all"
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0868 }
            r3 = 0
            long r1 = r1 - r19
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Throwable -> 0x0868 }
            r7.put(r0, r1)     // Catch:{ Throwable -> 0x0868 }
            com.ss.android.deviceregister.k r0 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Throwable -> 0x0868 }
            r0.mo16602a(r7)     // Catch:{ Throwable -> 0x0868 }
            goto L_0x086c
        L_0x0868:
            r0 = move-exception
            m20974a(r0)
        L_0x086c:
            java.lang.Object r1 = f19315q
            monitor-enter(r1)
            f19310l = r8     // Catch:{ all -> 0x0879 }
            r2 = r22
            m20976a(r8, r2)     // Catch:{ all -> 0x0879 }
            monitor-exit(r1)     // Catch:{ all -> 0x0879 }
            r1 = 1
            return r1
        L_0x0879:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0879 }
            throw r0
        L_0x087c:
            r0 = move-exception
            m20974a(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.p289a.C6781d.m20978a(android.content.Context, org.json.JSONObject):boolean");
    }

    /* renamed from: a */
    private static void m20976a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                jSONObject2.put(str, jSONObject.opt(str));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m20977a(boolean z) {
        f19318t = z;
        if (f19310l != null) {
            synchronized (f19315q) {
                m20975a(f19310l);
            }
        }
    }

    /* renamed from: a */
    public static void m20975a(JSONObject jSONObject) {
        if (jSONObject != null && !m20992h()) {
            try {
                jSONObject.remove("sim_serial_number");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static boolean m20992h() {
        if (!f19318t) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static int m20988e() {
        if (f19303e <= 0 && f19300b != null) {
            f19303e = f19300b.mo16344k();
        }
        return f19303e;
    }

    /* renamed from: e */
    public static void m20989e(String str) {
        f19307i = str;
    }

    /* renamed from: a */
    public static void m20967a(int i) {
        f19304f = i;
    }

    /* renamed from: b */
    public static void m20983b(String str) {
        f19305g = str;
    }

    /* renamed from: c */
    public static void m20985c(String str) {
        f19302d = str;
    }

    /* renamed from: d */
    public static void m20987d(String str) {
        f19299a = str;
    }

    /* renamed from: a */
    public static void m20969a(C6730a aVar) {
        f19300b = aVar;
    }

    /* renamed from: a */
    public static void m20970a(C6780c cVar) {
        f19317s = cVar;
    }

    /* renamed from: b */
    public static String m20980b(Context context) {
        if (C6319n.m19593a(f19312n)) {
            f19312n = C6778a.m20959a(context).getString("user_agent", null);
        }
        return f19312n;
    }

    /* renamed from: a */
    public static String m20966a(Context context) {
        if (C6319n.m19593a(f19311m) && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (!(packageInfo == null || packageInfo.signatures == null)) {
                    if (packageInfo.signatures.length > 0) {
                        Signature signature = packageInfo.signatures[0];
                        if (signature == null) {
                            return f19311m;
                        }
                        f19311m = C6306c.m19564b(signature.toByteArray());
                    }
                }
                return f19311m;
            } catch (Exception unused) {
            }
        }
        return f19311m;
    }

    /* renamed from: a */
    public static void m20971a(C6786b bVar) {
        f19316r = bVar;
    }

    /* renamed from: a */
    public static void m20972a(String str) {
        f19319u = str;
    }

    /* renamed from: a */
    private static void m20974a(Throwable th) {
        if (f19300b != null) {
            C6780c cVar = f19317s;
            Context d = f19300b.mo16337d();
            if (cVar != null) {
                String stackTraceString = Log.getStackTraceString(th);
                if (!C6319n.m19593a(stackTraceString)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("stack", stackTraceString);
                    } catch (JSONException unused) {
                    }
                    cVar.onDeviceRegisterEvent(d, "umeng", "device_register", "error", 0, 0, jSONObject);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m20982b(Context context, JSONObject jSONObject) {
        String a = m20966a(context);
        if (a != null) {
            try {
                jSONObject.put("sig_hash", a);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m20981b(Context context, String str) {
        try {
            Editor edit = C6778a.m20959a(context).edit();
            edit.putString("app_track", str);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m20968a(Context context, String str) {
        if (!C6319n.m19593a(str) && !str.equals(f19312n)) {
            f19312n = str;
            Editor edit = C6778a.m20959a(context).edit();
            edit.putString("user_agent", str);
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m20973a(String str, Object obj) {
        if (str != null && obj != null) {
            if (f19320v == null) {
                f19320v = new ConcurrentHashMap<>();
            }
            f19320v.put(str, obj);
        }
    }
}
