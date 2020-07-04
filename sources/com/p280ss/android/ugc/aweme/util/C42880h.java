package com.p280ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.util.h */
public final class C42880h {
    /* renamed from: a */
    public static void m136156a(String str) {
        C6921a.m21555a(str);
    }

    /* renamed from: a */
    public static void m136157a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder("  logFile is null :");
                sb.append(str);
                C6921a.m21555a(sb.toString());
                return;
            }
            File file = new File(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("   filePath:");
            sb2.append(file.getAbsolutePath());
            sb2.append("         exist:");
            sb2.append(file.exists());
            sb2.append("        fileSize:");
            sb2.append(file.length());
            C6921a.m21555a(sb2.toString());
        } catch (Exception unused) {
        }
    }
}
