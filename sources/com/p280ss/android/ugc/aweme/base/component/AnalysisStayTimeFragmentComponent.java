package com.p280ss.android.ugc.aweme.base.component;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.analysis.C6863c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent */
public class AnalysisStayTimeFragmentComponent implements C0042h {

    /* renamed from: a */
    public boolean f61327a;

    /* renamed from: b */
    public C23292a f61328b;

    /* renamed from: c */
    private long f61329c = -1;

    /* renamed from: d */
    private WeakReference<C6863c> f61330d;

    /* renamed from: e */
    private Fragment f61331e;

    /* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent$a */
    public interface C23292a {
        /* renamed from: a */
        C33248at mo60578a(C33248at atVar);
    }

    /* renamed from: b */
    private void m76439b() {
        this.f61329c = System.currentTimeMillis();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        if (this.f61327a) {
            m76440c();
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        if (this.f61327a) {
            m76439b();
        }
    }

    /* renamed from: a */
    public final Analysis mo60572a() {
        C6863c cVar;
        if (this.f61330d != null) {
            cVar = (C6863c) this.f61330d.get();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.getAnalysis();
        }
        return null;
    }

    /* renamed from: c */
    private void m76440c() {
        if (this.f61329c != -1) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f61329c;
            if (currentTimeMillis > 100 && mo60572a() != null && !TextUtils.isEmpty(mo60572a().getLabelName())) {
                C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        C33248at b = new C33248at().mo85138a(String.valueOf(currentTimeMillis)).mo85139b(AnalysisStayTimeFragmentComponent.this.mo60572a().getLabelName());
                        if (AnalysisStayTimeFragmentComponent.this.f61328b != null) {
                            b = AnalysisStayTimeFragmentComponent.this.f61328b.mo60578a(b);
                        }
                        b.mo85252e();
                        return null;
                    }
                }, (Executor) C6907h.m21516a());
            }
            this.f61329c = -1;
        }
    }

    /* renamed from: a */
    public final void mo60573a(boolean z) {
        mo60574b(!z);
    }

    /* renamed from: b */
    public final void mo60574b(boolean z) {
        this.f61327a = z;
        if (this.f61327a) {
            m76439b();
        } else {
            m76440c();
        }
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment, boolean z) {
        this.f61327a = z;
        this.f61331e = fragment;
        this.f61330d = new WeakReference<>((C6863c) fragment);
        fragment.getLifecycle().mo55a(this);
    }
}
