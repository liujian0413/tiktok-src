package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
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
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.ElementAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.MoreElementsFragment */
public class MoreElementsFragment<E, VH extends C1293v> extends Fragment implements C25675c<E>, C28532n {

    /* renamed from: a */
    DmtTextView f87090a;

    /* renamed from: b */
    DmtTextView f87091b;

    /* renamed from: c */
    ImageView f87092c;

    /* renamed from: d */
    RelativeLayout f87093d;

    /* renamed from: e */
    DmtLoadingLayout f87094e;

    /* renamed from: f */
    RecyclerView f87095f;

    /* renamed from: g */
    C1273i f87096g;

    /* renamed from: h */
    ElementAdapter<E, VH> f87097h;

    /* renamed from: i */
    LoadMoreAdapter f87098i;

    /* renamed from: j */
    C25674b f87099j;

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<E> list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo85487i() {
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
        this.f87094e.setVisibility(0);
    }

    public final void aD_() {
        this.f87098i.mo67986a(1);
    }

    public final void ae_() {
        this.f87094e.setVisibility(8);
    }

    /* renamed from: j */
    public final MoreElementsActivity mo85494j() {
        return (MoreElementsActivity) getActivity();
    }

    public final boolean aR_() {
        if (this.f87098i.f69540a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m107846k() {
        if (this.f87099j != null) {
            this.f87099j.mo56976a(Integer.valueOf(1));
        }
    }

    public final void aP_() {
        this.f87099j.mo56976a(Integer.valueOf(4));
    }

    public void onDestroy() {
        if (this.f87099j != null) {
            this.f87099j.mo59134U_();
            this.f87099j.mo66535W_();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo85486h() {
        this.f87095f = (RecyclerView) m107845a((int) R.id.cqm);
        this.f87096g = new LinearLayoutManager(getContext());
        this.f87095f.setLayoutManager(this.f87096g);
        this.f87095f.setOnFlingListener(new OnRecyclerViewFlingListener(this.f87095f, this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo85485g() {
        this.f87092c = (ImageView) m107845a((int) R.id.jy);
        this.f87092c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MoreElementsFragment.this.getActivity().onBackPressed();
            }
        });
        this.f87093d = (RelativeLayout) m107845a((int) R.id.tr);
        this.f87093d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MoreElementsFragment.this.mo85494j().mo85429a("polymerization");
            }
        });
        this.f87094e = (DmtLoadingLayout) m107845a((int) R.id.btw);
        this.f87090a = (DmtTextView) m107845a((int) R.id.dkh);
        this.f87091b = (DmtTextView) m107845a((int) R.id.e6l);
        mo85486h();
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        this.f87098i.mo67986a(z ? 1 : 0);
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        this.f87094e.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f87098i.mo67986a(2);
    }

    /* renamed from: a */
    private <T extends View> T m107845a(int i) {
        View view = getView();
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo85487i();
        mo85485g();
        m107846k();
    }

    /* renamed from: a */
    public void mo59099a(List<E> list, boolean z) {
        this.f87094e.setVisibility(8);
        this.f87097h.mo85448a(list);
        this.f87098i.mo67986a(z ? 1 : 0);
    }

    /* renamed from: b */
    public final void mo59108b(List<E> list, boolean z) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f87097h.mo85448a(list);
        }
        this.f87098i.mo67986a(z ? 1 : 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.p0, viewGroup, false);
    }
}
