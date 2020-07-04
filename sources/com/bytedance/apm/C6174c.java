package com.bytedance.apm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.core.C6176a;
import com.bytedance.apm.core.C6177b;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.apm.util.C6290a;
import com.bytedance.services.apm.api.C6477b;
import com.bytedance.services.apm.api.IHttpService;
import com.p280ss.android.common.util.C6776h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c */
public final class C6174c {

    /* renamed from: a */
    private static Context f18154a;

    /* renamed from: b */
    private static boolean f18155b;

    /* renamed from: c */
    private static JSONObject f18156c = new JSONObject();

    /* renamed from: d */
    private static C6177b f18157d = new C6176a();

    /* renamed from: e */
    private static Map<String, String> f18158e = Collections.emptyMap();

    /* renamed from: f */
    private static IHttpService f18159f = new DefaultHttpServiceImpl();

    /* renamed from: g */
    private static long f18160g = -1;

    /* renamed from: h */
    private static volatile int f18161h = -1;

    /* renamed from: i */
    private static boolean f18162i = false;

    /* renamed from: j */
    private static boolean f18163j;

    /* renamed from: k */
    private static long f18164k;

    /* renamed from: l */
    private static long f18165l;

    /* renamed from: m */
    private static long f18166m;

    /* renamed from: n */
    private static String f18167n;

    /* renamed from: o */
    private static boolean f18168o;

    /* renamed from: a */
    public static Context m19129a() {
        return f18154a;
    }

    /* renamed from: d */
    public static boolean m19146d() {
        return f18162i;
    }

    /* renamed from: f */
    public static int m19148f() {
        return f18161h;
    }

    /* renamed from: g */
    public static boolean m19149g() {
        return f18155b;
    }

    /* renamed from: j */
    public static JSONObject m19152j() {
        return f18156c;
    }

    /* renamed from: k */
    public static C6177b m19153k() {
        return f18157d;
    }

    /* renamed from: l */
    public static long m19154l() {
        return f18166m;
    }

    /* renamed from: m */
    public static long m19155m() {
        return f18164k;
    }

    /* renamed from: a */
    public static void m19139a(boolean z) {
        f18155b = z;
    }

