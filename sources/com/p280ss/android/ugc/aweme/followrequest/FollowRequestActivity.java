package com.p280ss.android.ugc.aweme.followrequest;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.followrequest.adapter.FollowRequestAdapter;
import com.p280ss.android.ugc.aweme.followrequest.p1266a.C29858a;
import com.p280ss.android.ugc.aweme.followrequest.p1266a.C29859b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36035k;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.followrequest.FollowRequestActivity */
public class FollowRequestActivity extends AmeBaseActivity implements C6905a, C29859b, C29864b {

    /* renamed from: a */
    private C29858a f78428a;

    /* renamed from: b */
    private FollowRequestAdapter f78429b;
    DmtStatusView mListStatusView;
    RecyclerView mRecyclerView;
    View mStatusView;
    TextTitleBar mTitleBar;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.br;
    }

    public void back() {
        finish();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void bd_() {
        this.f78428a.mo75843f();
    }

    /* renamed from: k */
    private void m97635k() {
        if (this.f78428a != null) {
            this.f78428a.mo75842e();
        }
    }

    /* renamed from: c */
    public final void mo58711c() {
        if (this.f78429b.f67566v) {
            this.f78429b.mo66516d(false);
            this.f78429b.notifyDataSetChanged();
            this.f78429b.ah_();
        }
        if (this.mListStatusView != null) {
            this.mListStatusView.mo25943g();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onResume", true);
        super.onResume();
        this.f78428a.mo75842e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onResume", false);
    }

    /* renamed from: j */
    private void m97634j() {
        this.mListStatusView.setBuilder(C10803a.m31631a((Context) this).mo25955a((int) R.string.d59, (int) R.string.d58).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C29857a(this)));
        this.mListStatusView.mo25942f();
    }

    /* renamed from: d */
    private void m97633d() {
        this.mTitleBar.setTitle((int) R.string.b8w);
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                FollowRequestActivity.this.finish();
            }
        });
        C23487o.m77149b((Activity) this);
        if (C6399b.m19946v()) {
            C23487o.m77155c((Activity) this);
        }
        this.f78429b = new FollowRequestAdapter(this);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this));
        this.mRecyclerView.setAdapter(this.f78429b);
        this.f78429b.mo66504a((C6905a) this);
        this.f78429b.mo66516d(true);
        m97634j();
        this.f78428a = new C29858a();
        this.f78428a.mo66536a(new C36035k());
        this.f78428a.mo66537a(this);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusView.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo75835a(View view) {
        this.mListStatusView.mo25942f();
        m97635k();
    }

    /* renamed from: a */
    public final void mo75838a(boolean z) {
        if (z) {
            this.f78429b.ag_();
            return;
        }
        if (this.mListStatusView != null) {
            this.mListStatusView.mo25942f();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onCreate", true);
        super.onCreate(bundle);
        m97633d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo75836a(Exception exc, boolean z) {
        if (z) {
            this.f78429b.mo66507h();
            return;
        }
        if (this.f78429b.f67566v) {
            this.f78429b.mo66516d(false);
            this.f78429b.notifyDataSetChanged();
        }
        if (this.mListStatusView != null) {
            this.mListStatusView.mo25944h();
        }
    }

    /* renamed from: a */
    public final void mo75837a(List<User> list, boolean z, boolean z2) {
        if (z) {
            if (list == null || list.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                this.f78429b.ah_();
            } else {
                this.f78429b.ai_();
            }
            this.f78429b.mo61577b(list);
            return;
        }
        this.f78429b.mo66516d(true);
        if (!z2) {
            this.f78429b.ah_();
        } else {
            this.f78429b.ai_();
        }
        this.f78429b.mo58045a(list);
        if (this.mListStatusView != null) {
            this.mListStatusView.mo25939d();
        }
    }
}
