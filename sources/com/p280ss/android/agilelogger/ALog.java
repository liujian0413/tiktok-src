package com.p280ss.android.agilelogger;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.agilelogger.p839c.C19169a;
import com.p280ss.android.agilelogger.p839c.C19172c;
import com.p280ss.android.agilelogger.p840d.C19174a;
import com.p280ss.android.agilelogger.p840d.C19176b;
import com.p280ss.android.agilelogger.utils.C19204h;
import com.p280ss.android.agilelogger.utils.FormatUtils.TYPE;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.agilelogger.ALog */
public class ALog {

    /* renamed from: a */
    public static C19159a f19201a;

    /* renamed from: b */
    public static String f19202b = ALog.class.getCanonicalName();

    /* renamed from: c */
    private static Context f19203c;

    /* renamed from: d */
    private static C19176b f19204d = new C19176b();

    /* renamed from: e */
    private static volatile boolean f19205e = true;

    /* renamed from: f */
    private static volatile boolean f19206f = false;

    /* renamed from: g */
    private static volatile boolean f19207g = false;

    /* renamed from: h */
    private static volatile C19163b f19208h;

    /* renamed from: i */
    private static C6727a f19209i;

    /* renamed from: j */
    private static volatile C19168c f19210j = null;

    /* renamed from: k */
    private static volatile List<C19173d> f19211k = new ArrayList();

    /* renamed from: com.ss.android.agilelogger.ALog$MMAP_STATE */
    public enum MMAP_STATE {
        NOT_INIT,
        LOAD_LIBRARY_ERROR,
        USING_MMAP,
        USING_CACHE,
        FATAL_ERROR
    }

    /* renamed from: com.ss.android.agilelogger.ALog$a */
    public interface C6727a {
    }

    /* renamed from: com.ss.android.agilelogger.ALog$b */
    public interface C6728b {
    }

    /* renamed from: a */
    public static Context m20846a() {
        return f19203c;
    }

    /* renamed from: b */
    public static boolean m20865b() {
        return f19207g;
    }

    /* renamed from: c */
    public static List<C19173d> m20866c() {
        return f19211k;
    }

    /* renamed from: a */
    public static void m20860a(boolean z) {
        f19205e = z;
    }

    /* renamed from: a */
    public static boolean m20861a(C19159a aVar) {
        if (aVar == null) {
            throw new RuntimeException("alogConfig must not be null");
        } else if (!C19204h.m62939a(m20846a(), "alog-lib")) {
            return false;
        } else {
            if (f19208h == null || f19208h.isInterrupted()) {
                synchronized (ALog.class) {
                    if (f19208h == null || f19208h.isInterrupted()) {
                        f19201a = aVar;
                        C19163b bVar = new C19163b("_ALOG_OPT_", aVar, f19209i);
                        f19208h = bVar;
                        bVar.setPriority(1);
                        f19208h.start();
                    }
                }
            }
            if (f19210j != null) {
                f19208h.mo50877a(f19210j.mo50881a());
            }
            f19207g = true;
            return true;
        }
    }

    /* renamed from: a */
    public static void m20856a(String str) {
        f19202b = str;
    }

    /* renamed from: a */
    public static void m20857a(String str, String str2) {
        m20848a(2, str, str2, TYPE.MSG);
    }

    /* renamed from: a */
    public static void m20858a(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n");
        m20849a(5, str, th, sb.toString(), TYPE.STACKTRACE_STR);
    }

    /* renamed from: a */
    public static void m20859a(String str, Throwable th) {
        m20848a(5, str, th, TYPE.STACKTRACE_STR);
    }

    /* renamed from: f */
    public static void m20872f() {
        m20853a((C6728b) null);
    }

    /* renamed from: d */
    public static void m20868d() {
        C19178e a = C19178e.m62882a();
        a.f51846a = 2;
        if (f19208h != null) {
            f19208h.f51810c.add(a);
            f19208h.mo50876a();
        }
    }

    /* renamed from: e */
    public static void m20870e() {
        if (f19208h != null) {
            C19174a aVar = f19208h.f51809b;
            if (aVar != null) {
                aVar.mo50907b();
            }
        }
        f19208h = null;
    }

