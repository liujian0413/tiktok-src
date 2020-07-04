package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.setting.adapter.BlackListAdapter;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37634a;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37636b;
import com.p280ss.android.ugc.aweme.utils.C43064dn;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BlackListActivity */
public class BlackListActivity extends AmeBaseActivity implements C6905a, C25675c<User> {

    /* renamed from: a */
    private BlackListAdapter f98368a;

    /* renamed from: b */
    private C37636b f98369b;
    ImageView mBack;
    RecyclerView mRecyclerView;
    DmtStatusView mStatusView;
    protected TextView mTitle;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.am;
    }

    public final void aE_() {
    }

    public void back() {
        finish();
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<User> list, boolean z) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public final void aD_() {
        this.f98368a.ag_();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public BlackListAdapter mo80273k() {
        return new BlackListAdapter(this);
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (this.mStatusView != null) {
            this.mStatusView.mo25942f();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: m */
    private void m120680m() {
        if (this.f98369b != null) {
            this.f98369b.mo56976a(Integer.valueOf(1));
        }
    }

    public final void ae_() {
        if (this.f98368a.f67566v) {
            this.f98368a.mo66516d(false);
            this.f98368a.notifyDataSetChanged();
            this.f98368a.ah_();
        }
        if (this.mStatusView != null) {
            this.mStatusView.mo25943g();
        }
    }

    public final void bd_() {
        this.f98369b.mo56976a(Integer.valueOf(4));
    }

    /* renamed from: l */
    private void m120679l() {
        this.mStatusView.setBuilder(C10803a.m31631a((Context) this).mo25954a((int) R.string.tb).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C37915e(this)));
        this.mStatusView.mo25942f();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onResume", true);
        super.onResume();
        this.f98369b.mo56976a(Integer.valueOf(1));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo80272j() {
        this.f98368a = mo80273k();
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        C43064dn.m136622b(this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.f98368a);
        this.f98368a.mo66504a((C6905a) this);
        this.f98368a.mo66516d(true);
        m120679l();
        this.f98369b = new C37636b();
        this.f98369b.mo66536a(new C37634a());
        this.f98369b.mo66537a(this);
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f98368a.mo66507h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95118a(View view) {
        this.mStatusView.mo25942f();
        m120680m();
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (this.f98368a.f67566v) {
            this.f98368a.mo66516d(false);
            this.f98368a.notifyDataSetChanged();
        }
        if (this.mStatusView != null) {
            this.mStatusView.mo25944h();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onCreate", true);
        super.onCreate(bundle);
        this.mTitle.setText(R.string.tc);
        mo80272j();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo59108b(List<User> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f98368a.ah_();
        } else {
            this.f98368a.ai_();
        }
        this.f98368a.mo61577b(list);
    }

    /* renamed from: a */
    public final void mo59099a(List<User> list, boolean z) {
        this.f98368a.mo66516d(true);
        if (!z) {
            this.f98368a.ah_();
        } else {
            this.f98368a.ai_();
        }
        this.f98368a.mo58045a(list);
        if (this.mStatusView != null) {
            this.mStatusView.mo25939d();
        }
    }
}
