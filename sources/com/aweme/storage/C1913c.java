package com.aweme.storage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import bolts.C1592h;
import com.aweme.storage.C1935n.C1936a;
import com.bytedance.storage.C12919b;
import com.bytedance.storage.C12920c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.aweme.storage.c */
public final class C1913c {

    /* renamed from: a */
    public static volatile boolean f6918a;

    /* renamed from: b */
    private static volatile boolean f6919b;

    /* renamed from: c */
    private static boolean f6920c;

    /* renamed from: d */
    private static C1908a f6921d;

    /* renamed from: e */
    private static C1925h f6922e;

    /* renamed from: f */
    private static List<C1935n> f6923f;

    /* renamed from: g */
    private static C1924g f6924g;

    /* renamed from: h */
    private static long f6925h;

    /* renamed from: i */
    private static C1926i f6926i;

    /* renamed from: a */
    private static boolean m8859a(File file) {
        if (file == null) {
            return false;
        }
        long j = 50;
        if (f6921d != null && f6921d.f6905h > 0) {
            j = (long) f6921d.f6905h;
        }
        if (file.length() > j * 1024 * 1024) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m8860b() {
        if (f6923f != null && !f6923f.isEmpty()) {
            for (C1935n nVar : f6923f) {
                if (nVar != null) {
                    nVar.mo7553a();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m8852a() {
        Set set;
        String[] strArr;
        C1908a aVar = f6921d;
        if (aVar != null && aVar.f6899b != null && aVar.f6899b.length > 0) {
            if (f6922e == null) {
                set = null;
            } else {
                set = f6922e.mo7545a();
            }
            for (String str : aVar.f6899b) {
                if (set != null && !set.contains(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isFile()) {
                            file.delete();
                        } else {
                            C1921e.m8895b(file);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m8857a(String str) {
        new StringBuilder("checkSpace ").append(str);
    }

    /* renamed from: b */
    public static void m8861b(Context context) {
        if (context != null && !f6918a) {
            final Context applicationContext = context.getApplicationContext();
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    C1913c.m8863d(applicationContext);
                    return null;
                }
            }, (Executor) C7258h.m22730c());
        }
    }

    /* renamed from: e */
    static void m8864e(Context context) {
        if (f6922e != null) {
            f6922e.mo7546a(m8867h(context));
        }
        m8852a();
        if (f6922e != null && f6922e.mo7547b()) {
            m8869j(context);
        }
    }

    /* renamed from: f */
    static void m8865f(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    if (applicationContext == null) {
                        return null;
                    }
                    C7285c.m22838a(applicationContext, "clean_storage_pref", 0).edit().putLong("key_clean_date", System.currentTimeMillis()).commit();
                    C1913c.f6918a = false;
                    return null;
                }
            }, (Executor) C7258h.m22730c());
        }
    }

    /* renamed from: h */
    private static boolean m8867h(Context context) {
        if (f6926i != null && f6926i.f6949g && C1921e.m8890a(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m8853a(Context context) {
        new StringBuilder("startClean ").append(f6918a);
        if (!f6918a) {
            final Context applicationContext = context.getApplicationContext();
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    C1913c.m8862c(applicationContext);
                    return null;
                }
            }, (Executor) C7258h.m22730c());
        }
    }

    /* renamed from: d */
    public static void m8863d(Context context) {
        if (VERSION.SDK_INT >= 26) {
            try {
                CompatJobService.m8834a(context);
            } catch (Exception unused) {
                try {
                    new JSONObject().put("model", Build.MODEL);
                } catch (JSONException unused2) {
                }
            }
        } else {
            context.startService(new Intent(context, JobService.class));
        }
    }

    /* renamed from: g */
    public static void m8866g(Context context) {
        if (context != null) {
            SharedPreferences a = C7285c.m22838a(context, "clean_storage_pref", 0);
            int i = a.getInt("key_start_time", 0);
            if (i > 5) {
                f6920c = true;
            } else {
                a.edit().putInt("key_start_time", i + 1).apply();
            }
        }
    }

    /* renamed from: i */
    private static boolean m8868i(Context context) {
        long j;
        if (context == null) {
            return false;
        }
        long j2 = C7285c.m22838a(context, "clean_storage_pref", 0).getLong("key_clean_date", 0);
        C1908a aVar = f6921d;
        if (aVar == null || aVar.f6898a <= 0) {
            j = 259200000;
        } else {
            j = ((long) aVar.f6898a) * 3600000;
        }
        if (System.currentTimeMillis() - j2 > j) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m8862c(Context context) {
        boolean z;
        new StringBuilder("startCleanAsync ").append(f6918a);
        if (!f6918a && context != null) {
            if (f6922e == null || !f6922e.mo7547b() || !m8868i(context)) {
                z = false;
            } else {
                z = true;
            }
            if (m8867h(context)) {
                new StringBuilder("shouldClean: ").append(z);
                z = true;
            }
            if (z) {
                f6918a = true;
                m8863d(context);
            }
        }
    }

    /* renamed from: k */
    private static long m8870k(Context context) {
        long j = 0;
        try {
            String str = context.getApplicationInfo().publicSourceDir;
            if (str != null) {
                File file = new File(str);
                if (file.exists()) {
                    j = file.length();
                }
            }
            if (VERSION.SDK_INT >= 21) {
                String[] strArr = context.getApplicationInfo().splitPublicSourceDirs;
                if (strArr != null && strArr.length > 0) {
                    for (String file2 : strArr) {
                        File file3 = new File(file2);
                        if (file3.exists()) {
                            j += file3.length();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: l */
    private static void m8871l(Context context) {
        if (context != null && f6924g != null) {
            ArrayList<File> arrayList = new ArrayList<>();
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                m8856a(cacheDir.getParentFile(), (List<File>) arrayList);
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                externalCacheDir = externalCacheDir.getParentFile();
                m8856a(externalCacheDir, (List<File>) arrayList);
            }
            if (arrayList.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    for (File file : arrayList) {
                        if (!externalCacheDir.getName().endsWith(".so")) {
                            jSONObject.put(file.getAbsolutePath(), (file.length() / 1024) / 1024);
                        }
                    }
                } catch (Exception unused) {
                }
                new StringBuilder("large files \n").append(jSONObject.toString());
                f6924g.mo7544a("large_files_v2", null, jSONObject, null);
            }
        }
    }

    /* renamed from: j */
    private static void m8869j(Context context) {
        boolean z;
        List list;
        if (f6924g != null) {
            try {
                m8872m(context);
                m8860b();
                JSONObject jSONObject = new JSONObject();
                long a = C1921e.m8888a(context.getCacheDir().getParent());
                long a2 = C1921e.m8888a(context.getExternalCacheDir().getParent());
                long j = 0;
                File b = C12920c.m37610b(context);
                if (b != null) {
                    j = C1921e.m8888a(b.getParent());
                }
                jSONObject.put("private_size", a);
                jSONObject.put("external_size", a2);
                jSONObject.put("sdcard_size", j);
                jSONObject.put("total_size", a + a2);
                jSONObject.put("device_size", C1921e.m8886a());
                jSONObject.put("available_size", C1921e.m8893b());
                jSONObject.put("apk_size", m8870k(context));
                String str = "strategy_enabled";
                if (!C12920c.m37608a() || C12919b.m37599a(context) == null || !C12919b.m37599a(context).mo31403a()) {
                    z = false;
                } else {
                    z = true;
                }
                jSONObject.put(str, z);
                m8858a(jSONObject);
                jSONObject.put("black_size", f6925h);
                f6924g.mo7543a("storage_usage", jSONObject);
                if (f6926i == null) {
                    list = null;
                } else {
                    list = f6926i.f6945c;
                }
                List<Entry> a3 = C1922f.m8897a(context, list);
                if (a3 != null && a3.size() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Entry entry : a3) {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    }
                    f6924g.mo7544a("storage_full_v2", null, jSONObject2, null);
                }
                m8871l(context);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: m */
    private static void m8872m(Context context) {
        f6925h = 0;
        if (f6920c && context != null) {
            ArrayList<C1919a> arrayList = new ArrayList<>();
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                File parentFile = cacheDir.getParentFile();
                StringBuilder sb = new StringBuilder();
                sb.append(cacheDir.getAbsolutePath());
                sb.append(File.separator);
                sb.append("ptree.txt");
                m8855a(parentFile, sb.toString(), C1920b.p, arrayList);
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                File parentFile2 = externalCacheDir.getParentFile();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(externalCacheDir.getAbsolutePath());
                sb2.append(File.separator);
                sb2.append("etree.txt");
                m8855a(parentFile2, sb2.toString(), C1920b.e, arrayList);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (C1919a aVar : arrayList) {
                    new StringBuilder("black: ").append(aVar.mo7538b());
                    f6925h += aVar.f6934a;
                    String b = aVar.mo7538b();
                    if (b != null) {
                        jSONObject.put(b.replace("/", "_"), (aVar.f6934a / 1024) / 1024);
                    }
                }
            } catch (Exception unused) {
            }
            C1909b.m8849a(context, arrayList);
            if (f6924g != null) {
                f6924g.mo7544a("black_storage", null, jSONObject, null);
            }
        }
    }

    /* renamed from: a */
    private static void m8858a(JSONObject jSONObject) {
        if (f6923f != null && !f6923f.isEmpty()) {
            for (C1935n nVar : f6923f) {
                if (nVar != null) {
                    try {
                        jSONObject.put(nVar.f6964b, nVar.f6965c);
                        if (nVar.f6966d != null && !nVar.f6966d.isEmpty()) {
                            for (C1936a aVar : nVar.f6966d) {
                                if (aVar != null) {
                                    jSONObject.put(aVar.f6968b, aVar.f6969c);
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m8854a(final Context context, C1926i iVar) {
        long j;
        long j2;
        int i;
        long j3;
        if (!f6919b) {
            f6919b = true;
            f6926i = iVar;
            f6921d = iVar.f6947e;
            f6922e = iVar.f6943a;
            f6924g = iVar.f6944b;
            f6923f = iVar.f6946d;
            C1918d.f6933c = iVar.f6945c;
            if (f6921d == null || f6921d.f6901d <= 0) {
                j = 3145728;
            } else {
                j = ((long) f6921d.f6901d) * 1024;
            }
            C1918d.f6931a = j;
            if (f6921d == null || f6921d.f6906i <= 0) {
                j2 = 1048576;
            } else {
                j2 = ((long) f6921d.f6906i) * 1024;
            }
            C1918d.f6932b = j2;
            C1909b.f6910d = iVar.f6948f;
            C1909b.f6912f = iVar.f6944b;
            C1909b.f6911e = iVar.f6943a;
            int i2 = 10;
            if (f6921d == null || f6921d.f6903f <= 0) {
                i = 10;
            } else {
                i = f6921d.f6903f;
            }
            C1909b.f6907a = i;
            if (f6921d == null || f6921d.f6902e <= 0) {
                j3 = 2592000000L;
            } else {
                j3 = ((long) f6921d.f6902e) * 86400000;
            }
            C1909b.f6908b = j3;
            if (f6921d != null && f6921d.f6904g > 0) {
                i2 = f6921d.f6904g;
            }
            C1909b.f6909c = i2;
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    C1913c.m8866g(context);
                    C1909b.m8848a(context);
                    return null;
                }
            }, (Executor) C7258h.m22730c());
        }
    }

    /* renamed from: a */
    private static void m8856a(File file, List<File> list) {
        if (file != null && file.exists() && list != null) {
            if (file.isFile()) {
                if (m8859a(file)) {
                    list.add(file);
                }
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File a : listFiles) {
                    m8856a(a, list);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m8855a(File file, String str, C1920b bVar, List<C1919a> list) {
        if (str != null) {
            File file2 = new File(str);
            C1919a a = C1918d.m8873a(file, (C1919a) null, bVar);
            if (a != null) {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused) {
                    }
                } else {
                    C1919a a2 = C1918d.m8874a(str);
                    if (a2 != null) {
                        C1918d.m8875a(a2, a, list);
                    } else {
                        return;
                    }
                }
                C1918d.m8876a(a, str);
            }
        }
    }
}
