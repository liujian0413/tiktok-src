package com.bytedance.android.livesdkapi.p458j.p459a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.j.a.e */
public final class C9494e {

    /* renamed from: a */
    public final List<C9490a> f25984a;

    /* renamed from: b */
    public String f25985b;

    /* renamed from: c */
    public String f25986c;

    public final String toString() {
        return mo23522a();
    }

    public C9494e() {
        this.f25984a = new ArrayList();
        this.f25986c = "UTF-8";
        this.f25985b = null;
    }

    /* renamed from: a */
    public final String mo23522a() {
        if (this.f25984a.isEmpty()) {
            return this.f25985b;
        }
        String a = C9493d.m28026a(this.f25984a, this.f25986c);
        if (this.f25985b == null || this.f25985b.length() == 0) {
            return a;
        }
        int indexOf = this.f25985b.indexOf(63);
        if (indexOf < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25985b);
            sb.append("?");
            sb.append(a);
            return sb.toString();
        } else if (this.f25985b.indexOf(61, indexOf) > 0) {
            int i = indexOf + 1;
            String substring = this.f25985b.substring(0, i);
            String substring2 = this.f25985b.substring(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(substring);
            sb2.append(a);
            sb2.append("&");
            sb2.append(substring2);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f25985b);
            sb3.append("&");
            sb3.append(a);
            return sb3.toString();
        }
    }

    public C9494e(String str) {
        this.f25984a = new ArrayList();
        this.f25986c = "UTF-8";
        this.f25985b = str;
    }

    /* renamed from: a */
    public final void mo23523a(String str, int i) {
        this.f25984a.add(new C9490a(str, String.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo23524a(String str, long j) {
        this.f25984a.add(new C9490a(str, String.valueOf(j)));
    }

    /* renamed from: a */
    public final void mo23525a(String str, String str2) {
        this.f25984a.add(new C9490a(str, str2));
    }
}
