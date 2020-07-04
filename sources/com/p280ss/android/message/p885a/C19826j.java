package com.p280ss.android.message.p885a;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.reflect.C6322b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.message.a.j */
public final class C19826j {

    /* renamed from: a */
    public static boolean f53791a;

    /* renamed from: b */
    public static boolean f53792b;

    /* renamed from: c */
    private static String f53793c;

    /* renamed from: a */
    public static boolean m65469a() {
        if (Build.DISPLAY.indexOf("Flyme") >= 0 || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m65476d() {
        if (VERSION.SDK_INT >= 21) {
            return C19827k.m65481a("ro.build.version.emui");
        }
        return m65477e();
    }

    /* renamed from: f */
    private static boolean m65478f() {
        if (!f53792b) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f53791a = true;
                    f53792b = true;
                    return f53791a;
                }
            } catch (Exception unused) {
            }
            f53792b = true;
        }
        return f53791a;
    }

    /* renamed from: c */
    private static boolean m65473c() {
        try {
            if ((C6319n.m19593a(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) && (C6319n.m19593a(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static String m65477e() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[]{"ro.build.version.emui"});
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: g */
    private static boolean m65479g() {
        if (!"angler".equals(Build.BOARD) || Build.MODEL == null || !Build.MODEL.toLowerCase().contains("nexus") || !Build.MODEL.toLowerCase().contains("6p")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m65470b() {
        StringBuilder sb = new StringBuilder();
        try {
            if (m65478f()) {
                sb.append("MIUI-");
            } else if (m65469a()) {
                sb.append("FLYME-");
            } else {
                String d = m65476d();
                if (m65472b(d) && !m65479g()) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(d)) {
                    sb.append(d);
                    sb.append("-");
                }
            }
            sb.append(VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m65468a(String str) {
        f53793c = str;
    }

    /* renamed from: c */
    public static boolean m65474c(Context context) {
        String a = C19827k.m65480a(context);
        if ((a == null || !a.contains(":")) && a != null && a.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m65472b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m65476d();
        }
        if ((TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("emotionui")) && !m65473c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m65465a(Context context) {
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("user");
        if (systemService == null) {
            return null;
        }
        try {
            Object invoke = Process.class.getMethod("myUserHandle", null).invoke(Process.class, null);
            return String.valueOf(((Long) systemService.getClass().getMethod("getSerialNumberForUser", new Class[]{invoke.getClass()}).invoke(systemService, new Object[]{invoke})).longValue());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m65471b(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setDataAndType(Uri.parse("http://"), null);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65568);
            if (queryIntentActivities.size() > 0) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo != null && resolveInfo.activityInfo != null && "com.android.browser".equals(resolveInfo.activityInfo.packageName)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(resolveInfo.activityInfo.packageName);
                        sb.append("/");
                        sb.append(resolveInfo.activityInfo.name);
                        return sb.toString();
                    }
                }
                ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(0);
                if (!(resolveInfo2 == null || resolveInfo2.activityInfo == null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(resolveInfo2.activityInfo.packageName);
                    sb2.append("/");
                    sb2.append(resolveInfo2.activityInfo.name);
                    return sb2.toString();
                }
            }
        } catch (Exception unused) {
        }
        return "com.android.browser/com.android.browser.BrowserActivity";
    }

    /* renamed from: d */
    public static int m65475d(Context context) {
        if (context == null) {
            return -1;
        }
        if (VERSION.SDK_INT >= 24) {
            try {
                if (((Boolean) C6322b.m19610a((Object) (NotificationManager) context.getSystemService("notification")).mo15160b("areNotificationsEnabled").f18556a).booleanValue()) {
                    return 1;
                }
                return 0;
            } catch (Exception unused) {
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            C6322b a = C6322b.m19610a((Object) appOpsManager);
            if (((Integer) a.mo15158a("checkOpNoThrow", (Class<?>[]) new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(((Integer) a.mo15161b("OP_POST_NOTIFICATION", Integer.TYPE).f18556a).intValue()), Integer.valueOf(i), packageName).f18556a).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m65466a(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(NetworkUtils.m19541a(list, "UTF-8"));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m65467a(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        return m65466a(str, (List<Pair<String, String>>) arrayList);
    }
}
