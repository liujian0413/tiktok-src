package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C1458e;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.C1448a;
import androidx.work.ListenableWorker.Result;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1544f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p033a.C1488c;
import androidx.work.impl.p033a.C1489d;
import androidx.work.impl.p036b.C1501g;
import androidx.work.impl.utils.p038a.C1564c;
import com.C1642a;
import com.google.common.util.concurrent.C18253l;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements C1488c {

    /* renamed from: d */
    final Object f5924d = new Object();

    /* renamed from: e */
    volatile boolean f5925e = false;

    /* renamed from: f */
    C1564c<C1448a> f5926f = C1564c.m7648a();

    /* renamed from: g */
    public ListenableWorker f5927g;

    /* renamed from: h */
    private WorkerParameters f5928h;

    /* renamed from: a */
    public final void mo6733a(List<String> list) {
    }

    /* renamed from: l */
    private static WorkDatabase m7669l() {
        return C1544f.m7577c().f5836c;
    }

    /* renamed from: k */
    private void m7668k() {
        this.f5926f.mo6820a(new C1448a(Result.FAILURE, C1458e.f5672a));
    }

    /* renamed from: c */
    public final C18253l<C1448a> mo6667c() {
        mo6671g().execute(new Runnable() {
            public final void run() {
                ConstraintTrackingWorker.this.mo6850i();
            }
        });
        return this.f5926f;
    }

    /* renamed from: e */
    public final void mo6669e() {
        super.mo6669e();
        if (this.f5927g != null) {
            this.f5927g.mo6668d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo6851j() {
        this.f5926f.mo6820a(new C1448a(Result.RETRY, C1458e.f5672a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo6850i() {
        String a = mo6666b().mo6691a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(a)) {
            m7668k();
            return;
        }
        this.f5927g = mo6672h().mo6854a(this.f5620a, a, this.f5928h);
        if (this.f5927g == null) {
            m7668k();
            return;
        }
        C1501g a2 = m7669l().mo6697i().mo6761a(mo6665a().toString());
        if (a2 == null) {
            m7668k();
            return;
        }
        C1489d dVar = new C1489d(this.f5620a, this);
        dVar.mo6736a(Collections.singletonList(a2));
        if (dVar.mo6737a(mo6665a().toString())) {
            C1642a.m8034a("Constraints met for delegate %s", new Object[]{a});
            try {
                final C18253l c = this.f5927g.mo6667c();
                c.mo6818a(new Runnable() {
                    public final void run() {
                        synchronized (ConstraintTrackingWorker.this.f5924d) {
                            if (ConstraintTrackingWorker.this.f5925e) {
                                ConstraintTrackingWorker.this.mo6851j();
                            } else {
                                ConstraintTrackingWorker.this.f5926f.mo6819a(c);
                            }
                        }
                    }
                }, mo6671g());
            } catch (Throwable th) {
                C1642a.m8034a("Delegated worker %s threw exception in startWork.", new Object[]{a});
                new Throwable[1][0] = th;
                synchronized (this.f5924d) {
                    if (this.f5925e) {
                        mo6851j();
                    } else {
                        m7668k();
                    }
                }
            }
        } else {
            C1642a.m8034a("Constraints not met for delegate %s. Requesting retry.", new Object[]{a});
            mo6851j();
        }
    }

    /* renamed from: b */
    public final void mo6734b(List<String> list) {
        C1642a.m8034a("Constraints changed for %s", new Object[]{list});
        synchronized (this.f5924d) {
            this.f5925e = true;
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5928h = workerParameters;
    }
}
