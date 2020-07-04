package com.p280ss.android.ugc.aweme.account.p982ui;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.account.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.account.util.C22337n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseAccountActivity */
public class BaseAccountActivity extends AmeBaseActivity {
    @BindView(2131493136)
    public FrameLayout mContainer;
    @BindView(2131493399)
    public ViewGroup mRootContainer;
    @BindView(2131493491)
    public DmtStatusView mStatusView;

    /* renamed from: a */
    public int mo56948a() {
        return R.layout.a6;
    }

    /* renamed from: b */
    private void mo56949b() {
        getSupportFragmentManager().mo2655c();
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().mo2657e() == 1) {
            C22337n.m73944a(this, true, true);
        } else {
            mo56949b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo58616a(Fragment fragment) {
        m73705a(fragment, false);
    }

    /* renamed from: a */
    private void m73705a(Fragment fragment, boolean z) {
        if (getSupportFragmentManager().mo2658f() == null) {
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, fragment).mo2606d();
            return;
        }
        C0633q a = getSupportFragmentManager().mo2645a();
        a.mo2584a(R.anim.c4, R.anim.cc, R.anim.c2, R.anim.cf);
        a.mo2599b(R.id.aoy, fragment);
        a.mo2589a((String) null);
        a.mo2606d();
    }
}
