package com.bytedance.ies.dmt.p262ui.p563c;

import android.text.TextUtils;

/* renamed from: com.bytedance.ies.dmt.ui.c.g */
public class C10772g {

    /* renamed from: a */
    private static C10772g f28885a;

    /* renamed from: b */
    private String f28886b;

    /* renamed from: c */
    private long f28887c;

    /* renamed from: a */
    public static C10772g m31442a() {
        if (f28885a == null) {
            synchronized (C10772g.class) {
                if (f28885a == null) {
                    f28885a = new C10772g();
                }
            }
        }
        return f28885a;
    }

    /* renamed from: a */
    public final boolean mo25762a(String str) {
        if (System.currentTimeMillis() - this.f28887c > 2000) {
            this.f28886b = str;
            this.f28887c = System.currentTimeMillis();
            return true;
        } else if (!TextUtils.equals(this.f28886b, str)) {
            return true;
        } else {
            return false;
        }
    }
}
