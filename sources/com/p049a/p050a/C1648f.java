package com.p049a.p050a;

import com.C1642a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.a.a.f */
final class C1648f implements C1649g {

    /* renamed from: a */
    private final ThreadLocal<String> f6073a = new ThreadLocal<>();

    /* renamed from: b */
    private final List<C1644b> f6074b = new ArrayList();

    C1648f() {
    }

    /* renamed from: a */
    private String m8043a() {
        String str = (String) this.f6073a.get();
        if (str == null) {
            return null;
        }
        this.f6073a.remove();
        return str;
    }

    /* renamed from: a */
    public final void mo7036a(C1644b bVar) {
        this.f6074b.add(C1650h.m8051a(bVar));
    }

    /* renamed from: a */
    public final void mo7037a(String str, Object... objArr) {
        m8045a(3, (Throwable) null, str, objArr);
    }

    /* renamed from: b */
    private static String m8046b(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return C1642a.m8034a(str, objArr);
    }

    /* renamed from: a */
    private synchronized void m8045a(int i, Throwable th, String str, Object... objArr) {
        C1650h.m8051a(str);
        m8044a(3, m8043a(), m8046b(str, objArr), (Throwable) null);
    }

    /* renamed from: a */
    private synchronized void m8044a(int i, String str, String str2, Throwable th) {
        if (!(th == null || str2 == null)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" : ");
                sb.append(C1650h.m8052a(th));
                str2 = sb.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null && str2 == null) {
            str2 = C1650h.m8052a(th);
        }
        if (C1650h.m8053a((CharSequence) str2)) {
            str2 = "Empty/NULL log message";
        }
        for (C1644b bVar : this.f6074b) {
            if (bVar.mo7034a(i, str)) {
                bVar.mo7033a(i, str, str2);
            }
        }
    }
}
