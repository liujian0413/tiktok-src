package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.BaseLockActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockSetFragment */
public class TimeLockSetFragment extends AbsTimeLockSettingFragment {

    /* renamed from: k */
    ViewGroup f60233k;

    /* renamed from: l */
    ViewGroup f60234l;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59318b(String str) {
        ((BaseLockActivity) getActivity()).mo59306a((Fragment) TimeLockConfirmFragment.m74801a(str, this.f60205h));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60233k = (ViewGroup) view.findViewById(R.id.cwi);
        this.f60234l = (ViewGroup) view.findViewById(R.id.dke);
        if (C6399b.m19946v()) {
            this.f60233k.setBackgroundColor(getResources().getColor(R.color.a7f));
            this.f60234l.setBackgroundColor(getResources().getColor(R.color.a6c));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qt, viewGroup, false);
    }
}
