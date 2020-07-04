package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.p033a.C1489d;
import androidx.work.impl.p036b.C1501g;
import com.C1642a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.c */
final class C1523c {

    /* renamed from: a */
    private final Context f5786a;

    /* renamed from: b */
    private final int f5787b;

    /* renamed from: c */
    private final C1525e f5788c;

    /* renamed from: d */
    private final C1489d f5789d = new C1489d(this.f5786a, null);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6781a() {
        List<C1501g> a = this.f5788c.f5802d.f5836c.mo6697i().mo6763a(this.f5788c.f5802d.f5835b.mo6679a());
        ConstraintProxy.m7510a(this.f5786a, a);
        this.f5789d.mo6736a(a);
        ArrayList<C1501g> arrayList = new ArrayList<>(a.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C1501g gVar : a) {
            String str = gVar.f5734a;
            if (currentTimeMillis >= gVar.mo6755c() && (!gVar.mo6756d() || this.f5789d.mo6737a(str))) {
                arrayList.add(gVar);
            }
        }
        for (C1501g gVar2 : arrayList) {
            String str2 = gVar2.f5734a;
            Intent b = C1522b.m7522b(this.f5786a, str2);
            C1642a.m8034a("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2});
            this.f5788c.mo6786a((Runnable) new C1527a(this.f5788c, b, this.f5787b));
        }
        this.f5789d.mo6735a();
    }

    C1523c(Context context, int i, C1525e eVar) {
        this.f5786a = context;
        this.f5787b = i;
        this.f5788c = eVar;
    }
}
