package com.bytedance.crash.p490a;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.crash.C9871c.C9872a;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9900g;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.event.C9887a;
import com.bytedance.crash.event.C9888b;
import com.bytedance.crash.event.Event;
import com.bytedance.crash.p497f.C9899d;
import com.bytedance.crash.p501j.C9943d;
import com.bytedance.crash.p501j.C9954g;
import com.bytedance.crash.p501j.C9957i;
import com.bytedance.crash.p504l.C9972a;
import com.bytedance.crash.p504l.C9982g;
import com.bytedance.crash.p504l.C9992m;
import com.bytedance.crash.upload.C10016a;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.crash.a.a */
public class C9848a implements C9900g {

    /* renamed from: d */
    private static volatile C9848a f26847d;

    /* renamed from: a */
    private volatile String f26848a;

    /* renamed from: b */
    private volatile C9852c f26849b;

    /* renamed from: c */
    private volatile C9853d f26850c;

    /* renamed from: e */
    private volatile boolean f26851e;

    /* renamed from: a */
    public final void mo24415a(String str, C9852c cVar, C9853d dVar) {
        this.f26848a = str;
        this.f26849b = cVar;
        this.f26850c = dVar;
        if (!this.f26851e) {
            this.f26851e = true;
            C9954g.m29460b().mo24596a(new Runnable() {
                public final void run() {
                    C9943d.m29423a().mo24567e();
                }
            });
        }
    }

    private C9848a() {
        C9912i.m29312a((C9900g) this, CrashType.ALL);
    }

    /* renamed from: a */
    public static C9848a m29064a() {
        if (f26847d == null) {
            synchronized (C9848a.class) {
                if (f26847d == null) {
                    f26847d = new C9848a();
                }
            }
        }
        return f26847d;
    }

