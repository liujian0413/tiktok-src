package com.p280ss.android.ugc.aweme.i18n.checkprofile;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.i18n.checkprofile.CheckProfileAdapter.C30440a;
import com.p280ss.android.ugc.aweme.metrics.C33265g;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileActivity */
public class CheckProfileActivity extends AmeActivity implements OnClickListener, C6905a, C30440a, C30446e {

    /* renamed from: a */
    private ImmersionBar f79971a;

    /* renamed from: b */
    private CheckProfileAdapter f79972b;

    /* renamed from: c */
    private C30445d f79973c;
    RecyclerView mRecyclerView;
    View mStatusBarView;
    DmtStatusView mStatusView;
    ButtonTitleBar mTitleBar;

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private void m99426c() {
        this.f79973c.mo59134U_();
    }

    /* renamed from: a */
    public final void mo80110a() {
        this.f79972b.ag_();
    }

    public final void bd_() {
        this.f79973c.mo80122e();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f79971a != null) {
            this.f79971a.destroy();
        }
        m99426c();
    }

    /* renamed from: b */
    private void m99425b() {
        this.f79973c = new C30445d();
        this.f79973c.mo66537a(this);
        this.f79973c.mo66536a(new C30443c());
    }

    /* renamed from: f */
    private void m99429f() {
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
    }

    /* renamed from: g */
    private void m99430g() {
        this.f79972b.ah_();
        if (this.f79972b.mo62312a().isEmpty()) {
            this.mStatusView.mo25943g();
        }
    }

    public void setStatusBarColor() {
        this.f79971a = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f79971a.init();
        }
        C23487o.m77155c((Activity) this);
    }

    /* renamed from: d */
    private void m99427d() {
        this.f79972b = new CheckProfileAdapter(this);
        this.mRecyclerView.setAdapter(this.f79972b);
        this.f79972b.mo66516d(true);
        this.f79972b.mo66504a((C6905a) this);
        this.f79972b.ai_();
        this.mStatusView.mo25942f();
        this.f79973c.mo80122e();
    }

    /* renamed from: e */
    private void m99428e() {
        this.mTitleBar.setTitle((int) R.string.a39);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this));
        this.mStatusView.setBuilder(C10803a.m31631a((Context) this).mo25954a((int) R.string.cn7).mo25964b(m99424b(getString(R.string.fi2))));
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                CheckProfileActivity.this.finish();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80111a(View view) {
        bd_();
    }

    /* renamed from: a */
    public final void mo80112a(User user) {
        UserProfileActivity.m117392a((Context) this, user.getUid(), user.getSecUid());
    }

    /* renamed from: a */
    public final void mo80113a(String str) {
        this.f79972b.ah_();
        if (this.f79972b.mo62312a().isEmpty()) {
            this.mStatusView.mo25944h();
        }
    }

    /* renamed from: b */
    private C10805b m99424b(String str) {
        return new C10806a(this).mo25990b((int) R.string.fi5).mo25991b(str).mo25986a(ButtonStyle.BORDER, R.string.fia, new C30441a(this)).f29135a;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ap);
        m99425b();
        m99428e();
        m99429f();
        m99427d();
        new C33265g().mo85259b("profile_viewer_list").mo85258a("message").mo85252e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo80114a(List<User> list, boolean z) {
        this.f79972b.ai_();
        this.f79972b.mo62323c(list);
        this.f79972b.mo66516d(z);
        if (!z) {
            m99430g();
        } else if (this.f79972b.getItemCount() < 20) {
            bd_();
        }
        this.mStatusView.mo25939d();
    }
}
