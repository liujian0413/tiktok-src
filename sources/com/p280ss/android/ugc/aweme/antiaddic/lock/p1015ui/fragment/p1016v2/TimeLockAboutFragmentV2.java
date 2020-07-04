package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.BaseLockActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.widget.NewSettingItem;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.widget.TimeLockDesc;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33598a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2 */
public class TimeLockAboutFragmentV2 extends AbsAboutFragmentV2 {

    /* renamed from: i */
    public NewSettingItem f60276i;

    /* renamed from: j */
    private TimeLockDesc f60277j;

    /* renamed from: k */
    private TimeLockDesc f60278k;

    /* renamed from: l */
    private TimeLockDesc f60279l;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2$a */
    public static class C22647a {

        /* renamed from: a */
        public static ArrayList<C22647a> f60282a;

        /* renamed from: b */
        public int f60283b;

        static {
            ArrayList<C22647a> arrayList = new ArrayList<>();
            f60282a = arrayList;
            arrayList.add(new C22647a(40));
            f60282a.add(new C22647a(60));
            f60282a.add(new C22647a(90));
            f60282a.add(new C22647a(120));
        }

        public C22647a(int i) {
            this.f60283b = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59351a() {
        return R.layout.ri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo59355e() {
        C6907h.m21524a("open_time_lock", (Map) C22984d.m75611a().f60753a);
        super.mo59355e();
    }

    /* renamed from: k */
    private void m74861k() {
        String str = ((C22658a) mo59356i().getValue()).f60316b.f60318b;
        if (!C6399b.m19944t() || TextUtils.isEmpty(str)) {
            this.f60249e.setText(getString(R.string.cs_));
        } else {
            this.f60249e.setText(getString(R.string.b3r, str));
        }
        this.f60277j.setText(getString(R.string.csa));
        this.f60278k.setText(getString(R.string.b3s));
        this.f60279l.setText(getString(R.string.b3t));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60277j = (TimeLockDesc) view.findViewById(R.id.dj_);
        this.f60278k = (TimeLockDesc) view.findViewById(R.id.dja);
        this.f60279l = (TimeLockDesc) view.findViewById(R.id.djb);
        this.f60276i = (NewSettingItem) view.findViewById(R.id.b59);
        if (C6399b.m19944t()) {
            this.f60276i.mo59384a();
        }
        this.f60276i.setOnSettingItemClickListener(new C10813a() {
            public final void OnSettingItemClick(View view) {
                ((BaseLockActivity) TimeLockAboutFragmentV2.this.getActivity()).mo59306a(C33598a.m108487a(TimeLockSelectTimeFragmentV2.class).mo85932a());
            }
        });
        TimeLockOptionViewModel timeLockOptionViewModel = (TimeLockOptionViewModel) C0069x.m159a(getActivity()).mo147a(TimeLockOptionViewModel.class);
        timeLockOptionViewModel.f60314a.observe(this, new C0053p<C22647a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C22647a aVar) {
                TimeLockAboutFragmentV2.this.f60276i.setRightTxt(TimeLockAboutFragmentV2.this.getString(R.string.e8w, Integer.valueOf(aVar.f60283b)));
            }
        });
        if (timeLockOptionViewModel.f60314a.getValue() == null) {
            timeLockOptionViewModel.f60314a.setValue(new C22647a(60));
        }
        if (C6399b.m19944t()) {
            this.f60279l.setText(getString(R.string.do2));
        }
        if (mo59357j()) {
            m74861k();
        }
    }
}
