package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import bolts.C1592h;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p501j.p502a.C9930f;
import com.bytedance.crash.upload.C10016a;
import com.p280ss.android.monitor.C19906a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import shark.LeakReference;
import shark.LeakTrace;
import shark.LeakTraceElement;
import shark.OnAnalysisProgressListener;
import shark.OnAnalysisProgressListener.Step;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask */
public final class AnalysisHprofTask implements LegoTask {
    public static final C32357a Companion = new C32357a(null);
    public static volatile boolean inProgress;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask$a */
    public static final class C32357a {
        private C32357a() {
        }

        /* renamed from: a */
        public static boolean m104921a() {
            return AnalysisHprofTask.inProgress;
        }

        /* renamed from: a */
        public static void m104920a(boolean z) {
            AnalysisHprofTask.inProgress = z;
        }

        public /* synthetic */ C32357a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask$b */
    static final class C32358b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ AnalysisHprofTask f84469a;

        /* renamed from: b */
        final /* synthetic */ File f84470b;

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask$b$a */
        public static final class C32359a implements OnAnalysisProgressListener {
            /* renamed from: a */
            public final void mo83581a(Step step) {
                C7573i.m23587b(step, "step");
            }
        }

        C32358b(AnalysisHprofTask analysisHprofTask, File file) {
            this.f84469a = analysisHprofTask;
            this.f84470b = file;
        }

