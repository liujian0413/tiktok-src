package com.bytedance.crash.p492c;

import com.bytedance.crash.C9918j;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.crash.c.b */
public final class C9874b {

    /* renamed from: a */
    private static AtomicBoolean f26943a = new AtomicBoolean(false);

    /* renamed from: a */
    public static boolean m29128a() {
        synchronized (f26943a) {
            if (f26943a.get()) {
                return false;
            }
            f26943a.set(true);
            return m29129b();
        }
    }

    /* renamed from: b */
    public static boolean m29129b() {
        if (C9918j.m29344i().mo24559b() == null || !C9918j.m29344i().mo24559b().getLogTypeSwitch("npth_force_apm_crash")) {
            return false;
        }
        try {
            File file = new File(C9918j.m29343h().getFilesDir(), "crashCommand");
            file.mkdirs();
            StringBuilder sb = new StringBuilder("0_");
            sb.append(System.currentTimeMillis());
            new File(file, sb.toString()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
