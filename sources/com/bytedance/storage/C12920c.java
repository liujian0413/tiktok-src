package com.bytedance.storage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.storage.c */
public final class C12920c {

    /* renamed from: a */
    static List<C12918a> f34129a = new ArrayList();

    /* renamed from: b */
    private static long f34130b = 1024;

    /* renamed from: c */
    private static volatile C12923e<C12922d> f34131c;

    /* renamed from: b */
    public static List<C12918a> m37612b() {
        return f34129a;
    }

    /* renamed from: a */
    public static boolean m37608a() {
        if (f34131c == null || f34131c.mo18609a() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m37607a(C12923e<C12922d> eVar) {
        f34131c = eVar;
    }

    /* renamed from: a */
    public static void m37606a(C12918a aVar) {
        synchronized (f34129a) {
            f34129a.add(aVar);
        }
    }

    /* renamed from: b */
    private static void m37613b(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    public static File m37604a(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (m37609a(file.getParentFile())) {
            return null;
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    /* renamed from: h */
    private static File m37619h(Context context) {
        try {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() >= ((C12922d) f34131c.mo18609a()).f34133a) {
                return cacheDir;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: c */
    private static File m37614c(Context context) {
        File a = m37602a(context);
        if (a == null || !a.exists() || a.getFreeSpace() < ((C12922d) f34131c.mo18609a()).f34135c) {
            return null;
        }
        return a;
    }

    /* renamed from: d */
    private static File m37615d(Context context) {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir == null || !externalFilesDir.exists() || externalFilesDir.getFreeSpace() < ((C12922d) f34131c.mo18609a()).f34134b) {
                    return null;
                }
                return externalFilesDir;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    private static File m37616e(Context context) {
        try {
            File filesDir = context.getFilesDir();
            if (filesDir != null && filesDir.exists() && filesDir.getFreeSpace() >= ((C12922d) f34131c.mo18609a()).f34133a) {
                return filesDir;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: f */
    private static File m37617f(Context context) {
        File b = m37610b(context);
        if (b == null || !b.exists() || b.getFreeSpace() < ((C12922d) f34131c.mo18609a()).f34135c) {
            return null;
        }
        return b;
    }

    /* renamed from: g */
    private static File m37618g(Context context) {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null && externalCacheDir.getFreeSpace() >= ((C12922d) f34131c.mo18609a()).f34134b) {
                    return externalCacheDir;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static File m37602a(Context context) {
        File[] fileArr;
        C12919b a = C12919b.m37599a(context);
        if (a == null || !a.mo31403a() || TextUtils.isEmpty(a.f34127d)) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            try {
                fileArr = context.getExternalFilesDirs(null);
            } catch (Exception unused) {
                fileArr = null;
            }
            File a2 = m37605a(fileArr, context);
            if (a2 != null) {
                return a2;
            }
        }
        try {
            context.getExternalFilesDir(null);
            StringBuilder sb = new StringBuilder();
            sb.append(a.f34127d);
            sb.append("/Android/data/");
            sb.append(context.getPackageName());
            sb.append("/files");
            File file = new File(sb.toString());
            m37613b(file);
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static File m37610b(Context context) {
        File[] fileArr;
        C12919b a = C12919b.m37599a(context);
        if (a == null || !a.mo31403a()) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            try {
                fileArr = context.getExternalCacheDirs();
            } catch (Exception unused) {
                fileArr = null;
            }
            File a2 = m37605a(fileArr, context);
            if (a2 != null) {
                return a2;
            }
        }
        try {
            context.getExternalCacheDir();
            StringBuilder sb = new StringBuilder();
            sb.append(a.f34127d);
            sb.append("/Android/data/");
            sb.append(context.getPackageName());
            sb.append("/cache");
            File file = new File(sb.toString());
            m37613b(file);
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m37609a(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getFreeSpace());
        sb.append(" ");
        sb.append(f34130b);
        if (file.getFreeSpace() < f34130b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static File m37603a(Context context, StorageStrategy storageStrategy) {
        if (!m37608a()) {
            return null;
        }
        switch (storageStrategy) {
            case PREFER_SD_CARD:
                File c = m37614c(context);
                if (c == null) {
                    c = m37615d(context);
                }
                if (c != null) {
                    return c;
                }
                break;
            case PREFER_EXTERNAL:
                File d = m37615d(context);
                if (d == null) {
                    d = m37614c(context);
                }
                if (d != null) {
                    return d;
                }
                break;
            case PREFER_PRIVATE:
                File e = m37616e(context);
                if (e == null) {
                    e = m37615d(context);
                }
                if (e != null) {
                    return e;
                }
                break;
        }
        return context.getFilesDir();
    }

    /* renamed from: b */
    public static File m37611b(Context context, StorageStrategy storageStrategy) {
        if (!m37608a()) {
            return null;
        }
        switch (storageStrategy) {
            case PREFER_SD_CARD:
                File f = m37617f(context);
                if (f == null) {
                    f = m37618g(context);
                }
                if (f != null) {
                    return f;
                }
                break;
            case PREFER_EXTERNAL:
                File g = m37618g(context);
                if (g == null) {
                    g = m37617f(context);
                }
                if (g != null) {
                    return g;
                }
                break;
            case PREFER_PRIVATE:
                File h = m37619h(context);
                if (h == null) {
                    h = m37618g(context);
                }
                if (h != null) {
                    return h;
                }
                break;
        }
        return context.getCacheDir();
    }

    /* renamed from: a */
    private static File m37605a(File[] fileArr, Context context) {
        if (fileArr == null) {
            return null;
        }
        C12919b a = C12919b.m37599a(context);
        if (a == null || !a.mo31403a() || TextUtils.isEmpty(a.f34127d)) {
            return null;
        }
        for (File file : fileArr) {
            if (!(file == null || file.getPath() == null || !file.getPath().contains(a.f34127d))) {
                m37613b(file);
                if (file.exists()) {
                    return file;
                }
            }
        }
        return null;
    }
}
