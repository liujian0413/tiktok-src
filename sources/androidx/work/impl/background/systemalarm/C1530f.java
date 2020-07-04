package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.impl.C1538c;
import androidx.work.impl.p036b.C1501g;
import com.C1642a;

/* renamed from: androidx.work.impl.background.systemalarm.f */
public final class C1530f implements C1538c {

    /* renamed from: a */
    private final Context f5813a;

    public C1530f(Context context) {
        this.f5813a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo6773a(String str) {
        this.f5813a.startService(C1522b.m7524c(this.f5813a, str));
    }

    /* renamed from: a */
    private void m7551a(C1501g gVar) {
        C1642a.m8034a("Scheduling work with workSpecId %s", new Object[]{gVar.f5734a});
        this.f5813a.startService(C1522b.m7518a(this.f5813a, gVar.f5734a));
    }

    /* renamed from: a */
    public final void mo6774a(C1501g... gVarArr) {
        for (C1501g a : gVarArr) {
            m7551a(a);
        }
    }
}
