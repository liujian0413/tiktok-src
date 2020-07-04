package com.p280ss.android.ugc.aweme.anchor;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.anchor.AnchorBaseFragment.C22505a;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22526a;
import com.p280ss.android.ugc.aweme.anchor.binder.C22534a;
import com.p280ss.android.ugc.aweme.anchor.binder.base.cell.SearchItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.cell.SearchItemViewBinder.C22537a;
import com.p280ss.android.ugc.aweme.anchor.p1007a.C22523c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25367k;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import p1886me.drakeet.multitype.MultiTypeAdapter;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment */
public final class AnchorSearchFragment extends AnchorBaseFragment implements C25675c<C22526a>, C28532n {

    /* renamed from: e */
    public static final C22507a f59965e = new C22507a(null);

    /* renamed from: d */
    public MultiTypeAdapter f59966d;

    /* renamed from: f */
    private C25674b<C22532b> f59967f;

    /* renamed from: g */
    private C22532b f59968g;

    /* renamed from: h */
    private MultiTypeAdapter f59969h;

    /* renamed from: i */
    private C22508b f59970i = new C22508b();

    /* renamed from: j */
    private HashMap f59971j;

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$a */
    public static final class C22507a {
        private C22507a() {
        }

        public /* synthetic */ C22507a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$b */
    public final class C22508b {

        /* renamed from: b */
        private final Keva f59973b = Keva.getRepo("search_history");

        /* renamed from: b */
        public final void mo59119b() {
            this.f59973b.erase("search_history");
        }

        /* renamed from: a */
        public final String[] mo59118a() {
            String[] stringArray = this.f59973b.getStringArray("search_history", new String[0]);
            C7573i.m23582a((Object) stringArray, "keva.getStringArray(SEARCH_HISTORY, arrayOf())");
            return stringArray;
        }

        public C22508b() {
        }

