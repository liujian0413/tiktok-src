package com.bytedance.crash.p498g;

import android.os.SystemClock;
import com.bytedance.crash.C9900g;
import com.bytedance.crash.C9908h;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p504l.C9972a;
import com.bytedance.crash.p504l.C9982g;
import com.bytedance.crash.p504l.C9984i;
import com.bytedance.crash.p504l.C9992m;
import com.bytedance.crash.p504l.C9999s;
import com.bytedance.crash.upload.C10024e;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.crash.g.a */
public final class C9901a implements UncaughtExceptionHandler {

    /* renamed from: c */
    private static C9901a f27002c;

    /* renamed from: i */
    private static volatile boolean f27003i;

    /* renamed from: j */
    private static volatile ThreadLocal<Boolean> f27004j = new ThreadLocal<>();

    /* renamed from: a */
    public C9902b f27005a;

    /* renamed from: b */
    public C9902b f27006b;

    /* renamed from: d */
    private UncaughtExceptionHandler f27007d;

    /* renamed from: e */
    private volatile int f27008e;

    /* renamed from: f */
    private volatile int f27009f;

    /* renamed from: g */
    private ConcurrentHashMap<String, Object> f27010g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private ConcurrentHashMap<String, Object> f27011h = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static boolean m29279b() {
        return f27003i;
    }

    /* renamed from: a */
    public static C9901a m29272a() {
        if (f27002c == null) {
            f27002c = new C9901a();
        }
        return f27002c;
    }

