package com.p280ss.android.ugc.aweme.anchor;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.anchor.AnchorBaseFragment.C22505a;
import com.p280ss.android.ugc.aweme.anchor.p1007a.C22523c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.MultiTypeAdapter;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSelectionFragment */
public final class AnchorSelectionFragment extends AnchorBaseFragment implements C25675c<Object>, C28532n {

    /* renamed from: d */
    private C22540c f59986d;

    /* renamed from: e */
    private C22519a f59987e;

    /* renamed from: f */
    private MultiTypeAdapter f59988f;

    /* renamed from: g */
    private LoadMoreAdapter<C1293v> f59989g;

    /* renamed from: h */
    private HashMap f59990h;

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSelectionFragment$a */
    static final class C22517a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnchorSelectionFragment f59991a;

        C22517a(AnchorSelectionFragment anchorSelectionFragment) {
            this.f59991a = anchorSelectionFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f59991a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSelectionFragment$b */
    static final class C22518b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnchorSelectionFragment f59992a;

        C22518b(AnchorSelectionFragment anchorSelectionFragment) {
            this.f59992a = anchorSelectionFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22543d dVar = this.f59992a.f59956a;
            if (dVar != null) {
                dVar.mo59095b();
            }
        }
    }

    /* renamed from: a */
    public final View mo59096a(int i) {
        if (this.f59990h == null) {
            this.f59990h = new HashMap();
        }
        View view = (View) this.f59990h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59990h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void aE_() {
    }

    /* renamed from: b */
    public final void mo59097b() {
        if (this.f59990h != null) {
            this.f59990h.clear();
        }
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<?> list, boolean z) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo59097b();
    }

