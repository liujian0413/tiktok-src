package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1013a.C22587a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1014b.C22595a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AbsTimeLockSettingFragment */
public abstract class AbsTimeLockSettingFragment extends AbsTimeLockFragment implements C22595a {

    /* renamed from: h */
    protected boolean f60205h;

    /* renamed from: i */
    protected C22587a f60206i;

    /* renamed from: j */
    protected DmtStatusView f60207j;

    /* renamed from: k */
    private View f60208k;

    /* renamed from: f */
    public void mo59247f() {
        m74781j();
    }

    /* renamed from: g */
    public void mo59248g() {
        m74781j();
    }

    /* renamed from: i */
    private void m74780i() {
        this.f60206i = new C22587a();
        this.f60206i.mo59229a((C22595a) this);
    }

    /* renamed from: j */
    private void m74781j() {
        if (isViewValid() && this.f60207j != null) {
            this.f60207j.mo25939d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo59328e() {
        if (this.f60207j != null) {
            this.f60207j.mo25942f();
        }
    }

    /* renamed from: d */
    public final int mo59327d() {
        return ((C22658a) ((SetLockParamViewModel) C0069x.m159a(getActivity()).mo147a(SetLockParamViewModel.class)).f60313a.getValue()).f60315a;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f60206i != null && isViewValid()) {
            this.f60206i.mo59231b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60208k = view.findViewById(R.id.jo);
        this.f60208k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                AbsTimeLockSettingFragment.this.getActivity().onBackPressed();
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f60205h = arguments.getBoolean("from_change_pwd", false);
        }
        m74780i();
    }
}
