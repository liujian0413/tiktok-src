package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.MicroAppMoreElementsActivity;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.C33335j;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppElementsAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppElementsAdapter.C33324b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33300b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33310i;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33351e;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.MicroAppElementsFragment */
public class MicroAppElementsFragment extends MoreElementsFragment<MicroAppInfo, C1293v> implements C33324b, C33335j<MicroAppInfo> {

    /* renamed from: k */
    private C33300b<MicroAppInfo, C33351e> f87075k;

    /* renamed from: a */
    public final void mo85471a() {
        MicroAppMoreElementsActivity microAppMoreElementsActivity = (MicroAppMoreElementsActivity) getActivity();
        if (microAppMoreElementsActivity != null) {
            microAppMoreElementsActivity.mo85432a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo85485g() {
        super.mo85485g();
        this.f87090a.setText(getString(R.string.a__));
        this.f87091b.setText(getString(R.string.a9t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo85487i() {
        this.f87099j = new C25674b();
        this.f87075k = new C33310i();
        this.f87099j.mo66537a(this);
        this.f87099j.mo66536a(this.f87075k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo85486h() {
        super.mo85486h();
        this.f87097h = new MicroAppElementsAdapter();
        this.f87097h.f86999b = this;
        ((MicroAppElementsAdapter) this.f87097h).f87043c = this;
        this.f87098i = LoadMoreAdapter.m86888a((C1262a<VH>) this.f87097h);
        this.f87095f.setAdapter(this.f87098i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo85483a(MicroAppInfo microAppInfo) {
        String str;
        String str2 = "mp_show";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "publish_anchor_point").mo59973a("mp_id", microAppInfo.getAppId());
        String str3 = "_param_for_special";
        if (microAppInfo.getType() == 1) {
            str = "micro_app";
        } else {
            str = "micro_game";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        IMiniAppService a2 = C7167b.m22380b().mo18647a();
        C33471b a3 = new C33472a().mo85791b("publish_anchor_point").mo85792c("201014").mo85789a("recommend").mo85790a();
        a2.openMiniApp(getContext(), a2.setLaunchModeHostTask(a2.addScene(microAppInfo.getSchema(), "201014")), a3);
    }
}
