package com.bytedance.android.livesdk.floatwindow;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.floatwindow.h */
public final class C7849h {

    /* renamed from: a */
    public static Map<String, C7838b> f21194a = new HashMap();

    /* renamed from: b */
    public static String f21195b = "live_default_window";

    /* renamed from: com.bytedance.android.livesdk.floatwindow.h$a */
    public static class C7850a {

        /* renamed from: a */
        Context f21196a;

        /* renamed from: b */
        View f21197b;

        /* renamed from: c */
        int f21198c;

        /* renamed from: d */
        int f21199d = -2;

        /* renamed from: e */
        int f21200e = -2;

        /* renamed from: f */
        int f21201f = 8388659;

        /* renamed from: g */
        int f21202g;

        /* renamed from: h */
        int f21203h;

        /* renamed from: i */
        boolean f21204i = true;

        /* renamed from: j */
        Class[] f21205j;

        /* renamed from: k */
        int f21206k = 3;

        /* renamed from: l */
        int f21207l;

        /* renamed from: m */
        int f21208m;

        /* renamed from: n */
        long f21209n = 300;

        /* renamed from: o */
        TimeInterpolator f21210o;

        /* renamed from: p */
        String f21211p = C7849h.f21195b;

        /* renamed from: q */
        boolean f21212q;

        /* renamed from: r */
        C7840d f21213r;

        /* renamed from: s */
        C7841e f21214s;

        private C7850a() {
        }

        /* renamed from: a */
        public final void mo20575a() {
            if (!C7849h.f21194a.containsKey(this.f21211p)) {
                if (this.f21197b != null || this.f21198c != 0) {
                    if (this.f21197b == null) {
                        this.f21197b = ((LayoutInflater) this.f21196a.getSystemService("layout_inflater")).inflate(this.f21198c, null);
                    }
                    C7849h.f21194a.put(this.f21211p, new C7843g(this));
                }
            }
        }

        /* renamed from: a */
        public final C7850a mo20567a(int i) {
            this.f21199d = i;
            return this;
        }

        /* renamed from: b */
        public final C7850a mo20576b(int i) {
            this.f21200e = i;
            return this;
        }

        /* renamed from: c */
        public final C7850a mo20578c(int i) {
            this.f21206k = 2;
            return this;
        }

        C7850a(Context context) {
            this.f21196a = context;
        }

        /* renamed from: a */
        public final C7850a mo20571a(View view) {
            this.f21197b = view;
            return this;
        }

        /* renamed from: a */
        public final C7850a mo20572a(C7841e eVar) {
            this.f21214s = eVar;
            return this;
        }

        /* renamed from: a */
        public final C7850a mo20573a(String str) {
            this.f21211p = str;
            return this;
        }

        /* renamed from: a */
        public final C7850a mo20574a(boolean z) {
            this.f21212q = true;
            return this;
        }

        /* renamed from: a */
        public final C7850a mo20569a(int i, int i2) {
            this.f21207l = 0;
            this.f21208m = 0;
            return this;
        }

        /* renamed from: a */
        public final C7850a mo20568a(int i, float f) {
            this.f21202g = (int) (((float) C9738o.m28691a(this.f21196a)) * 0.1f);
            return this;
        }

        /* renamed from: b */
        public final C7850a mo20577b(int i, float f) {
            this.f21203h = (int) (((float) C9738o.m28709b(this.f21196a)) * f);
            return this;
        }

        /* renamed from: a */
        public final C7850a mo20570a(long j, TimeInterpolator timeInterpolator) {
            this.f21209n = 300;
            this.f21210o = timeInterpolator;
            return this;
        }
    }

    /* renamed from: a */
    public static C7850a m24057a(Context context) {
        return new C7850a(context);
    }

    /* renamed from: a */
    public static void m24058a(String str) {
        f21194a.remove(str);
    }

    /* renamed from: b */
    public static C7838b m24059b(String str) {
        if (C6319n.m19593a(str)) {
            return null;
        }
        return (C7838b) f21194a.get(str);
    }
}
