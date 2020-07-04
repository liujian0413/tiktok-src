package com.bytedance.common.p477a;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.bytedance.common.a.f */
final class C9676f {

    /* renamed from: a */
    private static boolean f26407a;

    /* renamed from: b */
    private static DateFormat f26408b;

    /* renamed from: a */
    static boolean m28594a() {
        return f26407a;
    }

    static {
        try {
            f26408b = new SimpleDateFormat("HH:mm:ss");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static void m28593a(boolean z) {
        f26407a = z;
    }

    /* renamed from: b */
    static void m28595b(String str) {
        if (f26408b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(f26408b.format(new Date()));
            sb.append(" ");
            sb.append(str);
        }
    }

    /* renamed from: a */
    static void m28592a(String str) {
        if (f26407a && str != null && f26408b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(f26408b.format(new Date()));
            sb.append(" ");
            sb.append(str);
        }
    }
}
