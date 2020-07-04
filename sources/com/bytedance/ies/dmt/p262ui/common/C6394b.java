package com.bytedance.ies.dmt.p262ui.common;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.base.C10747b;
import com.bytedance.ies.dmt.p262ui.p564d.C10787a;

/* renamed from: com.bytedance.ies.dmt.ui.common.b */
public final class C6394b {

    /* renamed from: a */
    public int f18686a;

    /* renamed from: com.bytedance.ies.dmt.ui.common.b$a */
    static class C6396a {

        /* renamed from: a */
        static C6394b f18687a = new C6394b();
    }

    /* renamed from: a */
    public static C6394b m19903a() {
        return C6396a.f18687a;
    }

    /* renamed from: a */
    public static boolean m19904a(int i) {
        return i == 1;
    }

    private C6394b() {
        this.f18686a = 1;
    }

    /* renamed from: c */
    public static boolean m19908c() {
        return m19907b(null);
    }

    /* renamed from: b */
    public static boolean m19906b() {
        if (m19903a().f18686a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m19905a(Context context) {
        if (C10787a.m31499a(context) instanceof C10747b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m19907b(Context context) {
        if (m19903a().f18686a == 0 || m19905a(context)) {
            return true;
        }
        return false;
    }
}
