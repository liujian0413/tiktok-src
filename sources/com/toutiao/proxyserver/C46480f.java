package com.toutiao.proxyserver;

import android.content.Context;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.File;

/* renamed from: com.toutiao.proxyserver.f */
public final class C46480f extends C46467c {

    /* renamed from: a */
    final File f119761a;

    /* renamed from: a */
    public final void mo115608a() {
        C46476c.m146121a((Runnable) new Runnable() {
            public final void run() {
                C46480f.this.mo115609b();
            }
        });
    }

    /* renamed from: b */
    public final void mo115609b() {
        C46522q.m146227a().mo115685b();
        Context a = C46534r.m146257a();
        if (a != null) {
            C46463c.m146065a(a).mo115585a(1);
        }
        for (File delete : this.f119761a.listFiles()) {
            try {
                delete.delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    private File m146140f(String str) {
        return new File(this.f119761a, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final File mo115595d(String str) {
        return m146140f(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final File mo115596e(String str) {
        return m146140f(str);
    }
}
