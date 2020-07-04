package com.bytedance.ies.uikit.base;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.bytedance.ies.uikit.base.b */
public final class C11008b {

    /* renamed from: a */
    private static C11012d f29805a;

    /* renamed from: b */
    private static C11009a f29806b;

    /* renamed from: c */
    private static C11010b f29807c;

    /* renamed from: d */
    private static C11011c f29808d;

    /* renamed from: com.bytedance.ies.uikit.base.b$a */
    public interface C11009a {
        /* renamed from: a */
        void mo26592a(Activity activity);

        /* renamed from: b */
        void mo26593b(Activity activity);
    }

    /* renamed from: com.bytedance.ies.uikit.base.b$b */
    public interface C11010b {
        /* renamed from: a */
        boolean mo26594a(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: com.bytedance.ies.uikit.base.b$c */
    public interface C11011c {
        /* renamed from: a */
        void mo26595a(boolean z);
    }

    /* renamed from: com.bytedance.ies.uikit.base.b$d */
    public interface C11012d {
    }

    /* renamed from: a */
    public static C11012d m32267a() {
        return f29805a;
    }

    /* renamed from: b */
    public static C11009a m32270b() {
        return f29806b;
    }

    /* renamed from: c */
    public static C11010b m32271c() {
        return f29807c;
    }

    /* renamed from: d */
    public static C11011c m32272d() {
        return f29808d;
    }

    /* renamed from: a */
    public static void m32268a(C11009a aVar) {
        f29806b = aVar;
    }

    /* renamed from: a */
    public static void m32269a(C11011c cVar) {
        f29808d = cVar;
    }
}