    /* renamed from: d */
    private void m29281d() {
        UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f27007d = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private C9901a() {
        m29281d();
    }

    /* renamed from: c */
    public static boolean m29280c() {
        Boolean bool = (Boolean) f27004j.get();
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m29282e() {
        synchronized (this) {
            this.f27009f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f27009f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    /* renamed from: g */
    private static boolean m29284g() {
        if (C9918j.m29344i().mo24559b() == null || C9918j.m29344i().mo24559b().getConfigJSON("exception_modules") == null || C9918j.m29344i().mo24559b().getConfigJSON("exception_modules").optInt("oom_callback", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static void m29283f() {
        File a = C9992m.m29591a(C9918j.m29342g());
        File b = C9992m.m29595b(C9918j.m29342g());
        File a2 = C9992m.m29590a();
        if (!C9982g.m29553b(a) || !C9982g.m29553b(b) || !C9982g.m29553b(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (!C10024e.m29788a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                try {
                    SystemClock.sleep(500);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo24512b(String str) {
        return this.f27010g.containsKey(str);
    }

    /* renamed from: c */
    public final boolean mo24513c(String str) {
        return this.f27011h.containsKey(str);
    }

    /* renamed from: a */
    private static boolean m29276a(long j) {
        if (j - C9918j.m29345j() > C9918j.m29344i().f27120f || (C9918j.m29348m() && C9918j.m29350o() == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo24511a(String str) {
        this.f27010g.put(str, new Object());
    }

    /* renamed from: b */
    private void m29278b(Thread thread, Throwable th) {
        if (this.f27007d != null && this.f27007d != this) {
            this.f27007d.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private static boolean m29277a(Thread thread, Throwable th) {
        C9908h hVar = C9918j.m29337b().f26865g;
        if (hVar != null) {
            try {
                if (!hVar.mo24522a(th, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r11v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r5v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v9, types: [com.bytedance.crash.a.a] */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: type inference failed for: r6v31 */
    /* JADX WARNING: type inference failed for: r6v32 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r6v33 */
    /* JADX WARNING: type inference failed for: r6v34 */
    /* JADX WARNING: type inference failed for: r6v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r5 = r11;
        r10 = r12;
        r6 = r14;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r5 = r11;
        r10 = r12;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0113, code lost:
        r10 = r17;
        r6 = r6;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
        r10 = r17;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0141, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0142, code lost:
        r5 = r11;
        r10 = r12;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0145, code lost:
        r9 = r2;
        r6 = r6;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0147, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0148, code lost:
        r5 = r11;
        r10 = r12;
        r6 = r14;
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014e, code lost:
        r5 = r11;
        r10 = r12;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0151, code lost:
        r4 = null;
        r6 = r6;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0171, code lost:
        if (r9 == false) goto L_0x0130;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x0043, B:19:0x0054] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:44:0x00ca, B:62:0x0123] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Throwable, code=null, for r21v0, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
      assigns: []
      uses: []
      mth insns count: 216
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ Throwable -> 0x0080, all -> 0x007a }, ExcHandler: all (th java.lang.Throwable), Splitter:B:24:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112 A[ExcHandler: all (th java.lang.Throwable), PHI: r5 r6 r17 
      PHI: (r5v11 ?) = (r5v27 ?), (r5v30 ?), (r5v33 ?), (r5v37 ?) binds: [B:38:0x00b4, B:62:0x0123, B:63:?, B:44:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v9 ?) = (r6v24 ?), (r6v27 ?), (r6v30 ?), (r6v34 ?) binds: [B:38:0x00b4, B:62:0x0123, B:63:?, B:44:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v1 long) = (r17v2 long), (r17v2 long), (r17v4 long) binds: [B:62:0x0123, B:63:?, B:44:0x00ca] A[DONT_GENERATE, DONT_INLINE], Splitter:B:44:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0158 A[Catch:{ all -> 0x0174 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0171  */
    /* JADX WARNING: Unknown variable types count: 26 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r20, java.lang.Throwable r21) {
        /*
            r19 = this;
            r7 = r19
            r15 = r20
            r14 = r21
            int r0 = r7.f27008e
            r1 = 3
            if (r0 < r1) goto L_0x000c
            return
        L_0x000c:
            int r0 = r7.f27008e
            r1 = 1
            int r0 = r0 + r1
            r7.f27008e = r0
            int r0 = r7.f27009f
            int r0 = r0 + r1
            r7.f27009f = r0
            boolean r0 = f27003i
            if (r0 == 0) goto L_0x0024
            java.lang.ThreadLocal<java.lang.Boolean> r0 = f27004j
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.set(r2)
        L_0x0024:
            f27003i = r1
            r8 = 0
            long r12 = java.lang.System.currentTimeMillis()
            boolean r11 = m29276a(r12)
            boolean r2 = com.bytedance.crash.p504l.C9999s.m29656b(r21)
            r9 = 0
            if (r2 == 0) goto L_0x003f
            boolean r0 = com.bytedance.crash.p504l.C9999s.m29659c(r21)
            if (r0 == 0) goto L_0x003f
            r16 = 1
            goto L_0x0041
        L_0x003f:
            r16 = 0
        L_0x0041:
            if (r11 == 0) goto L_0x0054
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.LAUNCH     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            goto L_0x0056
        L_0x0046:
            r0 = move-exception
            r5 = r11
            r10 = r12
            r6 = r14
            r2 = 0
            goto L_0x0176
        L_0x004d:
            r0 = move-exception
        L_0x004e:
            r4 = r8
            r5 = r11
            r10 = r12
            r6 = r14
            goto L_0x0152
        L_0x0054:
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA     // Catch:{ Throwable -> 0x014d, all -> 0x0046 }
        L_0x0056:
            java.lang.String r0 = com.bytedance.crash.C9918j.m29333a(r12, r0)     // Catch:{ Throwable -> 0x014d, all -> 0x0046 }
            r1 = r19
            r3 = r21
            r4 = r0
            r5 = r20
            r6 = r16
            java.io.File r1 = r1.m29273a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x014d, all -> 0x0046 }
            com.bytedance.crash.j.d r2 = com.bytedance.crash.p501j.C9943d.m29423a()     // Catch:{ Throwable -> 0x014d, all -> 0x0046 }
            r2.mo24564b()     // Catch:{ Throwable -> 0x014d, all -> 0x0046 }
            boolean r2 = m29284g()     // Catch:{ Throwable -> 0x014d, all -> 0x0046 }
            if (r16 == 0) goto L_0x0083
            if (r2 == 0) goto L_0x0083
            m29274a(r15, r14, r11, r12)     // Catch:{ Throwable -> 0x0080, all -> 0x007a }
            goto L_0x0083
        L_0x007a:
            r0 = move-exception
            r5 = r11
            r10 = r12
            r6 = r14
            goto L_0x0176
        L_0x0080:
            r0 = move-exception
            r9 = r2
            goto L_0x004e
        L_0x0083:
            if (r11 == 0) goto L_0x0088
            com.bytedance.crash.CrashType r3 = com.bytedance.crash.CrashType.LAUNCH     // Catch:{ Throwable -> 0x0080, all -> 0x007a }
            goto L_0x008a
        L_0x0088:
            com.bytedance.crash.CrashType r3 = com.bytedance.crash.CrashType.JAVA     // Catch:{ Throwable -> 0x0147, all -> 0x007a }
        L_0x008a:
            java.lang.String r4 = com.bytedance.crash.C9871c.C9872a.f26930b     // Catch:{ Throwable -> 0x0147, all -> 0x007a }
            com.bytedance.crash.event.Event r4 = com.bytedance.crash.event.C9887a.m29169a(r3, r4, r12, r14)     // Catch:{ Throwable -> 0x0147, all -> 0x007a }
            com.bytedance.crash.event.C9888b.m29186b(r4)     // Catch:{ Throwable -> 0x0147, all -> 0x007a }
            com.bytedance.crash.event.Event r4 = r4.clone()     // Catch:{ Throwable -> 0x0147, all -> 0x007a }
            java.lang.String r5 = com.bytedance.crash.C9871c.C9872a.f26932d     // Catch:{ Throwable -> 0x0147, all -> 0x007a }
            com.bytedance.crash.event.Event r4 = r4.eventType(r5)     // Catch:{ Throwable -> 0x0147, all -> 0x007a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0141, all -> 0x007a }
            java.lang.String r6 = "[uncaughtException] isLaunchCrash="
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0141, all -> 0x007a }
            r5.append(r11)     // Catch:{ Throwable -> 0x0141, all -> 0x007a }
            com.bytedance.crash.a.a r5 = com.bytedance.crash.p490a.C9848a.m29064a()     // Catch:{ Throwable -> 0x0141, all -> 0x007a }
            r5.mo24412a(r3, r12, r0)     // Catch:{ Throwable -> 0x0141, all -> 0x007a }
            boolean r3 = m29277a(r20, r21)     // Catch:{ Throwable -> 0x0141, all -> 0x007a }
            if (r3 == 0) goto L_0x00e9
            com.bytedance.crash.g.b r5 = r7.f27005a     // Catch:{ Throwable -> 0x00e2, all -> 0x00dc }
            if (r5 == 0) goto L_0x00e9
            if (r11 == 0) goto L_0x00e9
            com.bytedance.crash.event.C9888b.m29186b(r4)     // Catch:{ Throwable -> 0x00e2, all -> 0x00dc }
            com.bytedance.crash.g.b r8 = r7.f27005a     // Catch:{ Throwable -> 0x00e2, all -> 0x00dc }
            r9 = r12
            r5 = r11
            r11 = r20
            r17 = r12
            r12 = r21
            r13 = r0
            r6 = r14
            r14 = r1
            r8.mo24515a(r9, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            java.lang.String r1 = "[uncaughtException] mLaunchCrashDisposer "
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            java.lang.String r1 = r21.toString()     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            r0.append(r1)     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            goto L_0x012a
        L_0x00dc:
            r0 = move-exception
            r5 = r11
            r6 = r14
            r10 = r12
            goto L_0x0176
        L_0x00e2:
            r0 = move-exception
            r5 = r11
            r6 = r14
            r9 = r2
            r10 = r12
            goto L_0x0152
        L_0x00e9:
            r5 = r11
            r17 = r12
            r6 = r14
            if (r3 == 0) goto L_0x011c
            com.bytedance.crash.g.b r8 = r7.f27006b     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            if (r8 == 0) goto L_0x011c
            com.bytedance.crash.event.C9888b.m29186b(r4)     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            com.bytedance.crash.g.b r8 = r7.f27006b     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            r9 = r17
            r11 = r20
            r12 = r21
            r13 = r0
            r14 = r1
            r8.mo24515a(r9, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            java.lang.String r1 = "[uncaughtException] mLaunchCrashDisposer "
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            java.lang.String r1 = r21.toString()     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            r0.append(r1)     // Catch:{ Throwable -> 0x0117, all -> 0x0112 }
            goto L_0x012a
        L_0x0112:
            r0 = move-exception
            r10 = r17
            goto L_0x0176
        L_0x0117:
            r0 = move-exception
            r9 = r2
            r10 = r17
            goto L_0x0152
        L_0x011c:
            if (r3 != 0) goto L_0x0121
            r0 = 100
            goto L_0x0123
        L_0x0121:
            r0 = 101(0x65, float:1.42E-43)
        L_0x0123:
            com.bytedance.crash.event.Event r0 = r4.state(r0)     // Catch:{ Throwable -> 0x013d, all -> 0x0112 }
            com.bytedance.crash.event.C9888b.m29186b(r0)     // Catch:{ Throwable -> 0x013d, all -> 0x0112 }
        L_0x012a:
            if (r16 == 0) goto L_0x0133
            if (r2 != 0) goto L_0x0133
            r10 = r17
        L_0x0130:
            m29274a(r15, r6, r5, r10)
        L_0x0133:
            m29283f()
            r19.m29282e()
            r19.m29278b(r20, r21)
            return
        L_0x013d:
            r0 = move-exception
            r10 = r17
            goto L_0x0145
        L_0x0141:
            r0 = move-exception
            r5 = r11
            r10 = r12
            r6 = r14
        L_0x0145:
            r9 = r2
            goto L_0x0152
        L_0x0147:
            r0 = move-exception
            r5 = r11
            r10 = r12
            r6 = r14
            r9 = r2
            goto L_0x0151
        L_0x014d:
            r0 = move-exception
            r5 = r11
            r10 = r12
            r6 = r14
        L_0x0151:
            r4 = r8
        L_0x0152:
            boolean r1 = com.bytedance.crash.p504l.C9999s.m29656b(r0)     // Catch:{ all -> 0x0174 }
            if (r1 != 0) goto L_0x016f
            if (r4 != 0) goto L_0x0162
            com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.JAVA     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = com.bytedance.crash.C9871c.C9872a.f26930b     // Catch:{ all -> 0x0174 }
            com.bytedance.crash.event.Event r4 = com.bytedance.crash.event.C9887a.m29169a(r1, r2, r10, r6)     // Catch:{ all -> 0x0174 }
        L_0x0162:
            r1 = 103(0x67, float:1.44E-43)
            com.bytedance.crash.event.Event r1 = r4.state(r1)     // Catch:{ all -> 0x0174 }
            com.bytedance.crash.event.Event r0 = r1.errorInfo(r0)     // Catch:{ all -> 0x0174 }
            com.bytedance.crash.event.C9888b.m29186b(r0)     // Catch:{ all -> 0x0174 }
        L_0x016f:
            if (r16 == 0) goto L_0x0133
            if (r9 != 0) goto L_0x0133
            goto L_0x0130
        L_0x0174:
            r0 = move-exception
            r2 = r9
        L_0x0176:
            if (r16 == 0) goto L_0x017d
            if (r2 != 0) goto L_0x017d
            m29274a(r15, r6, r5, r10)
        L_0x017d:
            m29283f()
            r19.m29282e()
            r19.m29278b(r20, r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p498g.C9901a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    private static void m29274a(Thread thread, Throwable th, boolean z, long j) {
        Iterator it = C9918j.m29337b().f26864f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public static void m29275a(Thread thread, Throwable th, boolean z, C9896a aVar) {
        List<C9900g> list;
        CrashType crashType;
        if (z) {
            list = C9918j.m29337b().f26860b;
            crashType = CrashType.LAUNCH;
        } else {
            list = C9918j.m29337b().f26861c;
            crashType = CrashType.JAVA;
        }
        for (C9900g gVar : list) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                gVar.mo24413a(crashType, C9999s.m29644a(th), thread);
                StringBuilder sb = new StringBuilder("callback_cost_");
                sb.append(gVar.getClass().getName());
                aVar.mo24494b(sb.toString(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable unused) {
                StringBuilder sb2 = new StringBuilder("callback_err_");
                sb2.append(gVar.getClass().getName());
                aVar.mo24494b(sb2.toString(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* renamed from: a */
    private File m29273a(boolean z, Throwable th, String str, Thread thread, boolean z2) {
        String str2;
        int i;
        FileOutputStream fileOutputStream;
        File b = C9992m.m29595b(C9918j.m29342g());
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = "oom_";
        } else {
            str2 = "normal_";
        }
        sb.append(str2);
        sb.append(str);
        File file = new File(b, sb.toString());
        String absolutePath = file.getAbsolutePath();
        this.f27011h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            i = NativeImpl.m29687b(absolutePath);
        } catch (Throwable unused) {
            i = -1;
        }
        if (z2) {
            int d = NativeImpl.m29692d(absolutePath);
            if (d > 0) {
                try {
                    NativeImpl.m29680a(d, C9972a.m29507c(C9918j.m29342g()));
                    NativeImpl.m29680a(d, "\n");
                    NativeImpl.m29680a(d, th.getMessage());
                    NativeImpl.m29680a(d, "\n");
                    NativeImpl.m29680a(d, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.m29680a(d, ": ");
                        NativeImpl.m29680a(d, th.getMessage());
                    }
                    NativeImpl.m29680a(d, "\n");
                    NativeImpl.m29680a(d, thread.getName());
                    NativeImpl.m29680a(d, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.m29680a(d, "stack:");
                    NativeImpl.m29680a(d, "\n");
                } catch (Throwable unused3) {
                }
                C9999s.m29649a(th, d);
                NativeImpl.m29688b(d);
            }
        } else {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C9972a.m29507c(C9918j.m29342g()));
                sb2.append("\n");
                C9982g.m29542a(file, sb2.toString(), false);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(th.getMessage());
                sb3.append("\n");
                C9982g.m29542a(file, sb3.toString(), true);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(th);
                sb4.append("\n");
                C9982g.m29542a(file, sb4.toString(), true);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(thread.getName());
                sb5.append("\n");
                C9982g.m29542a(file, sb5.toString(), true);
            } catch (Throwable unused4) {
            }
            try {
                C9982g.m29542a(file, "stack:\n", true);
            } catch (Throwable unused5) {
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(file, true);
                if (i == -1) {
                    try {
                        NativeImpl.m29687b(absolutePath);
                    } catch (Throwable th2) {
                        th = th2;
                        C9984i.m29565a((Closeable) fileOutputStream);
                        throw th;
                    }
                }
                C9999s.m29652a(th, new PrintStream(fileOutputStream));
                C9984i.m29565a((Closeable) fileOutputStream);
                C9984i.m29565a((Closeable) fileOutputStream);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                C9984i.m29565a((Closeable) fileOutputStream);
                throw th;
            }
        }
        return file;
    }
}
