package com.bytedance.crash.p497f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p501j.C9957i;
import com.bytedance.crash.p504l.C9978d;
import com.bytedance.crash.p504l.C9993n;
import com.bytedance.crash.p504l.C9997q;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.f.c */
public final class C9898c {

    /* renamed from: b */
    private static final String[] f26988b = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d */
    private static String f26989d;

    /* renamed from: e */
    private static int f26990e = -1;

    /* renamed from: f */
    private static int f26991f = -1;

    /* renamed from: a */
    public JSONObject f26992a = new JSONObject();

    /* renamed from: c */
    private Context f26993c;

    /* renamed from: b */
    public static boolean m29254b() {
        if (f26991f == -1) {
            f26991f = m29255c().contains("86") ? 1 : 0;
        }
        if (f26991f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m29257d() {
        String str = VERSION.RELEASE;
        if (str.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m29252a() {
        if (f26990e == -1) {
            f26990e = m29255c().contains("64") ? 1 : 0;
        }
        if (f26990e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static String m29255c() {
        if (f26989d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                    sb = new StringBuilder(Build.CPU_ABI);
                } else {
                    for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(Build.SUPPORTED_ABIS[i]);
                        if (i != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f26989d = "unknown";
                }
                f26989d = sb.toString();
            } catch (Exception unused) {
                f26989d = "unknown";
            }
        }
        return f26989d;
    }

    /* renamed from: d */
    public static String m29258d(JSONObject jSONObject) {
        return jSONObject.optString("dex_err_manifest", null);
    }

    public C9898c(Context context) {
        this.f26993c = context;
    }

    /* renamed from: a */
    public static C9898c m29248a(Context context) {
        C9898c cVar = new C9898c(context);
        m29261g(cVar.f26992a);
        return cVar;
    }

    /* renamed from: b */
    public static void m29253b(C9898c cVar) {
        if (cVar != null) {
            m29251a(cVar.f26992a);
        }
    }

    /* renamed from: c */
    public static boolean m29256c(JSONObject jSONObject) {
        if (jSONObject.optInt("unauthentic_version", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static void m29261g(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk_version", 3120);
            jSONObject.put("sdk_version_name", "3.1.2-rc.0-oversea");
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    private void m29265k(JSONObject jSONObject) {
        try {
            jSONObject.put("access", C9993n.m29620a(this.f26993c));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static C9898c m29250a(C9898c cVar) {
        JSONObject jSONObject = cVar.f26992a;
        cVar.m29265k(jSONObject);
        cVar.m29266l(jSONObject);
        return cVar;
    }

    /* renamed from: e */
    public static boolean m29259e(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0 || ((jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m29260f(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        String optString = jSONObject.optString("aid");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        try {
            if (Integer.parseInt(optString) <= 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: l */
    private void m29266l(JSONObject jSONObject) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f26993c.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (!TextUtils.isEmpty(networkOperator)) {
                    jSONObject.put("mcc_mnc", networkOperator);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final JSONObject mo24510b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f26992a;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                this.f26992a.put(str, jSONObject.opt(str));
            } catch (JSONException unused) {
            }
        }
        return this.f26992a;
    }

    /* renamed from: h */
    private static void m29262h(JSONObject jSONObject) {
        String str;
        try {
            DisplayMetrics displayMetrics = C9918j.m29342g().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            if (i == 120) {
                str = "ldpi";
            } else if (i == 240) {
                str = "hdpi";
            } else if (i != 320) {
                str = "mdpi";
            } else {
                str = "xhdpi";
            }
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            sb.append("x");
            sb.append(displayMetrics.widthPixels);
            jSONObject.put("resolution", sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private static void m29263i(JSONObject jSONObject) {
        try {
            String language = C9918j.m29342g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            String country = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country)) {
                jSONObject.put("region", country);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    private static void m29264j(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        try {
            if (C9978d.m29525b()) {
                sb.append("MIUI-");
            } else if (C9978d.m29527c()) {
                sb.append("FLYME-");
            } else {
                String a = C9978d.m29522a();
                if (C9978d.m29523a(a)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    sb.append("-");
                }
            }
            sb.append(VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", C9997q.m29628a());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m29251a(JSONObject jSONObject) {
        if (jSONObject != null) {
            m29264j(jSONObject);
            m29262h(jSONObject);
            m29263i(jSONObject);
            try {
                jSONObject.put("os", "Android");
                jSONObject.put("device_id", C9918j.m29338c().mo24593a());
                jSONObject.put("os_version", m29257d());
                jSONObject.put("os_api", VERSION.SDK_INT);
                String str = Build.MODEL;
                String str2 = Build.BRAND;
                if (str == null) {
                    str = str2;
                } else if (str2 != null && !str.contains(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(' ');
                    sb.append(str);
                    str = sb.toString();
                }
                jSONObject.put("device_model", str);
                jSONObject.put("device_brand", Build.BRAND);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put("cpu_abi", m29255c());
                Context g = C9918j.m29342g();
                String packageName = g.getPackageName();
                jSONObject.put("package", packageName);
                PackageInfo packageInfo = g.getPackageManager().getPackageInfo(packageName, 0);
                if (packageInfo.applicationInfo != null) {
                    int i = packageInfo.applicationInfo.labelRes;
                    if (i > 0) {
                        jSONObject.put("display_name", g.getString(i));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo24507a(long j) {
        if (j > 0) {
            try {
                this.f26992a.put("user_id", j);
            } catch (JSONException unused) {
            }
        }
        return this.f26992a;
    }

    /* renamed from: a */
    public final JSONObject mo24508a(String str) {
        try {
            this.f26992a.put("device_id", str);
        } catch (JSONException unused) {
        }
        return this.f26992a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0057 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo24509a(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0005
            org.json.JSONObject r7 = r6.f26992a     // Catch:{ Throwable -> 0x00c0 }
            return r7
        L_0x0005:
            java.util.Set r0 = r7.entrySet()     // Catch:{ Throwable -> 0x00c0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x00c0 }
        L_0x000d:
            boolean r1 = r0.hasNext()     // Catch:{ Throwable -> 0x00c0 }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()     // Catch:{ Throwable -> 0x00c0 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Throwable -> 0x00c0 }
            org.json.JSONObject r2 = r6.f26992a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x00c0 }
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x00c0 }
            if (r2 != 0) goto L_0x000d
            org.json.JSONObject r2 = r6.f26992a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x00c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Throwable -> 0x00c0 }
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x00c0 }
            goto L_0x000d
        L_0x0037:
            java.lang.String[] r0 = f26988b     // Catch:{ Throwable -> 0x00c0 }
            int r1 = r0.length     // Catch:{ Throwable -> 0x00c0 }
            r2 = 0
        L_0x003b:
            if (r2 >= r1) goto L_0x0063
            r3 = r0[r2]     // Catch:{ Throwable -> 0x00c0 }
            boolean r4 = r7.containsKey(r3)     // Catch:{ Throwable -> 0x00c0 }
            if (r4 == 0) goto L_0x0060
            java.lang.Object r4 = r7.get(r3)     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0057 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Throwable -> 0x0057 }
            org.json.JSONObject r5 = r6.f26992a     // Catch:{ Throwable -> 0x0057 }
            r5.put(r3, r4)     // Catch:{ Throwable -> 0x0057 }
            goto L_0x0060
        L_0x0057:
            org.json.JSONObject r4 = r6.f26992a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.Object r5 = r7.get(r3)     // Catch:{ Throwable -> 0x00c0 }
            r4.put(r3, r5)     // Catch:{ Throwable -> 0x00c0 }
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0063:
            java.lang.String r0 = "version_code"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00c0 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "manifest_version_code"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00c0 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = "version_code"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x0088 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0088 }
            org.json.JSONObject r1 = r6.f26992a     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r2 = "manifest_version_code"
            r1.put(r2, r0)     // Catch:{ Throwable -> 0x0088 }
        L_0x0088:
            java.lang.String r0 = "iid"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00c0 }
            if (r0 == 0) goto L_0x00a4
            org.json.JSONObject r0 = r6.f26992a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r1 = "udid"
            java.lang.String r2 = "iid"
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Throwable -> 0x00c0 }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00c0 }
            org.json.JSONObject r0 = r6.f26992a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r1 = "iid"
            r0.remove(r1)     // Catch:{ Throwable -> 0x00c0 }
        L_0x00a4:
            java.lang.String r0 = "version_name"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00c0 }
            if (r0 == 0) goto L_0x00c0
            org.json.JSONObject r0 = r6.f26992a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r1 = "app_version"
            java.lang.String r2 = "version_name"
            java.lang.Object r7 = r7.get(r2)     // Catch:{ Throwable -> 0x00c0 }
            r0.put(r1, r7)     // Catch:{ Throwable -> 0x00c0 }
            org.json.JSONObject r7 = r6.f26992a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r0 = "version_name"
            r7.remove(r0)     // Catch:{ Throwable -> 0x00c0 }
        L_0x00c0:
            org.json.JSONObject r7 = r6.f26992a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p497f.C9898c.mo24509a(java.util.Map):org.json.JSONObject");
    }

    /* renamed from: a */
    public static C9898c m29249a(Context context, long j) {
        C9898c cVar;
        C9957i a = C9957i.m29466a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject a2 = a.mo24583a(j);
        if (a2 == null || a2.length() == 0) {
            cVar = m29248a(C9918j.m29342g());
            cVar.mo24509a(C9918j.m29332a().mo24525a());
            try {
                cVar.f26992a.put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            cVar = new C9898c(C9918j.m29342g());
        }
        m29253b(cVar);
        cVar.mo24510b(a2);
        return cVar;
    }
}