    /* renamed from: g */
    public static long m20873g() {
        if (f19208h == null || f19208h.f51809b == null) {
            return 0;
        }
        for (C19172c cVar : f19208h.f51809b.f51837a) {
            if (cVar instanceof C19169a) {
                return ((C19169a) cVar).mo50887d();
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static long m20874h() {
        if (f19208h == null || f19208h.f51809b == null) {
            return 0;
        }
        for (C19172c cVar : f19208h.f51809b.f51837a) {
            if (cVar instanceof C19169a) {
                return ((C19169a) cVar).mo50888e();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m20852a(Context context) {
        f19203c = context;
    }

    /* renamed from: a */
    private static void m20853a(C6728b bVar) {
        C19178e a = C19178e.m62882a();
        a.f51858m = null;
        a.f51846a = 4;
        if (f19208h != null) {
            f19208h.f51810c.add(a);
            f19208h.mo50876a();
        }
    }

    /* renamed from: a */
    public static void m20854a(C19173d dVar) {
        f19211k.add(dVar);
    }

    /* renamed from: a */
    private static void m20855a(C19178e eVar) {
        eVar.f51846a = 1;
        if (f19205e) {
            C19176b.m62881a(eVar);
        }
        if (f19208h != null && f19208h.f51808a != null && f19208h.f51808a.f51793g <= eVar.f51847b) {
            f19208h.f51810c.add(eVar);
            f19208h.mo50876a();
        }
    }

    /* renamed from: b */
    public static void m20862b(String str, String str2) {
        m20848a(3, str, str2, TYPE.MSG);
    }

    /* renamed from: c */
    public static void m20867c(String str, String str2) {
        m20848a(4, str, str2, TYPE.MSG);
    }

    /* renamed from: d */
    public static void m20869d(String str, String str2) {
        m20848a(5, str, str2, TYPE.MSG);
    }

    /* renamed from: e */
    public static void m20871e(String str, String str2) {
        m20848a(6, str, str2, TYPE.MSG);
    }

    /* renamed from: b */
    public static void m20864b(String str, Throwable th) {
        m20848a(6, str, th, TYPE.STACKTRACE_STR);
    }

    /* renamed from: a */
    public static List<String> m20847a(long j, long j2) {
        File[] listFiles;
        if (f19201a == null || j >= j2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(f19201a.f51790d);
            if (file.exists() && file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    if (file2.getName().endsWith(".hot")) {
                        long lastModified = file2.lastModified() / 1000;
                        if (j > lastModified || j2 < lastModified) {
                            String[] split = file2.getName().split("_");
                            if (split != null && split.length > 0) {
                                long parseLong = Long.parseLong(split[0]) / 1000;
                                if (parseLong >= j && parseLong <= j2) {
                                    arrayList.add(file2.getAbsolutePath());
                                }
                            }
                        } else {
                            arrayList.add(file2.getAbsolutePath());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m20850a(int i, String str, String str2) {
        m20848a(i, str, str2, TYPE.JSON);
    }

    /* renamed from: a */
    public static void m20851a(int i, String str, StackTraceElement[] stackTraceElementArr) {
        m20848a(i, str, stackTraceElementArr, TYPE.STACKTRACE);
    }

    /* renamed from: b */
    public static void m20863b(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n");
        m20849a(6, str, th, sb.toString(), TYPE.STACKTRACE_STR);
    }

    /* renamed from: a */
    private static void m20848a(int i, String str, Object obj, TYPE type) {
        m20849a(i, str, obj, null, type);
    }

    /* renamed from: a */
    private static void m20849a(int i, String str, Object obj, Object obj2, TYPE type) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5 = "";
        long id = Thread.currentThread().getId();
        boolean z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C19178e a = C19178e.m62883a(i, str, str5, id, z);
        a.f51852g = type;
        a.f51853h = obj;
        a.f51854i = obj2;
        StackTraceElement stackTraceElement = null;
        if (!TextUtils.isEmpty(f19202b) && f19206f) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (f19202b.equals(stackTrace[i2].getClassName())) {
                    int i3 = i2 + 1;
                    if (i3 < length && !f19202b.equals(stackTrace[i3].getClassName())) {
                        stackTraceElement = stackTrace[i3];
                        break;
                    }
                }
                i2++;
            }
        }
        if (stackTraceElement == null) {
            z2 = true;
        }
        if (z2) {
            str2 = "";
        } else {
            str2 = stackTraceElement.getClassName();
        }
        a.f51855j = str2;
        if (z2) {
            str3 = "";
        } else {
            str3 = stackTraceElement.getMethodName();
        }
        a.f51856k = str3;
        if (z2) {
            str4 = "";
        } else {
            str4 = String.valueOf(stackTraceElement.getLineNumber());
        }
        a.f51857l = str4;
        m20855a(a);
    }
}
