package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.C33335j;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppSearchAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.MicroAppSearchAdapter.MicroAppSearchViewHolder;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33312k;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.MicroAppSearchFragment */
public class MicroAppSearchFragment extends SearchElementsFragment<MicroAppInfo, MicroAppSearchViewHolder> implements C33335j<MicroAppInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo85488g() {
        super.mo85488g();
        this.f87105d.setHint(getString(R.string.a9t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo85489h() {
        this.f87106e = new MicroAppSearchAdapter();
        this.f87106e.f86999b = this;
        super.mo85489h();
    }

    public final void ae_() {
        super.ae_();
        C6907h.m21524a("mp_search", (Map) C22984d.m75611a().mo59973a("search_keyword", this.f87104c).mo59973a("is_success", "fail").mo59973a("enter_from", "publish_anchor_point").mo59973a("page_type", this.f87103b).f60753a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo85483a(MicroAppInfo microAppInfo) {
        IMiniAppService a = C7167b.m22380b().mo18647a();
        C33471b a2 = new C33472a().mo85791b("publish_anchor_point").mo85792c("201014").mo85789a("search").mo85790a();
        a.openMiniApp(getContext(), a.setLaunchModeHostTask(a.addScene(microAppInfo.getSchema(), "201014")), a2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f87102a = "search_history";
        this.f87110i = new C33312k();
        C6907h.m21524a("enter_mp_search_page", (Map) C22984d.m75611a().mo59973a("enter_from", "publish_anchor_point").mo59973a("page_type", this.f87103b).f60753a);
    }

    /* renamed from: a */
    public final void mo59099a(List<MicroAppInfo> list, boolean z) {
        super.mo59099a(list, z);
        C6907h.m21524a("mp_search", (Map) C22984d.m75611a().mo59973a("search_keyword", this.f87104c).mo59973a("is_success", "success").mo59973a("enter_from", "publish_anchor_point").mo59973a("page_type", this.f87103b).f60753a);
    }
}
