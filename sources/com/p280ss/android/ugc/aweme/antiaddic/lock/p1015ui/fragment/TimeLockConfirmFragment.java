package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22612c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.SetTimeLockActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockConfirmFragment */
public class TimeLockConfirmFragment extends AbsTimeLockSettingFragment {

    /* renamed from: k */
    ViewGroup f60220k;

    /* renamed from: l */
    ViewGroup f60221l;

    /* renamed from: m */
    DmtTextView f60222m;

    /* renamed from: n */
    private String f60223n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59316a() {
        return R.string.e8j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59318b(String str) {
        if (!this.f60223n.equals(str)) {
            C10761a.m31399c(getContext(), (int) R.string.e8i).mo25750a();
            return;
        }
        TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
        TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
        timeLockUserSetting.setUserId(C21115b.m71197a().getCurUserId());
        timeLockUserSetting.setLastSetTime(System.currentTimeMillis());
        timeLockUserSetting.setPassword(str);
        if (userSetting == null) {
            timeLockUserSetting.setTimeLockOn(false);
            timeLockUserSetting.setContentFilterOn(false);
        } else {
            timeLockUserSetting.setTimeLockOn(userSetting.isTimeLockOn());
            timeLockUserSetting.setContentFilterOn(userSetting.isContentFilterOn());
        }
        TimeLockRuler.applyUserSetting(timeLockUserSetting);
        C6907h.onEvent(MobClick.obtain().setEventName("time_lock_on").setLabelName("set"));
        if (!this.f60205h) {
            C6907h.m21524a("open_teen_protection_finish", (Map) C22984d.m75611a().f60753a);
        }
        C10761a.m31383a(getContext(), (int) R.string.e8g).mo25750a();
        int e = getActivity().getSupportFragmentManager().mo2657e();
        mo59317a((View) this.f60193e);
        for (int i = 0; i < e; i++) {
            getActivity().getSupportFragmentManager().mo2655c();
        }
        ((SetTimeLockActivity) getActivity()).mo59306a(C22612c.m74774c(mo59327d()));
    }

    /* renamed from: a */
    public static TimeLockConfirmFragment m74801a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("password", str);
        bundle.putBoolean("from_change_pwd", z);
        TimeLockConfirmFragment timeLockConfirmFragment = new TimeLockConfirmFragment();
        timeLockConfirmFragment.setArguments(bundle);
        return timeLockConfirmFragment;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60223n = getArguments().getString("password");
        this.f60220k = (ViewGroup) view.findViewById(R.id.cwi);
        this.f60221l = (ViewGroup) view.findViewById(R.id.dke);
        if (C6399b.m19946v()) {
            this.f60220k.setBackgroundColor(getResources().getColor(R.color.a7f));
            this.f60221l.setBackgroundColor(getResources().getColor(R.color.a6c));
        }
        this.f60222m = (DmtTextView) view.findViewById(R.id.dd3);
        if (C6399b.m19944t()) {
            this.f60222m.setText(R.string.e8j);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qv, viewGroup, false);
    }
}
