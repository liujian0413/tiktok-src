package androidx.work.impl.background.p037a;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.WorkInfo.State;
import androidx.work.impl.C1466a;
import androidx.work.impl.C1538c;
import androidx.work.impl.C1544f;
import androidx.work.impl.p033a.C1488c;
import androidx.work.impl.p033a.C1489d;
import androidx.work.impl.p036b.C1501g;
import com.C1642a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.a.a */
public final class C1520a implements C1466a, C1488c, C1538c {

    /* renamed from: a */
    private C1544f f5777a;

    /* renamed from: b */
    private C1489d f5778b;

    /* renamed from: c */
    private List<C1501g> f5779c = new ArrayList();

    /* renamed from: d */
    private boolean f5780d;

    /* renamed from: e */
    private final Object f5781e;

    /* renamed from: a */
    private void m7503a() {
        if (!this.f5780d) {
            this.f5777a.f5839f.mo6738a((C1466a) this);
            this.f5780d = true;
        }
    }

    /* renamed from: a */
    public final void mo6773a(String str) {
        m7503a();
        C1642a.m8034a("Cancelling work ID %s", new Object[]{str});
        this.f5777a.mo6803b(str);
    }

    /* renamed from: b */
    private void m7504b(String str) {
        synchronized (this.f5781e) {
            int size = this.f5779c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C1501g) this.f5779c.get(i)).f5734a.equals(str)) {
                    C1642a.m8034a("Stopping tracking for %s", new Object[]{str});
                    this.f5779c.remove(i);
                    this.f5778b.mo6736a(this.f5779c);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6733a(List<String> list) {
        for (String str : list) {
            C1642a.m8034a("Constraints met: Scheduling work ID %s", new Object[]{str});
            this.f5777a.mo6801a(str);
        }
    }

    /* renamed from: a */
    public final void mo6774a(C1501g... gVarArr) {
        m7503a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1501g gVar : gVarArr) {
            if (gVar.f5735b == State.ENQUEUED && !gVar.mo6753a() && gVar.f5740g == 0 && !gVar.mo6754b()) {
                if (!gVar.mo6756d()) {
                    this.f5777a.mo6801a(gVar.f5734a);
                } else if (VERSION.SDK_INT < 24 || !gVar.f5743j.mo6681a()) {
                    arrayList.add(gVar);
                    arrayList2.add(gVar.f5734a);
                }
            }
        }
        synchronized (this.f5781e) {
            if (!arrayList.isEmpty()) {
                C1642a.m8034a("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)});
                this.f5779c.addAll(arrayList);
                this.f5778b.mo6736a(this.f5779c);
            }
        }
    }

    /* renamed from: b */
    public final void mo6734b(List<String> list) {
        for (String str : list) {
            C1642a.m8034a("Constraints not met: Cancelling work ID %s", new Object[]{str});
            this.f5777a.mo6803b(str);
        }
    }

    /* renamed from: a */
    public final void mo6707a(String str, boolean z) {
        m7504b(str);
    }

    public C1520a(Context context, C1544f fVar) {
        this.f5777a = fVar;
        this.f5778b = new C1489d(context, this);
        this.f5781e = new Object();
    }
}