        public final /* synthetic */ Object call() {
            m104922a();
            return C7581n.f20898a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[Catch:{ Throwable -> 0x00d2, all -> 0x00cd }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x006b A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m104922a() {
            /*
                r12 = this;
                boolean r0 = com.p280ss.android.monitor.C19906a.m65711d()
                if (r0 == 0) goto L_0x00d6
                r0 = 1
                r1 = 0
                com.p280ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask.C32357a.m104920a(r0)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask$b$a r2 = new com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask$b$a     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r2.<init>()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                shark.OnAnalysisProgressListener r2 = (shark.OnAnalysisProgressListener) r2     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                shark.e r3 = new shark.e     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r3.<init>(r2)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.io.File r4 = r12.f84470b     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.List r5 = shark.AndroidReferenceMatchers.C48683u.m150419a()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r6 = 1
                java.util.List r7 = shark.AndroidObjectInspectors.C48536f.m150331a()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r8 = 0
                r9 = 0
                r10 = 48
                r11 = 0
                shark.HeapAnalysis r2 = r3.m150485a(r4, r5, true, r7, r7, (shark.C48860v) null)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                boolean r3 = r2 instanceof shark.HeapAnalysisSuccess     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                if (r3 == 0) goto L_0x00c4
                shark.HeapAnalysisSuccess r2 = (shark.HeapAnalysisSuccess) r2     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.List r2 = r2.getApplicationLeaks()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r4 = 10
                int r4 = kotlin.collections.C7525m.m23469a(r2, r4)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r3.<init>(r4)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
            L_0x0048:
                boolean r4 = r2.hasNext()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                if (r4 == 0) goto L_0x005c
                java.lang.Object r4 = r2.next()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                shark.ApplicationLeak r4 = (shark.ApplicationLeak) r4     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                shark.LeakTrace r4 = r4.getLeakTrace()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r3.add(r4)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                goto L_0x0048
            L_0x005c:
                java.util.List r3 = (java.util.List) r3     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r2.<init>()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
            L_0x006b:
                boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                if (r4 == 0) goto L_0x00a4
                java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r5 = r4
                shark.LeakTrace r5 = (shark.LeakTrace) r5     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.List r5 = r5.getElements()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r6 = r5
                java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                if (r6 == 0) goto L_0x008a
                boolean r6 = r6.isEmpty()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                if (r6 == 0) goto L_0x0088
                goto L_0x008a
            L_0x0088:
                r6 = 0
                goto L_0x008b
            L_0x008a:
                r6 = 1
            L_0x008b:
                if (r6 != 0) goto L_0x009d
                java.lang.Object r5 = kotlin.collections.C7525m.m23515h(r5)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                shark.LeakTraceElement r5 = (shark.LeakTraceElement) r5     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                shark.LeakNodeStatus r5 = r5.getLeakStatus()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                shark.LeakNodeStatus r6 = shark.LeakNodeStatus.NOT_LEAKING     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                if (r5 == r6) goto L_0x009d
                r5 = 1
                goto L_0x009e
            L_0x009d:
                r5 = 0
            L_0x009e:
                if (r5 == 0) goto L_0x006b
                r2.add(r4)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                goto L_0x006b
            L_0x00a4:
                java.util.List r2 = (java.util.List) r2     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                boolean r0 = r2.isEmpty()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                if (r0 != 0) goto L_0x00c4
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                java.util.Iterator r0 = r2.iterator()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
            L_0x00b2:
                boolean r2 = r0.hasNext()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                if (r2 == 0) goto L_0x00c4
                java.lang.Object r2 = r0.next()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                shark.LeakTrace r2 = (shark.LeakTrace) r2     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask r3 = r12.f84469a     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r3.reportTrace(r2)     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                goto L_0x00b2
            L_0x00c4:
                com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask r0 = r12.f84469a     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                r0.tryRemoveFile()     // Catch:{ Throwable -> 0x00d2, all -> 0x00cd }
                com.p280ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask.C32357a.m104920a(r1)
                return
            L_0x00cd:
                r0 = move-exception
                com.p280ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask.C32357a.m104920a(r1)
                throw r0
            L_0x00d2:
                com.p280ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask.C32357a.m104920a(r1)
                return
            L_0x00d6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask.C32358b.m104922a():void");
        }
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void tryRemoveFile() {
        try {
            File b = C19906a.m65709b();
            StringBuilder sb = new StringBuilder();
            C7573i.m23582a((Object) b, "dir");
            sb.append(b.getAbsolutePath());
            sb.append("/.dump.hprof");
            File file = new File(sb.toString());
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    public final void run(Context context) {
        C19906a.m65708a();
        File b = C19906a.m65709b();
        StringBuilder sb = new StringBuilder();
        C7573i.m23582a((Object) b, "dir");
        sb.append(b.getAbsolutePath());
        sb.append("/.dump.hprof");
        File file = new File(sb.toString());
        if (file.exists()) {
            C1592h.m7853a((Callable<TResult>) new C32358b<TResult>(this, file));
        }
    }

    public final void reportTrace(LeakTrace leakTrace) {
        String renderToTrace = renderToTrace(leakTrace);
        if (C9912i.m29316a()) {
            C9896a aVar = new C9896a(new JSONObject());
            aVar.mo24492a("data", (Object) renderToTrace);
            aVar.mo24492a("isOOM", (Object) Boolean.valueOf(false));
            aVar.mo24492a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
            C9896a a = C9930f.m29397a().mo24554a(CrashType.JAVA, aVar);
            C7573i.m23582a((Object) a, "CrashContextAssembly.get…ash(CrashType.JAVA, body)");
            C10016a.m29765a().mo24637a(a, (File) null, (String) null, false);
        }
    }

    private final String renderToTrace(LeakTrace leakTrace) {
        boolean z;
        boolean z2;
        Collection elements = leakTrace.getElements();
        if (elements == null || elements.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("MTOOMLeakError: ");
        sb.append(elementDescription((LeakTraceElement) leakTrace.getElements().get(0), false));
        sb.append(" caused memory leak\n");
        stringBuffer.append(sb.toString());
        int i = 0;
        for (Object next : leakTrace.getElements()) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            LeakTraceElement leakTraceElement = (LeakTraceElement) next;
            StringBuilder sb2 = new StringBuilder("at ");
            if (i != leakTrace.getElements().size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb2.append(elementDescription(leakTraceElement, z2));
            stringBuffer.append(sb2.toString());
            if (i != leakTrace.getElements().size() - 1) {
                StringBuilder sb3 = new StringBuilder("(");
                sb3.append(leakTraceElement.getClassSimpleName());
                sb3.append(".java:0)\n");
                stringBuffer.append(sb3.toString());
            } else {
                stringBuffer.append(".class");
                StringBuilder sb4 = new StringBuilder("(");
                sb4.append(leakTraceElement.getClassSimpleName());
                sb4.append(".java:0)");
                stringBuffer.append(sb4.toString());
            }
            i = i2;
        }
        String stringBuffer2 = stringBuffer.toString();
        C7573i.m23582a((Object) stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    private final String elementDescription(LeakTraceElement leakTraceElement, boolean z) {
        String str;
        if (leakTraceElement.getReference() != null) {
            LeakReference reference = leakTraceElement.getReference();
            if (reference == null) {
                C7573i.m23580a();
            }
            str = String.valueOf(reference.getDisplayName());
        } else {
            str = "";
        }
        if (!z) {
            return String.valueOf(leakTraceElement.getClassName());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(leakTraceElement.getClassName());
        sb.append('.');
        sb.append(str);
        return sb.toString();
    }
}
