package com.p280ss.android.monitor.p890a;

import android.os.Debug;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.p509f.C10052a;
import com.p280ss.android.monitor.C19906a;
import com.p280ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask.C32357a;
import java.io.File;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.ss.android.monitor.a.a */
public final class C19907a implements UncaughtExceptionHandler {

    /* renamed from: a */
    private static UncaughtExceptionHandler f53960a;

    /* renamed from: b */
    private Keva f53961b = Keva.getRepoSync("REPO_NAME_HEAP_OOM_HANDER", 0);

    /* renamed from: a */
    public static void m65712a() {
        f53960a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C19907a());
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        if (System.currentTimeMillis() - this.f53961b.getLong("KEY_LAST_DUMP_TIME", -1) < 3600000) {
            z = true;
        } else {
            z = false;
        }
        new StringBuilder("dump:").append(!z);
        if ((th instanceof OutOfMemoryError) && ((C6399b.m19945u() || C19906a.m65711d()) && !z)) {
            File b = C19906a.m65709b();
            try {
                C2077a.m9156a();
                if (!C32357a.m104921a()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(b.getAbsolutePath());
                    sb.append("/.dump.hprof");
                    Debug.dumpHprofData(sb.toString());
                    this.f53961b.storeLong("KEY_LAST_DUMP_TIME", System.currentTimeMillis());
                }
                if (C6399b.m19945u()) {
                    C10052a.m29858a(b, ".maps");
                    C10052a.m29857a(C6399b.m19921a(), b, ".fds");
                    C10052a.m29861b(C6399b.m19921a(), b, ".threads");
                }
            } catch (Throwable unused) {
            }
        }
        if (f53960a != null) {
            f53960a.uncaughtException(thread, th);
        }
    }
}
