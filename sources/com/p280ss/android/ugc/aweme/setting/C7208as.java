package com.p280ss.android.ugc.aweme.setting;

import android.util.SparseArray;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.setting.model.RetryPolicyItem;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;

/* renamed from: com.ss.android.ugc.aweme.setting.as */
public final class C7208as {

    /* renamed from: a */
    public static int f20148a = 10800000;

    /* renamed from: b */
    private static C7208as f20149b = new C7208as();

    /* renamed from: c */
    private SparseArray<RetryPolicyItem> f20150c = new SparseArray<>(4);

    /* renamed from: com.ss.android.ugc.aweme.setting.as$a */
    public interface C7209a {
        /* renamed from: b */
        void mo18707b();
    }

    /* renamed from: a */
    public static C7208as m22479a() {
        return f20149b;
    }

    private C7208as() {
    }

    /* renamed from: c */
    public final void mo18706c() {
        if (C7210at.m22487a(C6399b.m19921a())) {
            for (int i = 0; i < this.f20150c.size(); i++) {
                m22480a((RetryPolicyItem) this.f20150c.valueAt(i), this.f20150c.keyAt(i));
            }
        }
    }

    /* renamed from: b */
    public final void mo18705b() {
        for (int i = 0; i < this.f20150c.size(); i++) {
            RetryPolicyItem retryPolicyItem = (RetryPolicyItem) this.f20150c.valueAt(i);
            if (retryPolicyItem != null && System.currentTimeMillis() - retryPolicyItem.lastResponseTime > ((long) f20148a)) {
                retryPolicyItem.retryListener.mo18707b();
            }
        }
    }

    /* renamed from: a */
    public final void mo18703a(int i, C7209a aVar) {
        this.f20150c.put(i, new RetryPolicyItem(true, System.currentTimeMillis(), aVar));
    }

    /* renamed from: a */
    private void m22480a(RetryPolicyItem retryPolicyItem, int i) {
        if (!retryPolicyItem.isLoadSuccess) {
            if (retryPolicyItem.retryCount == 3) {
                retryPolicyItem.isLoadSuccess = true;
                retryPolicyItem.retryCount = 0;
                return;
            }
            if (System.currentTimeMillis() - retryPolicyItem.lastResponseTime > ((long) (VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT >> retryPolicyItem.retryCount))) {
                retryPolicyItem.retryCount++;
                m22481b(retryPolicyItem, i);
                retryPolicyItem.retryListener.mo18707b();
            }
        }
    }

    /* renamed from: b */
    private static void m22481b(RetryPolicyItem retryPolicyItem, int i) {
        C6877n.m21447a("aweme_setting_retry_policy", C6869c.m21381a().mo16887a("group_id", String.valueOf(i)).mo16885a("fetch_url_retry_count", Integer.valueOf(retryPolicyItem.retryCount)).mo16886a("time_interval", Long.valueOf(System.currentTimeMillis() - retryPolicyItem.lastResponseTime)).mo16888b());
    }

    /* renamed from: a */
    public final void mo18704a(int i, boolean z) {
        if (this.f20150c.get(i) != null) {
            ((RetryPolicyItem) this.f20150c.get(i)).lastResponseTime = System.currentTimeMillis();
            ((RetryPolicyItem) this.f20150c.get(i)).isLoadSuccess = z;
            if (z) {
                ((RetryPolicyItem) this.f20150c.get(i)).retryCount = 0;
            }
        }
    }
}
