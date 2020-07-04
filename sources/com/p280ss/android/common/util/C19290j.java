package com.p280ss.android.common.util;

import com.p280ss.android.http.legacy.client.p297a.C19571b;
import com.p280ss.android.http.legacy.p296a.C19565e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.common.util.j */
public final class C19290j {

    /* renamed from: a */
    public final List<C19565e> f52191a;

    /* renamed from: b */
    public String f52192b;

    /* renamed from: c */
    public String f52193c;

    public final String toString() {
        return mo51184a();
    }

    public C19290j() {
        this.f52191a = new ArrayList();
        this.f52193c = "UTF-8";
        this.f52192b = null;
    }

    /* renamed from: a */
    public final String mo51184a() {
        if (this.f52191a.isEmpty()) {
            return this.f52192b;
        }
        String a = C19571b.m64477a(this.f52191a, this.f52193c);
        if (this.f52192b == null || this.f52192b.length() == 0) {
            return a;
        }
        if (this.f52192b.indexOf(63) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f52192b);
            sb.append("&");
            sb.append(a);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f52192b);
        sb2.append("?");
        sb2.append(a);
        return sb2.toString();
    }

    public C19290j(String str) {
        this.f52191a = new ArrayList();
        this.f52193c = "UTF-8";
        this.f52192b = str;
    }

    /* renamed from: a */
    public final void mo51185a(String str, double d) {
        this.f52191a.add(new C19565e(str, String.valueOf(d)));
    }

    /* renamed from: a */
    public final void mo51186a(String str, int i) {
        this.f52191a.add(new C19565e(str, String.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo51187a(String str, long j) {
        this.f52191a.add(new C19565e(str, String.valueOf(j)));
    }

    /* renamed from: a */
    public final void mo51188a(String str, String str2) {
        this.f52191a.add(new C19565e(str, str2));
    }
}
