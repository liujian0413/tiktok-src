package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22612c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockAboutFragmentV2.C22647a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.widget.TimeLockDesc;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23470b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockOptionsFragmentV2 */
public class TimeLockOptionsFragmentV2 extends AbsOptionsFragmentV2 {

    /* renamed from: i */
    private TimeLockDesc f60291i;

    /* renamed from: j */
    private TimeLockDesc f60292j;

    /* renamed from: k */
    private TimeLockDesc f60293k;

    /* renamed from: l */
    private int f60294l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59360a() {
        return R.layout.rk;
    }

    /* renamed from: f */
    public final boolean mo59374f() {
        if (!C22598e.m74687f()) {
            return false;
        }
        C22598e.f60167a.mo59251a(getActivity());
        return true;
    }

    /* renamed from: i */
    private void m74877i() {
        Fragment b = C22612c.m74772b(1);
        C23470b.m77051a().mo61084a("TimeLockEnterFragmentV2", Boolean.class).mo61079a((C0043i) b).mo61081a(this, new C23469a() {
            /* renamed from: a */
            public final void mo59227a(Object obj) {
                if (!TimeLockOptionsFragmentV2.this.mo59374f()) {
                    C10761a.m31383a((Context) TimeLockOptionsFragmentV2.this.getActivity(), (int) R.string.e8l).mo25750a();
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    userSetting.setTimeLockOn(false);
                    if (userSetting.isTimeLockOn() || userSetting.isContentFilterOn()) {
                        TimeLockRuler.applyUserSetting(userSetting);
                    } else {
                        TimeLockRuler.removeUserSetting();
                    }
                    C6907h.m21524a("close_time_lock_finish", (Map) C22984d.m75611a().f60753a);
                    C22603f.m74727c(TimeLockOptionsFragmentV2.this.getActivity(), 0);
                }
            }
        });
        mo59362a(b);
    }

    /* renamed from: g */
    private void m74876g() {
        this.f60260e.setText(getString(R.string.bb3));
        this.f60291i.setText(getString(R.string.cs8, Integer.valueOf(this.f60294l)));
        this.f60292j.setText(getString(R.string.b3s));
        this.f60293k.setVisibility(0);
        this.f60293k.setText(getString(R.string.b3t));
        String str = ((C22658a) mo59364d().getValue()).f60316b.f60318b;
        if (!C6399b.m19944t() || TextUtils.isEmpty(str)) {
            this.f60261f.setText(getString(R.string.b3o));
            return;
        }
        this.f60261f.setText(getString(R.string.b3p, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo59373b(View view) {
        C6907h.m21524a("close_time_lock", (Map) C22984d.m75611a().f60753a);
        if (mo59365e()) {
            mo59361a(0);
        } else {
            m74877i();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f60291i = (TimeLockDesc) view.findViewById(R.id.djd);
        this.f60292j = (TimeLockDesc) view.findViewById(R.id.dje);
        this.f60293k = (TimeLockDesc) view.findViewById(R.id.djc);
        TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
        if (mo59365e() || userSetting != null || C22598e.m74687f()) {
            if (mo59365e()) {
                i = ((C22647a) ((TimeLockOptionViewModel) C0069x.m159a(getActivity()).mo147a(TimeLockOptionViewModel.class)).f60314a.getValue()).f60283b;
            } else if (C22598e.m74687f()) {
                i = C22598e.f60167a.mo59256e();
            } else {
                i = userSetting.getLockTimeInMin();
            }
            this.f60294l = i;
            this.f60291i.setText(getString(R.string.e86, Integer.valueOf(this.f60294l)));
            this.f60292j.setText(getString(R.string.b3s));
            this.f60261f.setOnClickListener(new C22657f(this));
            if (mo59365e()) {
                m74876g();
            }
        }
    }
}
