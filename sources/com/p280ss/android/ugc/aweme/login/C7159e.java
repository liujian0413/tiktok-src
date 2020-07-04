package com.p280ss.android.ugc.aweme.login;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.base.AmeActivity;

/* renamed from: com.ss.android.ugc.aweme.login.e */
public final class C7159e {

    /* renamed from: a */
    private static C7160a f20072a;

    /* renamed from: com.ss.android.ugc.aweme.login.e$a */
    public static class C7160a {

        /* renamed from: a */
        public Class<?> f20073a;

        /* renamed from: b */
        public int f20074b = 1;

        /* renamed from: c */
        public C7161b f20075c;

        /* renamed from: d */
        public String f20076d;

        /* renamed from: a */
        public final void mo18610a() {
            this.f20073a = null;
            this.f20074b = 1;
            this.f20075c = null;
            this.f20076d = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.e$b */
    public interface C7161b {
    }

    /* renamed from: a */
    public static void m22356a(Activity activity) {
        m22357a(activity, null, null, null, 1, false);
    }

    /* renamed from: a */
    private static void m22358a(Class<?> cls, C7161b bVar, String str, int i) {
        if (f20072a == null) {
            f20072a = new C7160a();
        } else {
            f20072a.mo18610a();
        }
        f20072a.f20074b = i;
        f20072a.f20073a = cls;
        f20072a.f20076d = str;
        f20072a.f20075c = bVar;
    }

    /* renamed from: a */
    private static void m22357a(Activity activity, Class<?> cls, C7161b bVar, String str, int i, boolean z) {
        m22358a(null, null, null, 1);
        if (activity instanceof AmeActivity) {
            ((AmeActivity) activity).showLoginDialog();
        }
    }
}
