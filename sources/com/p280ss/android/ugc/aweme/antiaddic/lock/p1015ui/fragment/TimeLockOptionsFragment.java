package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.BaseLockActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33598a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockOptionsFragment */
public class TimeLockOptionsFragment extends AmeBaseFragment {

    /* renamed from: e */
    private Button f60224e;

    /* renamed from: f */
    private Button f60225f;

    /* renamed from: g */
    private View f60226g;

    /* renamed from: h */
    private TextView f60227h;

    /* renamed from: i */
    private SettingItemSwitch f60228i;

    /* renamed from: j */
    private SettingItemSwitch f60229j;

    /* renamed from: k */
    private TimeLockUserSetting f60230k;

    /* renamed from: l */
    private TextView f60231l;

    public void onResume() {
        super.onResume();
        this.f60228i.setChecked(this.f60230k.isTimeLockOn());
        this.f60229j.setChecked(this.f60230k.isContentFilterOn());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59337a(View view) {
        ((BaseLockActivity) getActivity()).mo59306a(C33598a.m108487a(TimeLockSetFragment.class).mo85934a("from_change_pwd", true).mo85932a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo59338b(View view) {
        String str;
        this.f60229j.setChecked(!this.f60229j.mo26028a());
        this.f60230k.setContentFilterOn(this.f60229j.mo26028a());
        if (this.f60229j.mo26028a()) {
            str = "on";
        } else {
            str = "off";
        }
        C6907h.m21524a("switch_teen_mode", (Map) C22984d.m75611a().mo59973a("to_status", str).f60753a);
        TimeLockRuler.applyUserSetting(this.f60230k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo59339c(View view) {
        String str;
        this.f60228i.setChecked(!this.f60228i.mo26028a());
        this.f60230k.setTimeLockOn(this.f60228i.mo26028a());
        if (this.f60228i.mo26028a()) {
            str = "on";
        } else {
            str = "off";
        }
        C6907h.m21524a("switch_time_lock", (Map) C22984d.m75611a().mo59973a("to_status", str).f60753a);
        TimeLockRuler.applyUserSetting(this.f60230k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo59340d(View view) {
        new C10741a(getContext()).mo25657b((int) R.string.apl).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.apk, (OnClickListener) new C22630g(this)).mo25656a().mo25637a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59336a(DialogInterface dialogInterface, int i) {
        TimeLockRuler.removeUserSetting();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
            C10761a.m31383a(getContext(), (int) R.string.e8_).mo25750a();
            C6907h.onEvent(MobClick.obtain().setEventName("time_lock_off").setLabelName("set"));
            C6907h.m21524a("close_teen_protection", (Map) C22984d.m75611a().f60753a);
        }
        getActivity().finish();
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f60224e = (Button) view.findViewById(R.id.qk);
        this.f60228i = (SettingItemSwitch) view.findViewById(R.id.b5_);
        this.f60229j = (SettingItemSwitch) view.findViewById(R.id.b3i);
        this.f60231l = (TextView) view.findViewById(R.id.ap9);
        TextView textView = this.f60231l;
        if (C7213d.m22500a().mo18769ag() == 0 || C6399b.m19947w() || C6399b.m19946v()) {
            i = R.string.agj;
        } else {
            i = R.string.agm;
        }
        textView.setText(i);
        this.f60226g = view.findViewById(R.id.jo);
        this.f60226g.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TimeLockOptionsFragment.this.getActivity().onBackPressed();
            }
        });
        this.f60227h = (TextView) view.findViewById(R.id.title);
        this.f60227h.setText(getResources().getText(R.string.e9_));
        this.f60230k = TimeLockRuler.getUserSetting();
        this.f60225f = (Button) view.findViewById(R.id.qj);
        if (this.f60230k != null) {
            this.f60225f.setOnClickListener(new C22626c(this));
            this.f60228i.setOnSettingItemClickListener(new C22627d(this));
            this.f60229j.setOnSettingItemClickListener(new C22628e(this));
            this.f60224e.setOnClickListener(new C22629f(this));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rj, viewGroup, false);
    }
}
