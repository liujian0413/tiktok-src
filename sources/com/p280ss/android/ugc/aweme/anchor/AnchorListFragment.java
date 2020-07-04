package com.p280ss.android.ugc.aweme.anchor;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22528c;
import com.p280ss.android.ugc.aweme.anchor.p1007a.C22520a;
import com.p280ss.android.ugc.aweme.anchor.p1007a.C22523c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.MultiTypeAdapter;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorListFragment */
public final class AnchorListFragment extends Fragment implements C25675c<C22528c>, C28532n {

    /* renamed from: a */
    public static final C22506a f59958a = new C22506a(null);

    /* renamed from: b */
    private C22540c f59959b;

    /* renamed from: c */
    private C25674b<C22540c> f59960c;

    /* renamed from: d */
    private C22523c f59961d;

    /* renamed from: e */
    private MultiTypeAdapter f59962e;

    /* renamed from: f */
    private LoadMoreAdapter<C1293v> f59963f;

    /* renamed from: g */
    private HashMap f59964g;

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorListFragment$a */
    public static final class C22506a {
        private C22506a() {
        }

        public /* synthetic */ C22506a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AnchorListFragment m74437a(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("CATEGORY", str);
            AnchorListFragment anchorListFragment = new AnchorListFragment();
            anchorListFragment.setArguments(bundle);
            return anchorListFragment;
        }
    }

    /* renamed from: a */
    private View m74425a(int i) {
        if (this.f59964g == null) {
            this.f59964g = new HashMap();
        }
        View view = (View) this.f59964g.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59964g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: i */
    private void m74428i() {
        if (this.f59964g != null) {
            this.f59964g.clear();
        }
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<C22528c> list, boolean z) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m74428i();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final void aD_() {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59963f;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(1);
        }
    }

    public final boolean aR_() {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59963f;
        if (loadMoreAdapter == null || loadMoreAdapter.f69540a != 0) {
            return true;
        }
        return false;
    }

    public final void onDestroy() {
        C25674b<C22540c> bVar = this.f59960c;
        if (bVar != null) {
            bVar.mo59134U_();
            bVar.mo66535W_();
        }
        super.onDestroy();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) m74425a((int) R.id.btv);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_layout");
        dmtLoadingLayout.setVisibility(0);
    }

    public final void aP_() {
        C25674b<C22540c> bVar = this.f59960c;
        if (bVar != null) {
            bVar.mo56976a(Integer.valueOf(4));
        }
    }

    public final void ae_() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) m74425a((int) R.id.btv);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_layout");
        dmtLoadingLayout.setVisibility(8);
    }

    /* renamed from: g */
    private final void m74426g() {
        this.f59959b = new C22540c(10);
        this.f59960c = new C25674b<>();
        C25674b<C22540c> bVar = this.f59960c;
        if (bVar != null) {
            bVar.mo66537a(this);
        }
        C25674b<C22540c> bVar2 = this.f59960c;
        if (bVar2 != null) {
            bVar2.mo66536a(this.f59959b);
        }
    }

    /* renamed from: h */
    private final void m74427h() {
        this.f59963f = LoadMoreAdapter.m86888a((C1262a<VH>) this.f59962e);
        RecyclerView recyclerView = (RecyclerView) m74425a((int) R.id.cqp);
        C7573i.m23582a((Object) recyclerView, "recycler_view");
        recyclerView.setAdapter(this.f59963f);
        RecyclerView recyclerView2 = (RecyclerView) m74425a((int) R.id.cqp);
        C7573i.m23582a((Object) recyclerView2, "recycler_view");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView3 = (RecyclerView) m74425a((int) R.id.cqp);
        C7573i.m23582a((Object) recyclerView3, "recycler_view");
        recyclerView3.setOnFlingListener(new OnRecyclerViewFlingListener((RecyclerView) m74425a((int) R.id.cqp), this));
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59963f;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(z ? 1 : 0);
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59963f;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(2);
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59963f;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(2);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f59961d = new C22520a();
        m74426g();
        m74427h();
        C25674b<C22540c> bVar = this.f59960c;
        if (bVar != null) {
            bVar.mo56976a(Integer.valueOf(1));
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<C22528c> list, boolean z) {
        boolean z2;
        if (list != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                MultiTypeAdapter multiTypeAdapter = this.f59962e;
                if (multiTypeAdapter != null) {
                    multiTypeAdapter.mo11418a(list);
                }
            }
        }
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59963f;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(z ? 1 : 0);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<C22528c> list, boolean z) {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) m74425a((int) R.id.btv);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_layout");
        dmtLoadingLayout.setVisibility(8);
        MultiTypeAdapter multiTypeAdapter = this.f59962e;
        if (multiTypeAdapter != null) {
            if (list == null) {
                C7573i.m23580a();
            }
            multiTypeAdapter.mo11418a(list);
        }
        LoadMoreAdapter<C1293v> loadMoreAdapter = this.f59963f;
        if (loadMoreAdapter != null) {
            loadMoreAdapter.mo67986a(z ? 1 : 0);
        }
        MultiTypeAdapter multiTypeAdapter2 = this.f59962e;
        if (multiTypeAdapter2 != null) {
            multiTypeAdapter2.notifyDataSetChanged();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return LayoutInflater.from(getActivity()).inflate(R.layout.n6, viewGroup, false);
    }
}
