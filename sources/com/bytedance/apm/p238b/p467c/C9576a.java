package com.bytedance.apm.p238b.p467c;

import android.text.TextUtils;
import com.bytedance.apm.p238b.p466b.C9571a;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.util.C9650n;
import java.util.List;

/* renamed from: com.bytedance.apm.b.c.a */
public abstract class C9576a implements C9586i {

    /* renamed from: a */
    private String f26185a;

    /* renamed from: b */
    private boolean f26186b;

    /* renamed from: b */
    public final void mo23898b() {
        this.f26186b = false;
    }

    /* renamed from: c */
    public final void mo23899c() {
        this.f26186b = true;
    }

    /* renamed from: d */
    public final void mo23900d() {
    }

    /* renamed from: a */
    private void mo23883a() {
        C9603b bVar = new C9603b(this.f26186b, System.currentTimeMillis(), this.f26185a, true);
        C9571a.m28319a().mo23885a(bVar);
    }

    /* renamed from: a */
    public final void mo23897a(String str) {
        mo23883a();
    }

    public C9576a(String str) {
        this.f26185a = str;
    }

    /* renamed from: a */
    public final C9650n<Long, Long> mo23896a(List<C9603b> list, int i, int i2) {
        long j = 0;
        CharSequence charSequence = null;
        long j2 = 0;
        while (i <= i2) {
            C9603b bVar = (C9603b) list.get(i);
            if (TextUtils.equals(this.f26185a, bVar.f26259d)) {
                String str = bVar.f26267l;
                if (charSequence != null) {
                    TextUtils.equals(charSequence, str);
                }
                if (bVar.f26257b) {
                    j++;
                } else if (bVar.mo23950a()) {
                    j2++;
                }
                charSequence = str;
            }
            i++;
        }
        return new C9650n<>(Long.valueOf(j), Long.valueOf(j2));
    }
}
