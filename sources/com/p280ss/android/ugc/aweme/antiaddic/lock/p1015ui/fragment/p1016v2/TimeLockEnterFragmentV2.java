package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1013a.C22587a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1014b.C22595a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.AbsTimeLockSettingFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23470b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockEnterFragmentV2 */
public class TimeLockEnterFragmentV2 extends AbsTimeLockSettingFragment implements C22595a {

    /* renamed from: k */
    private C22587a f60289k;

    /* renamed from: l */
    private int f60290l;

    /* renamed from: f */
    public final void mo59247f() {
        super.mo59247f();
    }

    /* renamed from: i */
    private void m74872i() {
        this.f60289k = new C22587a();
        this.f60289k.mo59229a((C22595a) this);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f60289k != null) {
            this.f60289k.mo59231b();
        }
    }

    /* renamed from: g */
    public final void mo59248g() {
        super.mo59248g();
        m74870a(Boolean.valueOf(!C6399b.m19944t()));
    }

    /* renamed from: a */
    private void m74870a(Boolean bool) {
        mo59317a((View) this.f60193e);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        C23468a b = C23470b.m77051a().mo61086b("TimeLockEnterFragmentV2", Boolean.class);
        if (b != null) {
            b.mo61083a(bool);
        }
    }

    /* renamed from: b */
    public final void mo59318b(String str) {
        if (C22598e.m74687f()) {
            C22598e.m74680a(str);
            m74871c(str);
            return;
        }
        TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
        if (str == null || userSetting == null || !str.equals(userSetting.getPassword())) {
            C10761a.m31399c(getContext(), (int) R.string.e9i).mo25750a();
        } else if (C6399b.m19944t() || mo59327d() != 1 || !TimeLockRuler.isTimeLockOn() || !C21115b.m71197a().isLogin()) {
            m74870a(Boolean.valueOf(false));
        } else {
            m74870a(Boolean.valueOf(true));
        }
    }

    /* renamed from: c */
    private void m74871c(String str) {
        if (!TextUtils.isEmpty(str) && this.f60289k != null && getActivity() != null && this.f60207j != null) {
            mo59328e();
            if (this.f60290l == 2) {
                this.f60289k.mo59230a(str);
            } else if (this.f60290l != 1) {
                if (this.f60290l == 0) {
                    this.f60289k.mo59232b(C22598e.f60167a.mo59249a(mo59327d(), true, str, false, getActivity()));
                }
            } else if (C6399b.m19944t() || mo59327d() != 1 || !TimeLockRuler.isTimeLockOn() || !C21115b.m71197a().isLogin()) {
                this.f60289k.mo59232b(C22598e.f60167a.mo59249a(mo59327d(), false, str, false, getActivity()));
            } else {
                this.f60289k.mo59232b(C22598e.f60167a.mo59250a(str, true));
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        int i3;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.dhx);
        TextView textView2 = (TextView) view.findViewById(R.id.dhw);
        this.f60207j = (DmtStatusView) view.findViewById(R.id.dav);
        this.f60207j.setBuilder(C10803a.m31631a((Context) getActivity()));
        if (mo59327d() == 0) {
            str = "time_lock";
        } else {
            str = "teen_mode";
        }
        C22603f.m74718a(view, str, false);
        this.f60290l = getArguments().getInt("type_close", 0);
        if (this.f60290l == 1) {
            if (C6399b.m19944t()) {
                C23487o.m77146a(false, textView2);
                if (mo59327d() == 0) {
                    i3 = R.string.aps;
                } else {
                    i3 = R.string.apr;
                }
                textView.setText(getString(i3));
            } else {
                if (mo59327d() == 0) {
                    i = R.string.e8d;
                } else {
                    i = R.string.e5y;
                }
                textView.setText(getString(i));
                if (mo59327d() == 0 || (mo59327d() == 1 && !TimeLockRuler.isTimeLockOn() && C21115b.m71197a().isLogin())) {
                    i2 = R.string.e8c;
                } else {
                    i2 = R.string.e5u;
                }
                textView2.setText(getString(i2));
            }
        } else if (this.f60290l == 2) {
            textView.setText(getString(R.string.e8n));
            textView2.setText(getString(R.string.e8k));
        } else if (this.f60290l == 0 && C6399b.m19944t()) {
            textView.setText(getString(R.string.bu6));
            textView2.setText(getString(R.string.bu5));
        }
        m74872i();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qs, viewGroup, false);
    }
}
