package com.p280ss.android.ugc.aweme.mediachoose.p1390a;

import android.os.Environment;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a.b */
public class C33151b {

    /* renamed from: a */
    public static final String f86287a;

    /* renamed from: d */
    private static C33151b f86288d;

    /* renamed from: b */
    public int f86289b = ((int) C39810eq.m127460a());

    /* renamed from: c */
    public int f86290c = 600000;

    private C33151b() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
        sb.append(File.separator);
        sb.append("neihanduanzi");
        f86287a = sb.toString();
    }

    /* renamed from: a */
    public static C33151b m106967a() {
        if (f86288d == null) {
            synchronized (C33151b.class) {
                f86288d = new C33151b();
            }
        }
        return f86288d;
    }
}
