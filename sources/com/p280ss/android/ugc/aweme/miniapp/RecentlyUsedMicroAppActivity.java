package com.p280ss.android.ugc.aweme.miniapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.p280ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppListAdapter;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity */
public class RecentlyUsedMicroAppActivity extends AmeSSActivity implements C25675c<MicroAppInfo>, C28532n {

    /* renamed from: a */
    private C25674b<C33413p> f86947a;

    /* renamed from: b */
    private RecentlyMicroAppListAdapter f86948b;

    /* renamed from: c */
    private LoadMoreAdapter f86949c;
    RecyclerView mListView;
    DmtStatusView mStatusView;
    TextTitleBar mTextTitleBar;

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<MicroAppInfo> list, boolean z) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void aD_() {
        if (isViewValid()) {
            this.f86949c.mo67986a(1);
        }
    }

    public final boolean aR_() {
        if (this.f86949c.f69540a != 0) {
            return true;
        }
        return false;
    }

    public final void ae_() {
        if (isViewValid()) {
            this.mStatusView.mo25943g();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.c2, R.anim.cf);
    }

    public void setStatusBarColor() {
        C43098ej.m136710a(this, getResources().getColor(R.color.a3z));
    }

    /* renamed from: h */
    private void m107668h() {
        this.f86947a = new C25674b<>();
        this.f86947a.mo66536a(new C33413p());
        this.f86947a.mo66537a(this);
    }

    /* renamed from: i */
    private void m107669i() {
        if (this.mStatusView.mo25940d(true)) {
            this.f86947a.mo56976a(Integer.valueOf(1));
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid() && !this.mStatusView.f29075b) {
            this.mStatusView.mo25942f();
        }
    }

    public final void aP_() {
        this.f86947a.mo56976a(Integer.valueOf(4));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f86947a != null) {
            this.f86947a.mo66535W_();
            this.f86947a.mo59134U_();
        }
    }

    /* renamed from: g */
    private void m107667g() {
        C10805b a = C43361b.m137644a(this, new C33415q(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        this.mStatusView.setBuilder(C10803a.m31631a((Context) this).mo25963b(LayoutInflater.from(this).inflate(R.layout.b3m, null)).mo25966c((View) dmtDefaultView));
        this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.ml));
        this.mListView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        this.f86948b = new RecentlyMicroAppListAdapter(0);
        this.f86949c = LoadMoreAdapter.m86888a((C1262a<VH>) this.f86948b);
        this.mListView.setAdapter(this.f86949c);
        this.mListView.setOnFlingListener(new OnRecyclerViewFlingListener(this.mListView, this));
        String str = (String) SharePrefCache.inst().getMiniAppLabelTitle().mo59877d();
        if (!TextUtils.isEmpty(str)) {
            this.mTextTitleBar.setTitle((CharSequence) str);
        }
        this.mTextTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                RecentlyUsedMicroAppActivity.this.finish();
            }
        });
        this.mTextTitleBar.getBackBtn().setContentDescription(getString(R.string.pp));
        C0991u.m4206c((View) this.mTextTitleBar.getEndText(), 2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85405a(View view) {
        m107669i();
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        this.f86949c.mo67986a(z ? 1 : 0);
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.mo25944h();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            this.f86949c.mo67986a(2);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cp);
        ButterKnife.bind((Activity) this);
        m107667g();
        m107668h();
        m107669i();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo59099a(List<MicroAppInfo> list, boolean z) {
        if (isViewValid()) {
            this.mStatusView.mo25938c(true);
            this.f86949c.mo67986a(z ? 1 : 0);
            this.f86948b.mo85412a(list);
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<MicroAppInfo> list, boolean z) {
        if (isViewValid()) {
            if (!C6307b.m19566a((Collection<T>) list)) {
                if (C7213d.m22500a().mo18803bo().useRecyclerPartialUpdate) {
                    this.f86948b.mo85414b(list);
                } else {
                    this.f86948b.mo85412a(list);
                }
            }
            this.f86949c.mo67986a(z ? 1 : 0);
        }
    }
}
