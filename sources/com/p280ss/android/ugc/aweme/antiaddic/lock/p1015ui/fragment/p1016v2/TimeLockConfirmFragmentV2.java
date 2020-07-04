package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.AbsTimeLockSettingFragment;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockConfirmFragmentV2 */
public class TimeLockConfirmFragmentV2 extends AbsTimeLockSettingFragment {

    /* renamed from: k */
    ViewGroup f60284k;

    /* renamed from: l */
    ViewGroup f60285l;

    /* renamed from: m */
    DmtTextView f60286m;

    /* renamed from: n */
    private String f60287n;

    /* renamed from: a */
    public final int mo59316a() {
        return R.string.e8j;
    }

    /* renamed from: g */
    public final void mo59248g() {
        super.mo59248g();
        C22598e.f60167a.mo59252a(getActivity(), mo59327d(), this.f60205h);
    }

    /* renamed from: b */
    public final void mo59318b(String str) {
        TimeLockUserSetting timeLockUserSetting;
        if (!this.f60287n.equals(str)) {
            C10761a.m31399c(getContext(), (int) R.string.e8i).mo25750a();
            return;
        }
        mo59317a((View) this.f60193e);
        if (!m74866a(this.f60205h, str)) {
            C18246h.m60213a(UploadTimeLockPasswordApi.m74885a(str, C21115b.m71197a().getCurUserId()), new C18245g<BaseResponse>() {
                public final void onFailure(Throwable th) {
                }

                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                }
            });
            if (this.f60205h) {
                timeLockUserSetting = TimeLockRuler.getUserSetting();
            } else {
                timeLockUserSetting = new TimeLockUserSetting();
            }
            timeLockUserSetting.setUserId(C21115b.m71197a().getCurUserId());
            timeLockUserSetting.setLastSetTime(System.currentTimeMillis());
            timeLockUserSetting.setPassword(str);
            if (this.f60205h) {
                TimeLockRuler.applyUserSetting(timeLockUserSetting);
                C10761a.m31383a((Context) getActivity(), (int) R.string.e8g).mo25750a();
                C22603f.m74724b(getActivity(), mo59327d());
                return;
            }
            C22603f.m74717a(getActivity(), mo59327d(), timeLockUserSetting);
        }
    }

    /* renamed from: a */
    public static TimeLockConfirmFragmentV2 m74865a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("password", str);
        bundle.putBoolean("from_change_pwd", z);
        TimeLockConfirmFragmentV2 timeLockConfirmFragmentV2 = new TimeLockConfirmFragmentV2();
        timeLockConfirmFragmentV2.setArguments(bundle);
        return timeLockConfirmFragmentV2;
    }

    /* renamed from: a */
    private boolean m74866a(boolean z, String str) {
        if (!C22598e.m74687f() || this.f60206i == null || getActivity() == null) {
            return false;
        }
        mo59328e();
        this.f60206i.mo59232b(C22598e.f60167a.mo59249a(mo59327d(), true, str, z, getActivity()));
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60287n = getArguments().getString("password");
        this.f60284k = (ViewGroup) view.findViewById(R.id.cwi);
        this.f60285l = (ViewGroup) view.findViewById(R.id.dke);
        if (C6399b.m19946v()) {
            this.f60284k.setBackgroundColor(getResources().getColor(R.color.a7f));
            this.f60285l.setBackgroundColor(getResources().getColor(R.color.a6c));
        }
        this.f60286m = (DmtTextView) view.findViewById(R.id.dhx);
        if (C6399b.m19944t()) {
            this.f60286m.setText(R.string.ag1);
        }
        this.f60207j = (DmtStatusView) view.findViewById(R.id.dav);
        this.f60207j.setBuilder(C10803a.m31631a((Context) getActivity()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qw, viewGroup, false);
    }
}
