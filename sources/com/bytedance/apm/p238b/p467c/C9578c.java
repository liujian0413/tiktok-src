package com.bytedance.apm.p238b.p467c;

import com.bytedance.apm.C6174c;
import com.bytedance.apm.p238b.p466b.C9571a;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.p252m.C6273b;

/* renamed from: com.bytedance.apm.b.c.c */
public abstract class C9578c implements C9586i {

    /* renamed from: a */
    public String f26191a;

    /* renamed from: b */
    public boolean f26192b;

    /* renamed from: c */
    public boolean f26193c = C6174c.m19145c();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo23904a();

    /* renamed from: b */
    public void mo23898b() {
        this.f26192b = false;
        mo23907e();
    }

    /* renamed from: c */
    public void mo23899c() {
        this.f26192b = true;
        mo23907e();
    }

    /* renamed from: d */
    public void mo23900d() {
        if (!this.f26192b) {
            mo23907e();
        }
    }

    /* renamed from: e */
    private void mo23907e() {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C9603b bVar = new C9603b(C9578c.this.f26192b, System.currentTimeMillis(), C9578c.this.f26191a, C9578c.this.mo23904a());
                C9571a.m28319a().mo23885a(bVar);
            }
        });
    }

    public C9578c(String str) {
        this.f26191a = str;
    }
}
