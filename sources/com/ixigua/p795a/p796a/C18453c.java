package com.ixigua.p795a.p796a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p254b.C6304f;
import com.ixigua.downloader.C18462a;
import com.ixigua.downloader.C18484i;
import com.ixigua.downloader.p797a.C18464b;
import com.ixigua.downloader.pojo.Task;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ixigua.a.a.c */
public class C18453c {

    /* renamed from: a */
    static volatile String f50025a = "";

    /* renamed from: b */
    private static volatile C18453c f50026b;

    /* renamed from: c */
    private Context f50027c;

    /* renamed from: b */
    private void m60763b() {
        new C6304f("file_op") {
            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append(C18453c.f50025a);
                sb.append(File.separator);
                sb.append(".nomedia");
                C18464b.m60808b(new File(sb.toString()));
            }
        }.start();
    }

    /* renamed from: a */
    private void m60761a() {
        if (this.f50027c != null) {
            File externalFilesDir = this.f50027c.getExternalFilesDir("resources");
            if (externalFilesDir != null) {
                f50025a = externalFilesDir.getPath();
                m60763b();
            }
        }
    }

    /* renamed from: a */
    public static boolean m60762a(C18456d dVar) {
        if (dVar == null || !dVar.mo47925c()) {
            return false;
        }
        return true;
    }

    private C18453c(Context context) {
        if (context != null) {
            this.f50027c = context.getApplicationContext();
            if (this.f50027c == null) {
                this.f50027c = context;
            }
        }
        C18462a.m60789a().mo47941a(context);
        m60761a();
    }

    /* renamed from: a */
    public static C18453c m60760a(Context context) {
        if (f50026b == null) {
            synchronized (C18453c.class) {
                if (f50026b == null) {
                    f50026b = new C18453c(context);
                }
            }
        }
        return f50026b;
    }

    /* renamed from: b */
    public final String mo47919b(C18456d dVar) {
        if (m60762a(dVar)) {
            return dVar.mo47924b();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo47918a(final C18456d dVar, final C18450a aVar) {
        String str;
        if (dVar != null && dVar.mo47923a()) {
            if (TextUtils.isEmpty(f50025a)) {
                HashMap hashMap = new HashMap();
                hashMap.put("result_code", "102");
                String str2 = "is_sdcard_available";
                if (C18464b.m60805a()) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put(str2, str);
                C18451b.m60753a();
                C18451b.m60754a(dVar, aVar, null, 102, hashMap);
                return;
            }
            C18462a.m60789a().mo47942a(dVar.mo47926d(), new C18484i() {
                /* renamed from: a */
                public final void mo47921a(Task task, Map<String, String> map) {
                    C18451b.m60753a().mo47913a(dVar, aVar, task, map);
                }

                /* renamed from: a */
                public final boolean mo47922a(Task task, int i, Map<String, String> map) {
                    C18451b.m60753a();
                    C18451b.m60754a(dVar, aVar, task, i, map);
                    if (i == 13 || i == 30 || i == 15 || i == 14 || i == 12) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: a */
                public final void mo47920a(Task task, long j, long j2, int i, float f) {
                    C18451b.m60753a();
                }
            });
            C18462a.m60789a().mo47946c(dVar.mo47926d());
        }
    }
}