    public final void aD_() {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59989g;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(1);
        }
    }

    public final boolean aR_() {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59989g;
        if (loadMoreAdapter == null || loadMoreAdapter.f69540a != 0) {
            return true;
        }
        return false;
    }

    public final void onDestroy() {
        C22519a aVar = this.f59987e;
        if (aVar != null) {
            aVar.mo59134U_();
            aVar.mo66535W_();
        }
        super.onDestroy();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo59096a((int) R.id.btv);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_layout");
        dmtLoadingLayout.setVisibility(0);
    }

    public final void aP_() {
        C22519a aVar = this.f59987e;
        if (aVar != null) {
            aVar.mo56976a(Integer.valueOf(4));
        }
    }

    /* renamed from: g */
    private final void m74466g() {
        this.f59986d = new C22540c(C22505a.m74423a().getTYPE());
        this.f59987e = new C22519a();
        C22519a aVar = this.f59987e;
        if (aVar != null) {
            aVar.mo66537a(this);
        }
        C22519a aVar2 = this.f59987e;
        if (aVar2 != null) {
            aVar2.mo66536a(this.f59986d);
        }
    }

    public final void ae_() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo59096a((int) R.id.btv);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_layout");
        dmtLoadingLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo59096a((int) R.id.bhe);
        C7573i.m23582a((Object) linearLayout, "layout_empty");
        linearLayout.setVisibility(0);
    }

    /* renamed from: h */
    private final void m74467h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        MultiTypeAdapter multiTypeAdapter;
        DmtTextView dmtTextView = (DmtTextView) mo59096a((int) R.id.e7d);
        C7573i.m23582a((Object) dmtTextView, "txt_title");
        Context context = getContext();
        if (context != null) {
            charSequence = context.getString(C22505a.m74423a().title());
        } else {
            charSequence = null;
        }
        dmtTextView.setText(charSequence);
        DmtTextView dmtTextView2 = (DmtTextView) mo59096a((int) R.id.e6l);
        C7573i.m23582a((Object) dmtTextView2, "txt_element_search_hint");
        Context context2 = getContext();
        if (context2 != null) {
            charSequence2 = context2.getString(C22505a.m74423a().searchHint());
        } else {
            charSequence2 = null;
        }
        dmtTextView2.setText(charSequence2);
        ((ImageView) mo59096a((int) R.id.ayu)).setOnClickListener(new C22517a(this));
        ((RelativeLayout) mo59096a((int) R.id.tr)).setOnClickListener(new C22518b(this));
        C22523c adapterFactory = C22505a.m74423a().adapterFactory();
        if (adapterFactory != null) {
            multiTypeAdapter = adapterFactory.mo59138a((Activity) getActivity(), "enter_page");
        } else {
            multiTypeAdapter = null;
        }
        this.f59988f = multiTypeAdapter;
        this.f59989g = LoadMoreAdapter.m86888a((C1262a<VH>) this.f59988f);
        RecyclerView recyclerView = (RecyclerView) mo59096a((int) R.id.cqp);
        C7573i.m23582a((Object) recyclerView, "recycler_view");
        recyclerView.setAdapter(this.f59989g);
        RecyclerView recyclerView2 = (RecyclerView) mo59096a((int) R.id.cqp);
        C7573i.m23582a((Object) recyclerView2, "recycler_view");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView3 = (RecyclerView) mo59096a((int) R.id.cqp);
        C7573i.m23582a((Object) recyclerView3, "recycler_view");
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = (RecyclerView) mo59096a((int) R.id.cqp);
        C7573i.m23582a((Object) recyclerView4, "recycler_view");
        recyclerView4.setOnFlingListener(new OnRecyclerViewFlingListener((RecyclerView) mo59096a((int) R.id.cqp), this));
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59989g;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(z ? 1 : 0);
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59989g;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(2);
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59989g;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(2);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m74466g();
        m74467h();
        C22519a aVar = this.f59987e;
        if (aVar != null) {
            aVar.mo56976a(Integer.valueOf(1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59108b(java.util.List<java.lang.Object> r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x002a
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0011
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r1 = 0
            goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 != 0) goto L_0x002a
            me.drakeet.multitype.MultiTypeAdapter r1 = r3.f59988f
            if (r1 == 0) goto L_0x0021
            java.util.List<?> r1 = r1.f123129a
            if (r1 == 0) goto L_0x0021
            int r1 = r1.size()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            me.drakeet.multitype.MultiTypeAdapter r2 = r3.f59988f
            if (r2 == 0) goto L_0x002b
            r2.mo11418a(r4)
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter<android.support.v7.widget.RecyclerView$v> r2 = r3.f59989g
            if (r2 == 0) goto L_0x0032
            r2.mo67986a(r5)
        L_0x0032:
            com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter<android.support.v7.widget.RecyclerView$v> r5 = r3.f59989g
            if (r5 == 0) goto L_0x0042
            if (r4 == 0) goto L_0x003e
            int r4 = r4.size()
            int r0 = r4 - r1
        L_0x003e:
            r5.notifyItemRangeInserted(r1, r0)
            return
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.anchor.AnchorSelectionFragment.mo59108b(java.util.List, boolean):void");
    }

    /* renamed from: a */
    public final void mo59099a(List<Object> list, boolean z) {
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            RecyclerView recyclerView = (RecyclerView) mo59096a((int) R.id.cqp);
            C7573i.m23582a((Object) recyclerView, "recycler_view");
            recyclerView.setVisibility(0);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo59096a((int) R.id.btv);
            C7573i.m23582a((Object) dmtLoadingLayout, "loading_layout");
            dmtLoadingLayout.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) mo59096a((int) R.id.bhe);
            C7573i.m23582a((Object) linearLayout, "layout_empty");
            linearLayout.setVisibility(8);
            MultiTypeAdapter multiTypeAdapter = this.f59988f;
            if (multiTypeAdapter != null) {
                multiTypeAdapter.mo11418a(list);
            }
            LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59989g;
            if (loadMoreAdapter != null) {
                loadMoreAdapter.mo67986a(z ? 1 : 0);
            }
            MultiTypeAdapter multiTypeAdapter2 = this.f59988f;
            if (multiTypeAdapter2 != null) {
                multiTypeAdapter2.notifyDataSetChanged();
            }
            C6907h.m21524a("gc_label_page_show", (Map) C22984d.m75611a().mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210").mo59973a("position", "enter_page").f60753a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ab, viewGroup, false);
    }
}
