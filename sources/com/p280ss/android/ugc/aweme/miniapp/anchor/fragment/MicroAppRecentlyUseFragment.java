package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.p280ss.android.ugc.aweme.miniapp.anchor.MoreElementsActivity;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.ElementRecentlyUseAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33298a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.MicroAppRecentlyUseFragment */
public class MicroAppRecentlyUseFragment extends Fragment implements C25675c<MicroAppInfo>, C28532n {

    /* renamed from: a */
    private ImageView f87076a;

    /* renamed from: b */
    private RecyclerView f87077b;

    /* renamed from: c */
    private C1273i f87078c;

    /* renamed from: d */
    private ElementRecentlyUseAdapter f87079d;

    /* renamed from: e */
    private LoadMoreAdapter f87080e;

    /* renamed from: f */
    private RelativeLayout f87081f;

    /* renamed from: g */
    private C25674b f87082g;

    /* renamed from: h */
    private C33298a f87083h;

    /* renamed from: i */
    private DmtLoadingLayout f87084i;

    /* renamed from: j */
    private DmtTextView f87085j;

    /* renamed from: k */
    private DmtTextView f87086k;

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<MicroAppInfo> list, boolean z) {
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        this.f87084i.setVisibility(0);
    }

    public final void aD_() {
        this.f87080e.mo67986a(1);
    }

    /* renamed from: g */
    public final MoreElementsActivity mo85491g() {
        return (MoreElementsActivity) getActivity();
    }

    public final boolean aR_() {
        if (this.f87080e.f69540a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m107829j() {
        this.f87082g = new C25674b();
        this.f87083h = new C33298a();
        this.f87082g.mo66536a(this.f87083h);
        this.f87082g.mo66537a(this);
    }

    /* renamed from: k */
    private void m107830k() {
        if (this.f87082g != null) {
            this.f87082g.mo56976a(Integer.valueOf(1));
        }
    }

    public final void aP_() {
        this.f87082g.mo56976a(Integer.valueOf(4));
    }

    public final void ae_() {
        this.f87084i.setVisibility(8);
        this.f87085j.setVisibility(0);
        this.f87086k.setVisibility(0);
        this.f87081f.setVisibility(8);
        this.f87077b.setVisibility(8);
    }

    public void onDestroy() {
        if (this.f87082g != null) {
            this.f87082g.mo66535W_();
            this.f87082g.mo59134U_();
        }
        super.onDestroy();
    }

    /* renamed from: i */
    private void m107828i() {
        this.f87078c = new LinearLayoutManager(getContext());
        this.f87079d = new ElementRecentlyUseAdapter(mo85491g());
        this.f87077b.setLayoutManager(this.f87078c);
        this.f87080e = LoadMoreAdapter.m86888a((C1262a<VH>) this.f87079d);
        this.f87077b.setOnFlingListener(new OnRecyclerViewFlingListener(this.f87077b, this));
        this.f87077b.setAdapter(this.f87080e);
    }

    /* renamed from: h */
    private void m107827h() {
        this.f87076a = (ImageView) m107826a((int) R.id.k1);
        this.f87076a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MicroAppRecentlyUseFragment.this.mo85491g().mo85434a(this);
            }
        });
        this.f87081f = (RelativeLayout) m107826a((int) R.id.d0j);
        this.f87081f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MicroAppRecentlyUseFragment.this.mo85491g().mo85429a("recently");
            }
        });
        this.f87084i = (DmtLoadingLayout) m107826a((int) R.id.btw);
        this.f87077b = (RecyclerView) m107826a((int) R.id.cqj);
        this.f87085j = (DmtTextView) m107826a((int) R.id.e76);
        this.f87086k = (DmtTextView) m107826a((int) R.id.e71);
        m107828i();
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        this.f87080e.mo67986a(z ? 1 : 0);
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        this.f87084i.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f87080e.mo67986a(2);
    }

    /* renamed from: a */
    private <T extends View> T m107826a(int i) {
        View view = getView();
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m107829j();
        m107827h();
        m107830k();
    }

    /* renamed from: b */
    public final void mo59108b(List<MicroAppInfo> list, boolean z) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f87079d.mo85449a(list);
        }
        this.f87080e.mo67986a(z ? 1 : 0);
    }

    /* renamed from: a */
    public final void mo59099a(List<MicroAppInfo> list, boolean z) {
        this.f87084i.setVisibility(8);
        this.f87085j.setVisibility(8);
        this.f87086k.setVisibility(8);
        this.f87081f.setVisibility(0);
        this.f87077b.setVisibility(0);
        this.f87079d.mo85449a(list);
        this.f87080e.mo67986a(z ? 1 : 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.qd, viewGroup, false);
    }
}
