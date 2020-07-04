package com.bytedance.android.livesdk;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.adapter.FansClubAutoLightAdapter;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.viewmodel.FansClubAutoLightViewModel;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class FansClubAutoLightFragment extends BaseFragment {

    /* renamed from: a */
    FansClubAutoLightAdapter f11442a;

    /* renamed from: b */
    FansClubAutoLightViewModel f11443b;

    /* renamed from: c */
    RecyclerView f11444c;

    /* renamed from: d */
    SwipeRefreshLayout f11445d;

    /* renamed from: e */
    BaseDialogFragment f11446e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11340a() {
        if (this.f11443b != null) {
            this.f11443b.mo10115b();
        }
    }

    /* renamed from: b */
    private void m13598b() {
        this.f11442a = new FansClubAutoLightAdapter();
        this.f11443b = (FansClubAutoLightViewModel) C0069x.m160a(getActivity(), (C0067b) new C0067b() {
            /* renamed from: a */
            public final <T extends C0063u> T mo149a(Class<T> cls) {
                return new FansClubAutoLightViewModel();
            }
        }).mo147a(FansClubAutoLightViewModel.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11343b(View view) {
        getActivity().finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11342a(NetworkStat networkStat) {
        boolean z;
        SwipeRefreshLayout swipeRefreshLayout = this.f11445d;
        if (networkStat == null || !networkStat.mo10025a()) {
            z = false;
        } else {
            z = true;
        }
        swipeRefreshLayout.setRefreshing(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11341a(View view) {
        if (this.f11446e == null) {
            this.f11446e = C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a("https://hotsoon.snssdk.com/falcon/live_inroom/page/fans_intro/index.html?show_rule=true").mo11555a((int) C34943c.f91128x).mo11560b(360).mo11564d(12).mo11566e(17));
        }
        BaseDialogFragment.m12686a(getActivity(), (DialogFragment) this.f11446e);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m13598b();
        this.f11444c.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f11444c.setItemAnimator(null);
        this.f11444c.setAdapter(this.f11442a);
        this.f11442a.mo10076a((PagingViewModel<T>) this.f11443b);
        this.f11443b.mo22300d();
        this.f11443b.f9871c.observe(getActivity(), new C5891f(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.al7, viewGroup, false);
        this.f11444c = (RecyclerView) inflate.findViewById(R.id.aid);
        this.f11445d = (SwipeRefreshLayout) inflate.findViewById(R.id.air);
        this.f11445d.setOnRefreshListener(new C4227c(this));
        inflate.findViewById(R.id.jn).setOnClickListener(new C5885d(this));
        inflate.findViewById(R.id.b9z).setOnClickListener(new C5887e(this));
        return inflate;
    }
}