    /* renamed from: b */
    public final void mo24416b() {
        if (this.f26849b != null) {
            try {
                this.f26849b.mo24420a();
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    private static boolean m29067a(C9899d dVar) {
        if (TextUtils.isEmpty(dVar.f26999f) || TextUtils.isEmpty(dVar.f26998e) || TextUtils.isEmpty(dVar.f27000g) || dVar.f27001h == null || dVar.f27001h.size() == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.bytedance.crash.CrashType] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.bytedance.crash.CrashType] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.bytedance.crash.CrashType] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.bytedance.crash.CrashType] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.bytedance.crash.CrashType] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.bytedance.crash.CrashType] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], com.bytedance.crash.CrashType]
      uses: [?[OBJECT, ARRAY], java.io.Closeable]
      mth insns count: 86
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
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24414a(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = r12.f26848a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r12.f26848a
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x002e, all -> 0x0029 }
            r2.<init>(r13)     // Catch:{ Throwable -> 0x002e, all -> 0x0029 }
            r0.load(r2)     // Catch:{ Throwable -> 0x002f, all -> 0x0026 }
            goto L_0x002f
        L_0x0026:
            r13 = move-exception
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r13 = move-exception
        L_0x002a:
            com.bytedance.crash.p504l.C9984i.m29565a(r1)
            throw r13
        L_0x002e:
            r2 = r1
        L_0x002f:
            com.bytedance.crash.p504l.C9984i.m29565a(r2)
            java.lang.String r2 = "crash_time"
            java.lang.String r2 = r0.getProperty(r2)     // Catch:{ Throwable -> 0x00d4 }
            java.lang.Long r2 = java.lang.Long.decode(r2)     // Catch:{ Throwable -> 0x00d4 }
            long r6 = r2.longValue()     // Catch:{ Throwable -> 0x00d4 }
            java.io.File r2 = new java.io.File
            r2.<init>(r13)
            java.lang.String r2 = r2.getName()
            com.bytedance.crash.CrashType r3 = com.bytedance.crash.CrashType.LAUNCH
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0059
            com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.LAUNCH
        L_0x0057:
            r5 = r1
            goto L_0x0095
        L_0x0059:
            com.bytedance.crash.CrashType r3 = com.bytedance.crash.CrashType.JAVA
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0068
            com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.JAVA
            goto L_0x0057
        L_0x0068:
            com.bytedance.crash.CrashType r3 = com.bytedance.crash.CrashType.ANR
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0077
            com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.ANR
            goto L_0x0057
        L_0x0077:
            com.bytedance.crash.CrashType r3 = com.bytedance.crash.CrashType.DART
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0086
            com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.DART
            goto L_0x0057
        L_0x0086:
            com.bytedance.crash.CrashType r3 = com.bytedance.crash.CrashType.NATIVE
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0057
            com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.NATIVE
            goto L_0x0057
        L_0x0095:
            java.lang.String r1 = "process_name"
            java.lang.String r8 = r0.getProperty(r1)
            java.lang.String r1 = "alogDir"
            java.lang.String r0 = r0.getProperty(r1)
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = r12.f26848a
        L_0x00a5:
            r4 = r0
            r0 = 95
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            int r1 = r2.length()
            int r1 = r1 + -5
            java.lang.String r9 = r2.substring(r0, r1)
            com.bytedance.crash.a.d r0 = r12.f26850c
            boolean r0 = r0 instanceof com.bytedance.crash.p490a.C9851b
            if (r0 == 0) goto L_0x00c5
            com.bytedance.crash.a.b r0 = new com.bytedance.crash.a.b
            r0.<init>(r8)
        L_0x00c3:
            r11 = r0
            goto L_0x00c8
        L_0x00c5:
            com.bytedance.crash.a.d r0 = r12.f26850c
            goto L_0x00c3
        L_0x00c8:
            r3 = r12
            r10 = r13
            boolean r0 = r3.m29068a(r4, r5, r6, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x00d3
            com.bytedance.crash.p504l.C9982g.m29548a(r13)
        L_0x00d3:
            return
        L_0x00d4:
            com.bytedance.crash.p504l.C9982g.m29548a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p490a.C9848a.mo24414a(java.lang.String):void");
    }

    /* renamed from: a */
    private static C9899d m29065a(List<String> list, String str) {
        C9899d dVar = new C9899d();
        Map a = C9918j.m29332a().mo24525a();
        if (a != null) {
            dVar.f26999f = String.valueOf(a.get("aid"));
        }
        dVar.f26998e = C9918j.m29338c().mo24593a();
        dVar.f27000g = str;
        dVar.f27001h = list;
        return dVar;
    }

    /* renamed from: a */
    public final void mo24412a(CrashType crashType, long j, String str) {
        m29066a(crashType, j, str, C9972a.m29507c(C9918j.m29342g()));
    }

    /* renamed from: a */
    public final void mo24413a(CrashType crashType, String str, Thread thread) {
        if (!crashType.equals(CrashType.NATIVE)) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0078 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29066a(com.bytedance.crash.CrashType r5, long r6, java.lang.String r8, java.lang.String r9) {
        /*
            r4 = this;
            com.bytedance.crash.a.c r0 = r4.f26849b     // Catch:{ Throwable -> 0x0090 }
            if (r0 == 0) goto L_0x0014
            com.bytedance.crash.a.c r0 = r4.f26849b     // Catch:{ Throwable -> 0x000a }
            r0.mo24420a()     // Catch:{ Throwable -> 0x000a }
            goto L_0x0014
        L_0x000a:
            r0 = move-exception
            com.bytedance.crash.e r1 = com.bytedance.crash.C9875d.m29130a()     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo24453a(r2, r0)     // Catch:{ Throwable -> 0x0090 }
        L_0x0014:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0090 }
            android.content.Context r1 = com.bytedance.crash.C9918j.m29342g()     // Catch:{ Throwable -> 0x0090 }
            java.io.File r1 = com.bytedance.crash.p504l.C9992m.m29611h(r1)     // Catch:{ Throwable -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0090 }
            r2.<init>()     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r3 = r5.getName()     // Catch:{ Throwable -> 0x0090 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r3 = "_"
            r2.append(r3)     // Catch:{ Throwable -> 0x0090 }
            r2.append(r8)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r8 = ".atmp"
            r2.append(r8)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r8 = r2.toString()     // Catch:{ Throwable -> 0x0090 }
            r0.<init>(r1, r8)     // Catch:{ Throwable -> 0x0090 }
            boolean r8 = r0.exists()     // Catch:{ Throwable -> 0x0090 }
            if (r8 == 0) goto L_0x0045
            return
        L_0x0045:
            java.io.File r8 = r0.getParentFile()     // Catch:{ Throwable -> 0x0090 }
            r8.mkdirs()     // Catch:{ Throwable -> 0x0090 }
            java.util.Properties r8 = new java.util.Properties     // Catch:{ Throwable -> 0x0090 }
            r8.<init>()     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r1 = "process_name"
            r8.setProperty(r1, r9)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r9 = "crash_time"
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x0090 }
            r8.setProperty(r9, r1)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r9 = r4.f26848a     // Catch:{ Throwable -> 0x0090 }
            if (r9 == 0) goto L_0x006a
            java.lang.String r9 = "alogDir"
            java.lang.String r1 = r4.f26848a     // Catch:{ Throwable -> 0x0090 }
            r8.setProperty(r9, r1)     // Catch:{ Throwable -> 0x0090 }
        L_0x006a:
            r9 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0084, all -> 0x007e }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0084, all -> 0x007e }
            java.lang.String r0 = ""
            r8.store(r1, r0)     // Catch:{ Throwable -> 0x0078, all -> 0x007c }
            r1.close()     // Catch:{ Throwable -> 0x0078, all -> 0x007c }
        L_0x0078:
            com.bytedance.crash.p504l.C9984i.m29565a(r1)     // Catch:{ Throwable -> 0x0090 }
            goto L_0x0086
        L_0x007c:
            r5 = move-exception
            goto L_0x0080
        L_0x007e:
            r5 = move-exception
            r1 = r9
        L_0x0080:
            com.bytedance.crash.p504l.C9984i.m29565a(r1)     // Catch:{ Throwable -> 0x0090 }
            throw r5     // Catch:{ Throwable -> 0x0090 }
        L_0x0084:
            r1 = r9
            goto L_0x0078
        L_0x0086:
            java.lang.String r8 = com.bytedance.crash.C9871c.C9872a.f26939k     // Catch:{ Throwable -> 0x0090 }
            com.bytedance.crash.event.Event r5 = com.bytedance.crash.event.C9887a.m29169a(r5, r8, r6, r9)     // Catch:{ Throwable -> 0x0090 }
            com.bytedance.crash.event.C9888b.m29186b(r5)     // Catch:{ Throwable -> 0x0090 }
            return
        L_0x0090:
            r5 = move-exception
            com.bytedance.crash.e r6 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r7 = "NPTH_CATCH"
            r6.mo24453a(r7, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p490a.C9848a.m29066a(com.bytedance.crash.CrashType, long, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private boolean m29068a(String str, CrashType crashType, long j, String str2, String str3, String str4, C9853d dVar) {
        String str5 = str;
        CrashType crashType2 = crashType;
        long j2 = j;
        String str6 = str2;
        C9853d dVar2 = dVar;
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return false;
        }
        mo24416b();
        if (dVar2 == null) {
            return false;
        }
        List a = dVar2.mo24419a(str, j2);
        if (a.size() > 0 && str6 != null) {
            try {
                C9899d a2 = m29065a(a, str6);
                Event a3 = C9887a.m29170a(crashType, C9872a.f26940l, j2, C9957i.m29466a().mo24583a(j2));
                if (crashType2 != null) {
                    C9888b.m29186b(a3);
                }
                if (!m29067a(a2)) {
                    return true;
                }
                String a4 = C9982g.m29537a(C9992m.m29611h(C9918j.m29342g()), C9992m.m29601c(), a2.f26998e, a2.f26999f, a2.f27000g, a2.f27001h);
                if (!TextUtils.isEmpty(str4)) {
                    C9982g.m29548a(str4);
                }
                final C9899d dVar3 = a2;
                final CrashType crashType3 = crashType;
                final Event event = a3;
                final String str7 = a4;
                C98502 r16 = new Runnable() {
                    public final void run() {
                        C10016a.m29765a();
                        if (C10016a.m29766a(dVar3.f26999f, dVar3.f26998e, dVar3.f27000g, dVar3.f27001h)) {
                            if (crashType3 != null) {
                                C9888b.m29186b(event.eventType(C9872a.f26941m));
                            }
                            C9982g.m29548a(str7);
                        }
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    try {
                        C9954g.m29460b().mo24596a(r16);
                    } catch (Throwable unused) {
                    }
                } else {
                    r16.run();
                }
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
        return true;
    }
}
