package com.bytedance.apm.p238b.p467c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.p238b.p466b.C9571a;
import com.bytedance.apm.p238b.p466b.C9575b;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.p245h.C9608i;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.util.C9656t;
import java.util.List;

/* renamed from: com.bytedance.apm.b.c.g */
public final class C9583g extends C9578c {

    /* renamed from: d */
    private volatile boolean f26195d;

    /* renamed from: f */
    private static String m28364f() {
        return "traffic";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo23904a() {
        return 0;
    }

    /* renamed from: b */
    public final void mo23898b() {
        m28365g();
    }

    /* renamed from: c */
    public final void mo23899c() {
    }

    /* renamed from: d */
    public final void mo23900d() {
        m28365g();
    }

    /* renamed from: g */
    private void m28365g() {
        if (this.f26193c) {
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        C9583g.this.mo23907e();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo23907e() {
        if (!this.f26195d) {
            this.f26195d = true;
        }
        C9608i b = C9656t.m28555b();
        if (b != null) {
            String f = m28364f();
            C9603b bVar = new C9603b(true, System.currentTimeMillis(), f, b.f26293i);
            C9571a.m28319a().mo23885a(bVar);
            C9603b bVar2 = new C9603b(false, System.currentTimeMillis(), f, b.f26294j);
            C9571a.m28319a().mo23885a(bVar2);
        }
    }

    public C9583g(Context context) {
        super("traffic");
    }

    /* renamed from: a */
    public final void mo23906a(C9575b bVar, List<C9603b> list, int i, int i2) {
        String str;
        C9575b bVar2 = bVar;
        if (this.f26193c) {
            String f = m28364f();
            int i3 = i;
            int i4 = i2;
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            while (i3 < i4) {
                C9603b bVar3 = (C9603b) list.get(i3);
                if (TextUtils.equals(f, bVar3.f26259d)) {
                    str = f;
                    if (bVar3.f26262g >= 0) {
                        if (bVar3.f26257b) {
                            if (j2 == 0) {
                                j2 = bVar3.f26262g;
                            }
                            j = bVar3.f26262g;
                        } else {
                            if (j4 == 0) {
                                j4 = bVar3.f26262g;
                            }
                            j3 = bVar3.f26262g;
                        }
                    }
                } else {
                    str = f;
                }
                i3++;
                f = str;
            }
            long j5 = j3 - j4;
            bVar2.f26167i = j - j2;
            bVar2.f26172n = j5;
            return;
        }
        bVar2.f26167i = 0;
        bVar2.f26172n = 0;
    }
}
