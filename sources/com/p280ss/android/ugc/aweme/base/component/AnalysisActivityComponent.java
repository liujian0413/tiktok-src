package com.p280ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.analysis.C6863c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent */
public class AnalysisActivityComponent implements GenericLifecycleObserver {

    /* renamed from: a */
    Activity f61322a;

    /* renamed from: b */
    private long f61323b;

    /* renamed from: c */
    private WeakReference<C6863c> f61324c;

    /* renamed from: a */
    private void m76434a() {
        this.f61323b = System.currentTimeMillis();
    }

    /* renamed from: c */
    private Analysis m76436c() {
        C6863c cVar;
        if (this.f61324c != null) {
            cVar = (C6863c) this.f61324c.get();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.getAnalysis();
        }
        return null;
    }

    /* renamed from: b */
    private void m76435b() {
        if (this.f61323b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f61323b;
            if (currentTimeMillis > 0) {
                C1592h.m7855a((Callable<TResult>) new C23301c<TResult>(this, currentTimeMillis), (Executor) C6907h.m21516a());
            }
            this.f61323b = -1;
        }
    }

    public AnalysisActivityComponent(Activity activity) {
        this.f61322a = activity;
        if (activity instanceof C6863c) {
            this.f61324c = new WeakReference<>((C6863c) activity);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo60571a(long j) throws Exception {
        Analysis c = m76436c();
        if (c != null && !TextUtils.isEmpty(c.getLabelName())) {
            C19282c.m63183a(this.f61322a, "stay_time", c.getLabelName(), j, c.getExt_value());
            String str = "";
            String str2 = "";
            if (c.getExt_json() != null) {
                str = c.getExt_json().getString("process_id");
                str2 = c.getExt_json().getString("challenge_id");
            }
            new C33248at().mo85138a(String.valueOf(j)).mo85139b(c.getLabelName()).mo85148k(str).mo85149o(str2).mo85071g(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(String.valueOf(c.getValue()))).mo85252e();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        switch (event) {
            case ON_RESUME:
                m76434a();
                return;
            case ON_PAUSE:
                m76435b();
                break;
        }
    }
}
