package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.C33054j;
import com.p280ss.android.ugc.aweme.metrics.C33248at;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFragment */
public abstract class FeedFragment extends AmeBaseFragment {

    /* renamed from: m */
    protected long f75684m = -1;

    /* renamed from: n */
    protected String f75685n;

    /* renamed from: o */
    protected int f75686o;

    /* renamed from: p */
    public Fragment f75687p;

    /* renamed from: q */
    protected String f75688q;

    /* renamed from: r */
    public String f75689r;

    /* renamed from: b */
    public void mo73838b(long j) {
    }

    /* renamed from: d_ */
    public abstract boolean mo73772d_(boolean z);

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: p */
    public abstract void mo73821p();

    /* renamed from: v */
    public final String mo73843v() {
        return this.f75685n;
    }

    /* renamed from: w */
    public int mo73844w() {
        return 0;
    }

    /* renamed from: x */
    public String mo73845x() {
        return null;
    }

    public void onPause() {
        super.onPause();
        mo73842u();
    }

    public void onResume() {
        super.onResume();
        mo73841t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo73841t() {
        if (this.mUserVisibleHint && (getActivity() instanceof C33054j) && this.f75684m == -1 && ((C33054j) getActivity()).isMainTabVisible()) {
            this.f75684m = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public void mo73842u() {
        if (this.mUserVisibleHint && this.f75684m != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f75684m;
            if (currentTimeMillis > 0) {
                if ("nearby".equals(this.f75685n)) {
                    this.f75685n = "homepage_fresh";
                }
                C6726a.m20842a(new C28991p(this, currentTimeMillis));
            }
            this.f75684m = -1;
        }
    }

    /* renamed from: c */
    public void mo73814c(boolean z) {
        mo73841t();
    }

    /* renamed from: d */
    public void mo73815d(boolean z) {
        mo73842u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo73836a(long j) {
        new C33248at().mo85138a(String.valueOf(j)).mo85139b(this.f75685n).mo85252e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo73839c(long j) {
        C6907h.m21517a(getContext(), "stay_time", this.f75685n, j, 0);
        mo73836a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo73840e(boolean z) {
        if (this.mUserVisibleHint && (getActivity() instanceof C33054j)) {
            C33054j jVar = (C33054j) getActivity();
            if (jVar != null) {
                jVar.setTabBackground(z);
            }
        }
    }

    /* renamed from: a */
    public void mo73837a(Bundle bundle) {
        if (bundle != null) {
            this.f75686o = bundle.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
            this.f75685n = bundle.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
            this.f75688q = bundle.getString("extra_follow_type", "extra_follow_type_follow");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo73837a(getArguments());
    }
}
