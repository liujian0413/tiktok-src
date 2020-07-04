package com.p280ss.android.ugc.aweme.i18n.musically.follows;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.widget.LoadingStatusView;
import com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter.C30523d;
import com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter.C30528i;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.FollowFollowerActivity */
public class FollowFollowerActivity extends MusAbsActivity implements OnClickListener, C23386b, C30528i, C36040n {

    /* renamed from: a */
    private View f80188a;

    /* renamed from: b */
    private View f80189b;

    /* renamed from: c */
    private TextView f80190c;

    /* renamed from: d */
    private TextView f80191d;

    /* renamed from: e */
    private TextView f80192e;

    /* renamed from: f */
    private RecyclerView f80193f;

    /* renamed from: g */
    private SwipeRefreshLayout f80194g;

    /* renamed from: h */
    private LoadingStatusView f80195h;

    /* renamed from: i */
    private C30523d f80196i;

    /* renamed from: j */
    private C36031j f80197j;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.follows.FollowFollowerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.follows.FollowFollowerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.follows.FollowFollowerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo60744a() {
        this.f80196i.mo56976a(Integer.valueOf(1));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f80196i.mo80234e();
        this.f80197j.mo59134U_();
    }

    /* renamed from: d */
    private void m99647d() {
        this.f80196i = new C30523d(getIntent());
        this.f80196i.mo80232a(this);
        this.f80197j = new C36031j();
        this.f80197j.mo66537a(this);
    }

    /* renamed from: b */
    public final void mo80218b() {
        this.f80196i.mo56976a(Integer.valueOf(4));
    }

    /* renamed from: e */
    private void m99648e() {
        if (this.f80196i.mo80235f()) {
            this.f80190c.setText(R.string.ccp);
            this.f80191d.setText(R.string.ccn);
            this.f80192e.setText(R.string.cco);
        } else {
            this.f80190c.setText(R.string.cct);
            this.f80191d.setText(R.string.ccr);
            this.f80192e.setText(R.string.ccs);
        }
        mo60744a();
    }

    /* renamed from: c */
    private void m99646c() {
        this.f80188a = findViewById(R.id.jo);
        this.f80189b = findViewById(R.id.br_);
        this.f80190c = (TextView) findViewById(R.id.title);
        this.f80191d = (TextView) findViewById(R.id.du1);
        this.f80192e = (TextView) findViewById(R.id.du2);
        this.f80193f = (RecyclerView) findViewById(R.id.cxi);
        this.f80194g = (SwipeRefreshLayout) findViewById(R.id.cr7);
        this.f80195h = (LoadingStatusView) findViewById(R.id.dav);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.mo5427b(1);
        this.f80193f.setLayoutManager(wrapLinearLayoutManager);
        this.f80188a.setOnClickListener(this);
        this.f80194g.setOnRefreshListener(this);
    }

    /* renamed from: a */
    public final void mo80214a(C1262a aVar) {
        this.f80193f.setAdapter(aVar);
    }

    /* renamed from: c */
    public final void mo80220c(boolean z) {
        if (z) {
            this.f80195h.mo66677b();
        } else {
            this.f80195h.mo66676a();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == this.f80188a) {
            finish();
        }
    }

    public void onFollowFail(Exception exc) {
        if (isViewValid()) {
            C22814a.m75245a(this, exc, R.string.b82);
        }
    }

    /* renamed from: a */
    public final void mo80216a(boolean z) {
        if (isViewValid()) {
            this.f80194g.setRefreshing(z);
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (isViewValid()) {
            this.f80196i.mo80233a(followStatus.userId, followStatus.followStatus);
        }
    }

    /* renamed from: b */
    public final void mo80219b(boolean z) {
        int i;
        View view = this.f80189b;
        int i2 = 4;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
        RecyclerView recyclerView = this.f80193f;
        if (!z) {
            i2 = 0;
        }
        recyclerView.setVisibility(i2);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.follows.FollowFollowerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ae6);
        m99646c();
        m99647d();
        m99648e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.follows.FollowFollowerActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo80215a(String str, String str2) {
        UserProfileActivity.m117392a((Context) this, str, str2);
    }

    /* renamed from: a */
    public final boolean mo80217a(String str, int i, int i2) {
        String str2;
        String str3;
        if (this.f80197j.mo66540i()) {
            return false;
        }
        MobClick obtain = MobClick.obtain();
        if (i == 1) {
            str2 = "follow";
        } else {
            str2 = "follow_cancel";
        }
        C6907h.onEvent(obtain.setEventName(str2).setLabelName("following_list").setExtValueString(str));
        if (this.f80196i == null || !this.f80196i.mo80235f()) {
            str3 = "following_list";
        } else {
            str3 = "follower_list";
        }
        if (i == 1) {
            new C33280v().mo85341b(str3).mo85348g(str).mo85252e();
        }
        this.f80197j.mo91679a(new C36034a().mo91684a(str).mo91682a(i).mo91688c(str3).mo91689d(i2).mo91681a());
        return true;
    }
}
