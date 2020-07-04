package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.p749d.C15176d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.util.v */
public final class C15339v {

    /* renamed from: a */
    private static final int f39610a = Process.myUid();

    /* renamed from: b */
    private static final Method f39611b = m44616a();

    /* renamed from: c */
    private static final Method f39612c = m44621b();

    /* renamed from: d */
    private static final Method f39613d = m44622c();

    /* renamed from: e */
    private static final Method f39614e = m44623d();

    /* renamed from: f */
    private static final Method f39615f = m44624e();

    /* renamed from: g */
    private static final Method f39616g = m44625f();

    /* renamed from: h */
    private static final Method f39617h = m44626g();

    /* renamed from: a */
    private static WorkSource m44613a(int i, String str) {
        WorkSource workSource = new WorkSource();
        m44618a(workSource, i, str);
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m44614a(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo a = C15176d.m44159a(context).mo38462a(str, 0);
            if (a != null) {
                return m44613a(a.uid, str);
            }
            String str2 = "Could not get applicationInfo from package: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        } catch (NameNotFoundException unused) {
            String str3 = "Could not find package: ";
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3.concat(valueOf2);
            } else {
                new String(str3);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static void m44618a(WorkSource workSource, int i, String str) {
        if (f39612c != null) {
            if (str == null) {
                str = "";
            }
            try {
                f39612c.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            if (f39611b != null) {
                try {
                    f39611b.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    /* renamed from: b */
    private static int m44620b(WorkSource workSource) {
        if (f39613d != null) {
            try {
                return ((Integer) f39613d.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static String m44615a(WorkSource workSource, int i) {
        if (f39615f != null) {
            try {
                return (String) f39615f.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<String> m44617a(WorkSource workSource) {
        int b = workSource == null ? 0 : m44620b(workSource);
        if (b == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            String a = m44615a(workSource, i);
            if (!C15337t.m44610a(a)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m44619a(Context context) {
        if (context == null || context.getPackageManager() == null || C15176d.m44159a(context).mo38461a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Method m44616a() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Method m44621b() {
        if (C15333p.m44597d()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static Method m44622c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m44623d() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m44624e() {
        if (C15333p.m44597d()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static final Method m44625f() {
        if (C15333p.m44604k()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    private static final Method m44626g() {
        if (C15333p.m44604k()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
