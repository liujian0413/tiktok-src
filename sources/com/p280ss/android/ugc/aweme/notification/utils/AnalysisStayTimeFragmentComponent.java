package com.p280ss.android.ugc.aweme.notification.utils;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.analysis.C6863c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent */
public class AnalysisStayTimeFragmentComponent implements C0042h {

    /* renamed from: a */
    public boolean f90384a = true;

    /* renamed from: b */
    private long f90385b = -1;

    /* renamed from: c */
    private WeakReference<C6863c> f90386c;

    /* renamed from: d */
    private Fragment f90387d;

    /* renamed from: a */
    private void m111882a() {
        this.f90385b = System.currentTimeMillis();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        if (this.f90384a) {
            m111883b();
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        if (this.f90384a) {
            m111882a();
        }
    }

    /* renamed from: c */
    private Analysis m111885c() {
        C6863c cVar;
        if (this.f90386c != null) {
            cVar = (C6863c) this.f90386c.get();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.getAnalysis();
        }
        return null;
    }

    /* renamed from: b */
    private void m111883b() {
        if (this.f90385b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f90385b;
            if (currentTimeMillis > 100 && m111885c() != null && !TextUtils.isEmpty(m111885c().getLabelName())) {
                C6907h.m21524a("stay_time", (Map) C22984d.m75611a().mo59973a("duration", String.valueOf(currentTimeMillis)).mo59973a("enter_from", m111885c().getLabelName()).f60753a);
            }
            this.f90385b = -1;
        }
    }

    /* renamed from: b */
    private void m111884b(boolean z) {
        this.f90384a = z;
        if (this.f90384a) {
            m111882a();
        } else {
            m111883b();
        }
    }

    /* renamed from: a */
    public final void mo87920a(boolean z) {
        m111884b(!z);
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment, boolean z) {
        this.f90387d = fragment;
        this.f90386c = new WeakReference<>((C6863c) fragment);
        fragment.getLifecycle().mo55a(this);
    }
}