        /* renamed from: a */
        public final void mo59117a(String str) {
            C7573i.m23587b(str, "history");
            String[] strArr = {str};
            String[] stringArray = this.f59973b.getStringArray("search_history", new String[0]);
            C7573i.m23582a((Object) stringArray, "keva.getStringArray(SEARCH_HISTORY, arrayOf())");
            Object[] array = C7525m.m23505c((Iterable<? extends T>) C7519g.m23453g((T[]) C7519g.m23422a((T[]) strArr, (T[]) stringArray)), 10).toArray(new String[0]);
            if (array != null) {
                this.f59973b.storeStringArray("search_history", (String[]) array);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: b */
        public final String[] mo59120b(String str) {
            C7573i.m23587b(str, "history");
            String[] stringArray = this.f59973b.getStringArray("search_history", new String[0]);
            C7573i.m23582a((Object) stringArray, "keva\n                   …EARCH_HISTORY, arrayOf())");
            Collection arrayList = new ArrayList();
            for (String str2 : stringArray) {
                if (!TextUtils.equals(str2, str)) {
                    arrayList.add(str2);
                }
            }
            Object[] array = ((List) arrayList).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                this.f59973b.storeStringArray("search_history", strArr);
                return strArr;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$c */
    public static final class C22509c implements C22534a<String> {

        /* renamed from: a */
        final /* synthetic */ MultiTypeAdapter f59974a;

        /* renamed from: b */
        final /* synthetic */ AnchorSearchFragment f59975b;

        C22509c(MultiTypeAdapter multiTypeAdapter, AnchorSearchFragment anchorSearchFragment) {
            this.f59974a = multiTypeAdapter;
            this.f59975b = anchorSearchFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo59121a(View view, String str) {
            C7573i.m23587b(view, "view");
            C7573i.m23587b(str, "item");
            this.f59975b.mo59112a((CharSequence) str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$d */
    public static final class C22510d implements C22537a {

        /* renamed from: a */
        final /* synthetic */ MultiTypeAdapter f59976a;

        /* renamed from: b */
        final /* synthetic */ AnchorSearchFragment f59977b;

        /* renamed from: a */
        public final void mo59122a(String str) {
            C7573i.m23587b(str, "keyWord");
            this.f59976a.mo11418a(this.f59977b.mo59111a(str));
            this.f59976a.notifyDataSetChanged();
        }

        C22510d(MultiTypeAdapter multiTypeAdapter, AnchorSearchFragment anchorSearchFragment) {
            this.f59976a = multiTypeAdapter;
            this.f59977b = anchorSearchFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$e */
    static final class C22511e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnchorSearchFragment f59978a;

        C22511e(AnchorSearchFragment anchorSearchFragment) {
            this.f59978a = anchorSearchFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f59978a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$f */
    public static final class C22512f implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ AnchorSearchFragment f59979a;

        C22512f(AnchorSearchFragment anchorSearchFragment) {
            this.f59979a = anchorSearchFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3 && i != 4 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return false;
            }
            this.f59979a.mo59116j();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$g */
    public static final class C22513g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AnchorSearchFragment f59980a;

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C22513g(AnchorSearchFragment anchorSearchFragment) {
            this.f59980a = anchorSearchFragment;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C7573i.m23587b(editable, "s");
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageView imageView = (ImageView) this.f59980a.mo59096a((int) R.id.d0p);
                C7573i.m23582a((Object) imageView, "search_delete");
                imageView.setVisibility(4);
                return;
            }
            ImageView imageView2 = (ImageView) this.f59980a.mo59096a((int) R.id.d0p);
            C7573i.m23582a((Object) imageView2, "search_delete");
            imageView2.setVisibility(0);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
            RecyclerView recyclerView = (RecyclerView) this.f59980a.mo59096a((int) R.id.cqk);
            C7573i.m23582a((Object) recyclerView, "recycler_search_history");
            recyclerView.setVisibility(0);
            this.f59980a.mo59113g();
            this.f59980a.mo59115i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$h */
    static final class C22514h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnchorSearchFragment f59981a;

        C22514h(AnchorSearchFragment anchorSearchFragment) {
            this.f59981a = anchorSearchFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((EditText) this.f59981a.mo59096a((int) R.id.d0q)).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSearchFragment$i */
    static final class C22515i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnchorSearchFragment f59982a;

        C22515i(AnchorSearchFragment anchorSearchFragment) {
            this.f59982a = anchorSearchFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59982a.mo59114h();
            MultiTypeAdapter multiTypeAdapter = this.f59982a.f59966d;
            if (multiTypeAdapter != null) {
                List<?> list = multiTypeAdapter.f123129a;
                if (list != null) {
                    list.clear();
                }
            }
            MultiTypeAdapter multiTypeAdapter2 = this.f59982a.f59966d;
            if (multiTypeAdapter2 != null) {
                multiTypeAdapter2.notifyDataSetChanged();
            }
            DmtTextView dmtTextView = (DmtTextView) this.f59982a.mo59096a((int) R.id.wk);
            C7573i.m23582a((Object) dmtTextView, "clear_all_histories");
            dmtTextView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final View mo59096a(int i) {
        if (this.f59971j == null) {
            this.f59971j = new HashMap();
        }
        View view = (View) this.f59971j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59971j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
    }

    public final void aD_() {
    }

    public final void aE_() {
    }

    public final boolean aR_() {
        return false;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo59097b() {
        if (this.f59971j != null) {
            this.f59971j.clear();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
    }

    /* renamed from: b */
    public final void mo59108b(List<C22526a> list, boolean z) {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<C22526a> list, boolean z) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo59097b();
    }

    public final void onDestroy() {
        C25674b<C22532b> bVar = this.f59967f;
        if (bVar != null) {
            bVar.mo59134U_();
            bVar.mo66535W_();
        }
        super.onDestroy();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo59096a((int) R.id.btw);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_list");
        dmtLoadingLayout.setVisibility(0);
    }

    public final void aP_() {
        C25674b<C22532b> bVar = this.f59967f;
        if (bVar != null) {
            bVar.mo56976a(Integer.valueOf(4));
        }
    }

    /* renamed from: h */
    public final void mo59114h() {
        this.f59970i.mo59119b();
        DmtTextView dmtTextView = (DmtTextView) mo59096a((int) R.id.wk);
        C7573i.m23582a((Object) dmtTextView, "clear_all_histories");
        dmtTextView.setVisibility(0);
    }

    /* renamed from: m */
    private final void m74440m() {
        EditText editText = (EditText) mo59096a((int) R.id.d0q);
        C7573i.m23582a((Object) editText, "search_edit");
        editText.setFocusable(true);
        EditText editText2 = (EditText) mo59096a((int) R.id.d0q);
        C7573i.m23582a((Object) editText2, "search_edit");
        editText2.setFocusableInTouchMode(true);
        ((EditText) mo59096a((int) R.id.d0q)).requestFocus();
        C25367k.m83411a(getContext(), (EditText) mo59096a((int) R.id.d0q));
    }

    /* renamed from: i */
    public final void mo59115i() {
        List e = C7519g.m23449e((T[]) this.f59970i.mo59118a());
        MultiTypeAdapter multiTypeAdapter = this.f59966d;
        if (multiTypeAdapter != null) {
            multiTypeAdapter.mo11418a(e);
        }
        MultiTypeAdapter multiTypeAdapter2 = this.f59966d;
        if (multiTypeAdapter2 != null) {
            multiTypeAdapter2.notifyDataSetChanged();
        }
        if (e.size() > 2) {
            DmtTextView dmtTextView = (DmtTextView) mo59096a((int) R.id.wk);
            C7573i.m23582a((Object) dmtTextView, "clear_all_histories");
            dmtTextView.setVisibility(0);
        }
    }

    /* renamed from: k */
    private final void m74438k() {
        MultiTypeAdapter multiTypeAdapter;
        MultiTypeAdapter multiTypeAdapter2 = new MultiTypeAdapter();
        SearchItemViewBinder searchItemViewBinder = new SearchItemViewBinder(getActivity());
        searchItemViewBinder.f60022a = new C22509c(multiTypeAdapter2, this);
        searchItemViewBinder.f60028c = new C22510d(multiTypeAdapter2, this);
        multiTypeAdapter2.mo120457a(String.class, searchItemViewBinder);
        this.f59966d = multiTypeAdapter2;
        C22523c adapterFactory = C22505a.m74423a().adapterFactory();
        if (adapterFactory != null) {
            multiTypeAdapter = adapterFactory.mo59138a((Activity) getActivity(), "search_result");
        } else {
            multiTypeAdapter = null;
        }
        this.f59969h = multiTypeAdapter;
        this.f59967f = new C25674b<>();
        this.f59968g = new C22532b();
        C25674b<C22532b> bVar = this.f59967f;
        if (bVar != null) {
            bVar.mo66537a(this);
        }
        C25674b<C22532b> bVar2 = this.f59967f;
        if (bVar2 != null) {
            bVar2.mo66536a(this.f59968g);
        }
    }

    public final void ae_() {
        DmtTextView dmtTextView = (DmtTextView) mo59096a((int) R.id.e79);
        C7573i.m23582a((Object) dmtTextView, "txt_search_result_empty");
        dmtTextView.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) mo59096a((int) R.id.e78);
        C7573i.m23582a((Object) dmtTextView2, "txt_search_no_context");
        dmtTextView2.setVisibility(0);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo59096a((int) R.id.btw);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_list");
        dmtLoadingLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo59096a((int) R.id.cql);
        C7573i.m23582a((Object) recyclerView, "recycler_search_result");
        recyclerView.setVisibility(8);
    }

    /* renamed from: g */
    public final void mo59113g() {
        DmtTextView dmtTextView = (DmtTextView) mo59096a((int) R.id.e79);
        C7573i.m23582a((Object) dmtTextView, "txt_search_result_empty");
        dmtTextView.setVisibility(8);
        DmtTextView dmtTextView2 = (DmtTextView) mo59096a((int) R.id.e78);
        C7573i.m23582a((Object) dmtTextView2, "txt_search_no_context");
        dmtTextView2.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo59096a((int) R.id.cql);
        C7573i.m23582a((Object) recyclerView, "recycler_search_result");
        recyclerView.setVisibility(8);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo59096a((int) R.id.btw);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_list");
        dmtLoadingLayout.setVisibility(8);
    }

    /* renamed from: j */
    public final void mo59116j() {
        C25674b<C22532b> bVar = this.f59967f;
        if (bVar != null) {
            EditText editText = (EditText) mo59096a((int) R.id.d0q);
            C7573i.m23582a((Object) editText, "search_edit");
            String obj = editText.getText().toString();
            if (obj != null) {
                String obj2 = C7634n.m23762b(obj).toString();
                if (!TextUtils.isEmpty(obj2)) {
                    bVar.mo56976a(Integer.valueOf(1), obj2);
                    RecyclerView recyclerView = (RecyclerView) mo59096a((int) R.id.cqk);
                    C7573i.m23582a((Object) recyclerView, "recycler_search_history");
                    recyclerView.setVisibility(8);
                    DmtTextView dmtTextView = (DmtTextView) mo59096a((int) R.id.wk);
                    C7573i.m23582a((Object) dmtTextView, "clear_all_histories");
                    dmtTextView.setVisibility(8);
                    C25367k.m83414b(getContext(), (EditText) mo59096a((int) R.id.d0q));
                    this.f59970i.mo59117a(obj2);
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: l */
    private final void m74439l() {
        String str;
        ((DmtTextView) mo59096a((int) R.id.sy)).setOnClickListener(new C22511e(this));
        EditText editText = (EditText) mo59096a((int) R.id.d0q);
        C7573i.m23582a((Object) editText, "search_edit");
        Context context = getContext();
        if (context != null) {
            str = context.getString(C22505a.m74423a().searchHint());
        } else {
            str = null;
        }
        editText.setHint(str);
        EditText editText2 = (EditText) mo59096a((int) R.id.d0q);
        C7573i.m23582a((Object) editText2, "search_edit");
        editText2.setImeOptions(3);
        EditText editText3 = (EditText) mo59096a((int) R.id.d0q);
        C7573i.m23582a((Object) editText3, "search_edit");
        editText3.setInputType(1);
        ((EditText) mo59096a((int) R.id.d0q)).setOnEditorActionListener(new C22512f(this));
        ((EditText) mo59096a((int) R.id.d0q)).addTextChangedListener(new C22513g(this));
        m74440m();
        ((ImageView) mo59096a((int) R.id.d0p)).setOnClickListener(new C22514h(this));
        ((DmtTextView) mo59096a((int) R.id.wk)).setOnClickListener(new C22515i(this));
        RecyclerView recyclerView = (RecyclerView) mo59096a((int) R.id.cql);
        C7573i.m23582a((Object) recyclerView, "recycler_search_result");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) mo59096a((int) R.id.cql);
        C7573i.m23582a((Object) recyclerView2, "recycler_search_result");
        recyclerView2.setAdapter(this.f59969h);
        RecyclerView recyclerView3 = (RecyclerView) mo59096a((int) R.id.cqk);
        C7573i.m23582a((Object) recyclerView3, "recycler_search_history");
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView4 = (RecyclerView) mo59096a((int) R.id.cqk);
        C7573i.m23582a((Object) recyclerView4, "recycler_search_history");
        recyclerView4.setAdapter(this.f59966d);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m74438k();
        m74439l();
        mo59115i();
    }

    /* renamed from: a */
    public final void mo59112a(CharSequence charSequence) {
        ((EditText) mo59096a((int) R.id.d0q)).setText(charSequence);
        ((EditText) mo59096a((int) R.id.d0q)).setSelection(charSequence.length());
        mo59116j();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            EditText editText = (EditText) mo59096a((int) R.id.d0q);
            C7573i.m23582a((Object) editText, "search_edit");
            editText.getText().clear();
            C25367k.m83414b(getContext(), (EditText) mo59096a((int) R.id.d0q));
        }
    }

    /* renamed from: a */
    public final List<String> mo59111a(String str) {
        String[] b = this.f59970i.mo59120b(str);
        if (b.length <= 2) {
            DmtTextView dmtTextView = (DmtTextView) mo59096a((int) R.id.wk);
            C7573i.m23582a((Object) dmtTextView, "clear_all_histories");
            dmtTextView.setVisibility(8);
        }
        return C7519g.m23449e((T[]) b);
    }

    /* renamed from: a */
    public final void mo59099a(List<C22526a> list, boolean z) {
        DmtTextView dmtTextView = (DmtTextView) mo59096a((int) R.id.e79);
        C7573i.m23582a((Object) dmtTextView, "txt_search_result_empty");
        dmtTextView.setVisibility(8);
        DmtTextView dmtTextView2 = (DmtTextView) mo59096a((int) R.id.e78);
        C7573i.m23582a((Object) dmtTextView2, "txt_search_no_context");
        dmtTextView2.setVisibility(8);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo59096a((int) R.id.btw);
        C7573i.m23582a((Object) dmtLoadingLayout, "loading_list");
        dmtLoadingLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo59096a((int) R.id.cql);
        C7573i.m23582a((Object) recyclerView, "recycler_search_result");
        boolean z2 = false;
        recyclerView.setVisibility(0);
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            MultiTypeAdapter multiTypeAdapter = this.f59969h;
            if (multiTypeAdapter != null) {
                multiTypeAdapter.mo11418a(list);
            }
            MultiTypeAdapter multiTypeAdapter2 = this.f59969h;
            if (multiTypeAdapter2 != null) {
                multiTypeAdapter2.notifyDataSetChanged();
            }
            C6907h.m21524a("gc_label_page_show", (Map) C22984d.m75611a().mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210").mo59973a("position", "search_result").f60753a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.aa, viewGroup, false);
    }
}
