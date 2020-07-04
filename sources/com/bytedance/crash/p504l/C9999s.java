package com.bytedance.crash.p504l;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.l.s */
public final class C9999s {

    /* renamed from: com.bytedance.crash.l.s$a */
    static class C10000a {

        /* renamed from: a */
        public final PrintWriter f27237a;

        C10000a(PrintWriter printWriter) {
            this.f27237a = printWriter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo24611a(Object obj) {
            this.f27237a.println(obj);
        }
    }

    /* renamed from: a */
    public static void m29652a(Throwable th, PrintStream printStream) {
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            m29653a(th, printWriter);
        } catch (Throwable unused) {
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: a */
    private static void m29653a(Throwable th, PrintWriter printWriter) {
        if (th != null) {
            C10000a aVar = new C10000a(printWriter);
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            synchronized (aVar.f27237a) {
                aVar.mo24611a(th);
                StackTraceElement[] stackTrace = th.getStackTrace();
                boolean z = stackTrace.length > 384;
                int length = stackTrace.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (z && i2 > 256) {
                        StringBuilder sb = new StringBuilder("\t... skip ");
                        sb.append((stackTrace.length - i2) - 128);
                        sb.append(" lines");
                        aVar.mo24611a(sb.toString());
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder("\tat ");
                    sb2.append(stackTraceElement);
                    aVar.mo24611a(sb2.toString());
                    i2++;
                    i++;
                }
                if (z) {
                    for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                        StringBuilder sb3 = new StringBuilder("\tat ");
                        sb3.append(stackTrace[length2]);
                        aVar.mo24611a(sb3.toString());
                    }
                }
                if (VERSION.SDK_INT >= 19) {
                    for (Throwable a : C6497a.m20183a(th)) {
                        m29651a(a, aVar, stackTrace, "Suppressed: ", "\t", newSetFromMap, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    }
                }
                Throwable cause = th.getCause();
                if (cause != null) {
                    m29651a(cause, aVar, stackTrace, "Caused by: ", "", newSetFromMap, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m29644a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m29653a(th, printWriter);
            return stringWriter.toString();
        } catch (Throwable unused) {
            return "";
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: b */
    public static boolean m29656b(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m29645a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement a : stackTraceElementArr) {
            m29646a(a, sb);
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static boolean m29658c(String str) {
        Set<String> a = C9983h.m29563a();
        if (a.contains(str)) {
            return true;
        }
        for (String str2 : a) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m29643a(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 10
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0064, all -> 0x005e }
            java.io.FileReader r7 = new java.io.FileReader     // Catch:{ Throwable -> 0x0064, all -> 0x005e }
            r7.<init>(r0)     // Catch:{ Throwable -> 0x0064, all -> 0x005e }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0064, all -> 0x005e }
            r0 = 0
        L_0x0031:
            java.lang.String r1 = r6.readLine()     // Catch:{ Throwable -> 0x005c, all -> 0x005a }
            if (r1 == 0) goto L_0x0056
            r7 = 256(0x100, float:3.59E-43)
            if (r5 > r7) goto L_0x0045
            r8.add(r1)     // Catch:{ Throwable -> 0x005c, all -> 0x005a }
            r3.append(r1)     // Catch:{ Throwable -> 0x005c, all -> 0x005a }
            r3.append(r4)     // Catch:{ Throwable -> 0x005c, all -> 0x005a }
            goto L_0x0053
        L_0x0045:
            r2.add(r1)     // Catch:{ Throwable -> 0x005c, all -> 0x005a }
            int r1 = r2.size()     // Catch:{ Throwable -> 0x005c, all -> 0x005a }
            if (r1 <= r7) goto L_0x0053
            r2.poll()     // Catch:{ Throwable -> 0x005c, all -> 0x005a }
            int r0 = r0 + 1
        L_0x0053:
            int r5 = r5 + 1
            goto L_0x0031
        L_0x0056:
            com.bytedance.crash.p504l.C9984i.m29565a(r6)
            goto L_0x0068
        L_0x005a:
            r8 = move-exception
            goto L_0x0060
        L_0x005c:
            r1 = r6
            goto L_0x0065
        L_0x005e:
            r8 = move-exception
            r6 = r1
        L_0x0060:
            com.bytedance.crash.p504l.C9984i.m29565a(r6)
            throw r8
        L_0x0064:
            r0 = 0
        L_0x0065:
            com.bytedance.crash.p504l.C9984i.m29565a(r1)
        L_0x0068:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L_0x0094
            if (r0 == 0) goto L_0x007d
            java.lang.String r8 = "\t... skip "
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = " lines\n"
            r3.append(r8)
        L_0x007d:
            java.util.Iterator r8 = r2.iterator()
        L_0x0081:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            r3.append(r4)
            goto L_0x0081
        L_0x0094:
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p504l.C9999s.m29643a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static JSONObject m29654b(String str) {
        try {
            Map allStackTraces = Thread.getAllStackTraces();
            JSONObject jSONObject = new JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            JSONArray jSONArray = new JSONArray();
            for (Entry entry : allStackTraces.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                Thread thread = (Thread) entry.getKey();
                String name = thread.getName();
                if (!m29658c(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(thread.getName());
                    sb.append("(");
                    sb.append(thread.getId());
                    sb.append(")");
                    jSONObject2.put("thread_name", sb.toString());
                    StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                    boolean z = true;
                    if (stackTraceElementArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                            String className = stackTraceElement.getClassName();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(className);
                            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb2.append(stackTraceElement.getMethodName());
                            sb2.append("(");
                            sb2.append(stackTraceElement.getLineNumber());
                            sb2.append(")");
                            jSONArray2.put(sb2.toString());
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        if (jSONArray2.length() <= 0) {
                            z = false;
                        }
                    }
                    if (z) {
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m29659c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if ((th instanceof OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m29648a(String str, int i) throws IOException {
        NativeImpl.m29680a(i, str);
    }

    /* renamed from: a */
    public static void m29649a(Throwable th, int i) {
        try {
            m29657c(th, i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m29655b(Throwable th, int i) {
        th.getClass().getName();
        String localizedMessage = th.getLocalizedMessage();
        try {
            m29648a(th.getClass().getName(), i);
            if (localizedMessage != null) {
                m29648a(": ", i);
                m29648a(localizedMessage, i);
            }
            m29648a("\n", i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static StringBuilder m29646a(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
        return sb;
    }

    /* renamed from: c */
    private static void m29657c(Throwable th, int i) {
        if (th != null && i > 0) {
            m29655b(th, i);
            for (StackTraceElement a : th.getStackTrace()) {
                m29647a(a, i);
            }
            if (VERSION.SDK_INT >= 19) {
                for (Throwable a2 : C6497a.m20183a(th)) {
                    m29650a(a2, i, "Suppressed: ", "\t");
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m29650a(cause, i, "Caused by: ", "");
            }
        }
    }

    /* renamed from: a */
    private static void m29647a(StackTraceElement stackTraceElement, int i) {
        try {
            m29648a("\tat ", i);
            m29648a(stackTraceElement.getClassName(), i);
            m29648a(ClassUtils.PACKAGE_SEPARATOR, i);
            m29648a(stackTraceElement.getMethodName(), i);
            if (stackTraceElement.isNativeMethod()) {
                m29648a("(Native Method)", i);
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    m29648a("(", i);
                    m29648a(stackTraceElement.getFileName(), i);
                    m29648a(":", i);
                    m29648a(String.valueOf(stackTraceElement.getLineNumber()), i);
                    m29648a(")", i);
                } else {
                    m29648a("(", i);
                    m29648a(stackTraceElement.getFileName(), i);
                    m29648a(")", i);
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                m29648a("(Unknown Source:", i);
                m29648a(String.valueOf(stackTraceElement.getLineNumber()), i);
                m29648a(")", i);
            } else {
                m29648a("(Unknown Source)", i);
            }
            m29648a("\n", i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m29650a(Throwable th, int i, String str, String str2) {
        while (true) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            try {
                NativeImpl.m29680a(i, str2);
                NativeImpl.m29680a(i, str);
            } catch (Throwable unused) {
            }
            m29655b(th, i);
            for (StackTraceElement a : stackTrace) {
                m29647a(a, i);
            }
            if (VERSION.SDK_INT >= 19) {
                for (Throwable a2 : C6497a.m20183a(th)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("\t");
                    m29650a(a2, i, "Suppressed: ", sb.toString());
                }
            }
            th = th.getCause();
            if (th != null) {
                str = "Caused by: ";
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m29651a(Throwable th, C10000a aVar, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i) {
        boolean z;
        int i2;
        C10000a aVar2 = aVar;
        String str3 = str2;
        Set<Throwable> set2 = set;
        Throwable th2 = th;
        String str4 = str;
        int i3 = i;
        while (!set2.contains(th2)) {
            set2.add(th2);
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace.length > i3) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str4);
            sb.append(th2);
            aVar2.mo24611a(sb.toString());
            int length = stackTrace.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i4];
                if (z && i5 > i3) {
                    StringBuilder sb2 = new StringBuilder("\t... skip ");
                    sb2.append((stackTrace.length - i5) - (i3 / 2));
                    sb2.append(" lines");
                    aVar2.mo24611a(sb2.toString());
                    break;
                }
                StringBuilder sb3 = new StringBuilder("\tat ");
                sb3.append(stackTraceElement);
                aVar2.mo24611a(sb3.toString());
                i5++;
                i4++;
            }
            if (z) {
                for (int length2 = stackTrace.length - (i3 / 2); length2 < stackTrace.length; length2++) {
                    StringBuilder sb4 = new StringBuilder("\tat ");
                    sb4.append(stackTrace[length2]);
                    aVar2.mo24611a(sb4.toString());
                }
            }
            if (VERSION.SDK_INT >= 19) {
                Throwable[] a = C6497a.m20183a(th2);
                int length3 = a.length;
                int i6 = 0;
                while (i6 < length3) {
                    Throwable th3 = a[i6];
                    String str5 = "Suppressed: ";
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str3);
                    sb5.append("\t");
                    String sb6 = sb5.toString();
                    int i7 = i3 / 2;
                    if (i7 > 10) {
                        i2 = i7;
                    } else {
                        i2 = 10;
                    }
                    int i8 = i6;
                    m29651a(th3, aVar, stackTrace, str5, sb6, set, i2);
                    i6 = i8 + 1;
                }
            }
            th2 = th2.getCause();
            if (th2 != null) {
                str4 = "Caused by: ";
                i3 /= 2;
                if (i3 <= 10) {
                    i3 = 10;
                }
            } else {
                return;
            }
        }
        StringBuilder sb7 = new StringBuilder("\t[CIRCULAR REFERENCE:");
        sb7.append(th2);
        sb7.append("]");
        aVar2.mo24611a(sb7.toString());
    }
}
