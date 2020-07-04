package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22612c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.SetTimeLockActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockEnterFragment */
public class TimeLockEnterFragment extends AbsTimeLockSettingFragment {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59318b(String str) {
        TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
        if (str == null || userSetting == null || !str.equals(userSetting.getPassword())) {
            C10761a.m31399c(getContext(), (int) R.string.e9i).mo25750a();
            return;
        }
        mo59317a((View) this.f60193e);
        C0608j supportFragmentManager = getActivity().getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        a.mo2587a((Fragment) this);
        a.mo2604c();
        supportFragmentManager.mo2655c();
        ((SetTimeLockActivity) getActivity()).mo59306a(C22612c.m74774c(mo59327d()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qr, viewGroup, false);
    }
}