    /* renamed from: a */
    public static boolean m19140a(String str, String str2) {
        if (f18156c == null) {
            return false;
        }
        try {
            f18156c.put(str, str2);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static synchronized Map<String, String> m19151i() {
        Map<String, String> map;
        synchronized (C6174c.class) {
            map = f18158e;
        }
        return map;
    }

    /* renamed from: b */
    public static String m19141b() {
        if (TextUtils.isEmpty(f18167n)) {
            f18167n = C6776h.m20949c(f18154a);
        }
        return f18167n;
    }

    /* renamed from: e */
    public static long m19147e() {
        if (f18160g == -1) {
            f18160g = System.currentTimeMillis();
        }
        return f18160g;
    }

    /* renamed from: h */
    public static boolean m19150h() {
        if (f18156c == null || f18156c.optString("channel") == null) {
            return false;
        }
        return f18156c.optString("channel").contains("local");
    }

    /* renamed from: c */
    public static boolean m19145c() {
        boolean z = true;
        if (f18168o) {
            return true;
        }
        String b = m19141b();
        if ((b != null && b.contains(":")) || b == null || !b.equals(f18154a.getPackageName())) {
            z = false;
        }
        f18168o = z;
        return z;
    }

    /* renamed from: b */
    public static void m19142b(long j) {
        f18166m = j;
    }

    /* renamed from: b */
    public static void m19143b(boolean z) {
        f18163j = z;
    }

    /* renamed from: a */
    public static void m19132a(int i) {
        f18161h = i;
    }

    /* renamed from: c */
    public static void m19144c(long j) {
        if (j > 0) {
            if (f18164k == 0 || j < f18164k) {
                f18164k = j;
            }
        }
    }

    /* renamed from: a */
    public static void m19133a(long j) {
        f18165l = j;
    }

    /* renamed from: a */
    public static void m19134a(Context context) {
        if (context != null) {
            f18154a = C6290a.m19516a(context);
        }
    }

    /* renamed from: a */
    public static synchronized void m19135a(C6177b bVar) {
        synchronized (C6174c.class) {
            f18157d = bVar;
            Map<String, String> a = bVar.mo14885a();
            f18158e = a;
            if (a == null) {
                f18158e = new HashMap();
            }
            if (!f18158e.containsKey("aid")) {
                f18158e.put("aid", f18156c.optString("aid"));
            }
            if (!f18158e.containsKey("device_id")) {
                f18158e.put("device_id", f18156c.optString("device_id"));
            }
            if (!f18158e.containsKey("device_platform")) {
                f18158e.put("device_platform", "android");
            }
            if (!f18158e.containsKey("update_version_code")) {
                f18158e.put("update_version_code", f18156c.optString("update_version_code"));
            }
            if (!f18158e.containsKey("version_code")) {
                f18158e.put("version_code", f18156c.optString("version_code"));
            }
            if (!f18158e.containsKey("channel")) {
                f18158e.put("channel", f18156c.optString("channel"));
            }
        }
    }

    /* renamed from: a */
    public static void m19136a(IHttpService iHttpService) {
        if (iHttpService != null) {
            f18159f = iHttpService;
        }
    }

    /* renamed from: a */
    public static void m19137a(String str) {
        f18167n = str;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00eb */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m19138a(org.json.JSONObject r5) {
        /*
            java.lang.Class<com.bytedance.apm.c> r0 = com.bytedance.apm.C6174c.class
            monitor-enter(r0)
            java.lang.String r1 = "os"
            java.lang.String r2 = "Android"
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "device_platform"
            java.lang.String r2 = "android"
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "os_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "os_api"
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "device_model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "device_brand"
            java.lang.String r2 = android.os.Build.BRAND     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "device_manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "process_name"
            android.content.Context r2 = m19129a()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r2 = com.p280ss.android.common.util.C6776h.m20949c(r2)     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "sid"
            long r2 = m19147e()     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            r1 = 0
            java.lang.String r2 = "version_name"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x00eb }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00eb }
            r3 = 0
            if (r2 == 0) goto L_0x0073
            android.content.Context r1 = m19129a()     // Catch:{ Exception -> 0x00eb }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x00eb }
            android.content.Context r2 = m19129a()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x00eb }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r2 = "version_name"
            java.lang.String r4 = r1.versionName     // Catch:{ Exception -> 0x00eb }
            r5.put(r2, r4)     // Catch:{ Exception -> 0x00eb }
        L_0x0073:
            java.lang.String r2 = "app_version"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x00eb }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00eb }
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = "app_version"
            java.lang.String r4 = "version_name"
            java.lang.String r4 = r5.optString(r4)     // Catch:{ Exception -> 0x00eb }
            r5.put(r2, r4)     // Catch:{ Exception -> 0x00eb }
        L_0x008a:
            java.lang.String r2 = "version_code"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x00eb }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00eb }
            if (r2 == 0) goto L_0x00b3
            if (r1 != 0) goto L_0x00ac
            android.content.Context r1 = m19129a()     // Catch:{ Exception -> 0x00eb }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x00eb }
            android.content.Context r2 = m19129a()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x00eb }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ Exception -> 0x00eb }
        L_0x00ac:
            java.lang.String r2 = "version_code"
            int r1 = r1.versionCode     // Catch:{ Exception -> 0x00eb }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x00eb }
        L_0x00b3:
            java.lang.String r1 = "package"
            java.lang.String r1 = r5.optString(r1)     // Catch:{ Exception -> 0x00eb }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x00cc
            java.lang.String r1 = "package"
            android.content.Context r2 = m19129a()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
        L_0x00cc:
            java.lang.String r1 = "region"
            boolean r1 = r5.isNull(r1)     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x00e1
            java.lang.String r1 = "region"
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r2 = r2.getCountry()     // Catch:{ Exception -> 0x00eb }
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
        L_0x00e1:
            java.lang.String r1 = "monitor_version"
            java.lang.String r2 = "5.0.5.21"
            r5.put(r1, r2)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00eb
        L_0x00e9:
            r5 = move-exception
            goto L_0x00ef
        L_0x00eb:
            f18156c = r5     // Catch:{ all -> 0x00e9 }
            monitor-exit(r0)
            return
        L_0x00ef:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.C6174c.m19138a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public static C6477b m19130a(String str, Map<String, String> map) throws Exception {
        return f18159f.doGet(str, map);
    }

    /* renamed from: a */
    public static C6477b m19131a(String str, byte[] bArr, Map<String, String> map) throws Exception {
        return f18159f.doPost(str, bArr, map);
    }
}
