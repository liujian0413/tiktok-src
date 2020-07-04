package com.p280ss.android.monitor;

import android.os.Environment;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.monitor.p890a.C19907a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import java.io.File;

/* renamed from: com.ss.android.monitor.a */
public final class C19906a {
    /* renamed from: a */
    public static void m65708a() {
        if (C6399b.m19945u() || m65711d()) {
            C19907a.m65712a();
        }
    }

    /* renamed from: d */
    public static boolean m65711d() {
        try {
            if (C30199h.m98861a().getMtLocalAnalysisHprof().intValue() == 1) {
                return true;
            }
            return false;
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static File m65709b() {
        String str;
        if (!C6399b.m19945u()) {
            str = C6399b.m19921a().getFilesDir().getAbsolutePath();
        } else {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/aweme_monitor");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: c */
    public static void m65710c() {
        String str;
        if (!C6399b.m19945u()) {
            str = C6399b.m19921a().getFilesDir().getAbsolutePath();
        } else {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/aweme_monitor");
        File file = new File(sb.toString());
        if (file.exists()) {
            file.delete();
        }
    }
}
